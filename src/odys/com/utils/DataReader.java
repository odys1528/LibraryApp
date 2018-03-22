package odys.com.utils;

import odys.com.data.Book;
import odys.com.data.Magazine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataReader {
    private Scanner scanner;

    public DataReader() {
        scanner = new Scanner(System.in);
    }

    public void close() {
        scanner.close();
    }

    public int getInt() throws NumberFormatException {
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new NumberFormatException("Wprowadzona liczba niezgodna z formatem.");
        } finally {
            scanner.nextLine();
        }
        return number;
    }

    public Book readAndCreateBook() {
        System.out.println("Tytuł: ");
        String title = scanner.nextLine();
        System.out.println("Author: ");
        String author = scanner.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = scanner.nextLine();
        System.out.println("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.println("Rok wydania: ");
        int releaseDate = 0;
        int pages = 0;

        try {
            releaseDate = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ilość stron: ");
            pages = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            throw e;
        }

        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }

    public Magazine readAndCreateMagazine() {
        System.out.println("Tytuł: ");
        String title = scanner.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = scanner.nextLine();
        System.out.println("Język: ");
        String language = scanner.nextLine();
        System.out.println("Rok wydania: ");
        int year = 0;
        int month = 0;
        int day = 0;

        try {
            year = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Miesiąc: ");
            month = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Dzień: ");
            day = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            throw e;
        }

        return new Magazine(title, publisher, language, year, month, day);
    }
}
