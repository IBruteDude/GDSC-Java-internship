package Library;

import java.util.List;

public class Book extends Borrowable {
    private final String bookTitle;
    private final String bookISBN;
    private String contents;

    public Book(String title, String isbn) {
        bookTitle = title;
        bookISBN = isbn;
    }
    public void setContents(String newContents)
    {
        contents = newContents;
    }
    public String getContents()
    {
        return contents;
    }
    public String getBookTitle()
    {
        return bookTitle;
    }
    public String getBookISBN()
    {
        return bookISBN;
    }

}
