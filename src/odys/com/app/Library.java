package odys.com.app;

import odys.com.data.Book;

public class Library {

    public static void main(String[] args) {
	    final String appName = "Biblioteka v.0.5";

	    Book[] books = new Book[1000];
	    books[0] = new Book("W pustyni i w puszczy", "Henryk Sienkiewcz", 2010, 296, "Greg", "9788373271890");
		books[1] = new Book("Java. Efektywne programowanie", "Joshua Bloch", 2009, 352, "Helion", "9780071591065");
		books[2] = new Book("SCJP Sun Certified Programmer for Java 8", "Bert Bates, Katherine Sierra", 2008, 851,
				"McGraw-Hill Osborne Media", "9780071591065");

	    System.out.println(appName);
	    System.out.println("Książki dostępne w bibliotece:");
		books[0].printInfo();
		books[1].printInfo();
		books[2].printInfo();
		System.out.println("System może przechowywać do 1000 książek.");
    }
}
