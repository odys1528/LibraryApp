package odys.com.app;

import odys.com.data.Book;
import odys.com.data.Library;
import odys.com.data.Magazine;
import odys.com.utils.DataReader;
import odys.com.utils.LibraryUtils;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import static odys.com.app.Option.*;

public class LibraryControl {
    private DataReader dataReader;
    private Library library;

    public LibraryControl() {
        dataReader = new DataReader();
        library = new Library();
    }

    public void controlLoop() {
        Option option = null;
        while(option != Option.EXIT) {
            try {
                printOptions();
                option = Option.createFromInt(dataReader.getInt());
                switch (option) {
                    case ADD_BOOK:
                        addBook();
                        break;
                    case ADD_MAGAZINE:
                        addMagazine();
                        break;
                    case PRINT_BOOKS:
                        printBooks();
                        break;
                    case PRINT_MAGAZINES:
                        printMagazines();
                        break;
                    case EXIT:
                        ;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono niepoprawne dane.");
            } catch (NumberFormatException | NoSuchElementException e) {
                System.out.println("Wybrana opcja nie istnieje.");
            }
        }
        dataReader.close();
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        for(Option o: Option.values()) {
            System.out.println(o);
        }
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printBooks() {
        LibraryUtils.printBooks(library);
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }

    private void printMagazines() {
        LibraryUtils.printMagazines(library);
    }
}
