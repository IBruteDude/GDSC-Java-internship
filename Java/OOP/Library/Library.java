package Library;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import java.util.HashSet;

public class Library {
    private final Set<Book> books = new HashSet<>();
    private final Set<Magazine> magazines = new HashSet<>();
    private final Set<DVD> dvds = new HashSet<>();

    void addBook(Book newBook) {
        if (books.contains(newBook)) {
            throw new Error("Duplicate book!");
        }
        books.add(newBook);
    }

    void addMagazine(Magazine newMag) {
        if (magazines.contains(newMag)) {
            throw new Error("Duplicate magazine!");
        }
        magazines.add(newMag);
    }

    void addDVD(DVD newDVD) {
        if (dvds.contains(newDVD)) {
            throw new Error("Duplicate dvd!");
        }
        dvds.add(newDVD);
    }

    boolean isAvailable(Borrowable libraryBorrowable) {
        return libraryBorrowable.isAvailable();
    }

    boolean isAvailable(String ISBN) throws NoSuchElementException {
        if (books.stream().anyMatch(
                (Book book) -> book.getISBN().equals(ISBN)))
            return true;
        if (magazines.stream().anyMatch(
                (Magazine magazine) -> magazine.getISBN().equals(ISBN)))
            return true;
        if (dvds.stream().anyMatch(
                (DVD dvd) -> dvd.getISBN().equals(ISBN)))
            return true;
        throw new NoSuchElementException("Library item not found!");
    }

    public Book getBook(String ISBN) throws NoSuchElementException {
        return books.stream()
                .filter((Book book) -> book.getISBN().equals(ISBN))
                .findFirst()
                .get();
    }

    public Magazine getMagazine(String ISBN) throws NoSuchElementException {
        return magazines.stream()
                .filter((Magazine mag) -> mag.getISBN().equals(ISBN))
                .findFirst()
                .get();
    }

    public DVD getDVD(String ISBN) throws NoSuchElementException {
        return dvds.stream()
                .filter((DVD dvd) -> dvd.getISBN().equals(ISBN))
                .findFirst()
                .get();
    }

    public boolean removeBook(String ISBN) {
        Optional<Book> foundBook = books.stream()
                .filter((Book book) -> book.getISBN().equals(ISBN))
                .findFirst();
        if (foundBook.isEmpty())
            return false;
        books.remove(foundBook.get());
        return true;
    }

    public boolean removeMagazine(String ISBN) {
        Optional<Magazine> foundMagazine = magazines.stream()
                .filter((Magazine magazine) -> magazine.getISBN().equals(ISBN))
                .findFirst();
        if (foundMagazine.isEmpty())
            return false;
        magazines.remove(foundMagazine.get());
        return true;
    }

    public boolean removeDVD(String ISBN) {
        Optional<DVD> foundDvd = dvds.stream()
                .filter((DVD dvd) -> dvd.getISBN().equals(ISBN))
                .findFirst();
        if (foundDvd.isEmpty())
            return false;
        dvds.remove(foundDvd.get());
        return true;
    }

}
