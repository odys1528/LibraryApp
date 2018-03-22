package odys.com.data;

public class Library {
    public static final int MAX_BOOKS = 1000;
    private Book[] books;
    private int booksNumber;

    public Book[] getBooks() {
        return books;
    }

    public int getBooksNumber() {
        return booksNumber;
    }

    public Library() {
        books = new Book[MAX_BOOKS];
    }

    public void addBook(Book book) {
        if(booksNumber < MAX_BOOKS) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("Maksymalna liczba książek została osiągnięta.");
        }
    }

    public void printBooks() {
        if (booksNumber == 0) {
            System.out.println("Brak książek w bibliotece.");
        }
        for(int i=0; i<booksNumber; i++) {
            books[i].printInfo();
        }
    }
}
