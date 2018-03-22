package odys.com.app;

import odys.com.data.Book;
import odys.com.data.Library;
import odys.com.utils.DataReader;

public class LibraryControl {
    public static final int EXIT = 0;
    public static final int ADD_BOOK = 1;
    public static final int PRINT_BOOKS = 2;

    private DataReader dataReader;
    private Library library;

    public LibraryControl() {
        dataReader = new DataReader();
        library = new Library();
    }

    public void controlLoop() {
        int option;
        printOptions();
        while((option = dataReader.getInt()) != EXIT) {
            switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji.");
            }
            printOptions();
        }
        dataReader.close();
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - dodanie nowej książki");
        System.out.println("2 - wyświetl dostępne książki");
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printBooks() {
        library.printBooks();
    }
}
