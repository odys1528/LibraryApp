package odys.com.data;

import java.util.Arrays;

public class Library {
    public static final int MAX_PUBLICATIONS = 2000;
    private Publication[] publications;
    private int publicationsNumber;

    public Publication[] getPublications() {
        return publications;
    }

    public int getPublicationsNumber() {
        return publicationsNumber;
    }

    public void setPublications(Publication[] publications) {
        this.publications = publications;
    }

    public Library() {
        setPublications(new Publication[MAX_PUBLICATIONS]);
    }

    public void addBook(Book book) {
        addPublication(book);
    }

    public void addMagazine(Magazine magazine) {
        addPublication(magazine);
    }

    private void addPublication(Publication publication) {
        if (publicationsNumber == MAX_PUBLICATIONS) {
            throw new ArrayIndexOutOfBoundsException("Maksymalna liczba publikacja została osiągnięta.");
        }
        publications[publicationsNumber] = publication;
        publicationsNumber++;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<publicationsNumber; i++) {
            builder.append(publications[i]);
            builder.append("\n");
        }
        return builder.toString();
    }
}
