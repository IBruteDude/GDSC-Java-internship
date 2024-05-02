package Library;
/*
manage library resources, such as books, magazines, and DVDs.

Books
Magazines
DVD

(e.g., title, author, publication year).

   - Implement methods to perform operations on library resources, such as adding, updating, and deleting items.
   - Implement methods within classes to encapsulate behavior related to library resources (e.g., display information, check availability).
   - Define constructors for classes to initialize object attributes during instantiation
 */

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();
    private final List<Magazine> magazines = new ArrayList<>();
    private final List<DVD> dvds = new ArrayList<>();

    void addBook(Book newBook)
    {
        for (Book book : books) {
            if (newBook.getBookISBN().equals(book.getBookISBN())) {
                throw new Error("duplicate book!");
            }
        }
        books.add(newBook);
    }

    void addMagazine(Magazine newMag)
    {
        for (Magazine mag : magazines) {
            if (newMag.getMagISBN().equals(mag.getMagISBN())) {
                throw new Error("duplicate magazine!");
            }
        }
        magazines.add(newMag);
    }
    void addDVD(DVD newDVD)
    {
        for (DVD dvd : dvds) {
            if (newDVD.getDvdISBN().equals(dvd.getDvdISBN())) {
                throw new Error("duplicate magazine!");
            }
        }
        dvds.add(newDVD);
    }
}
