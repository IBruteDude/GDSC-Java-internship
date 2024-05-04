package Library;

public class Magazine extends Borrowable {
    private final String magTitle;
    private final String magISBN;
    private String contents;

    public Magazine(String title, String isbn) {
        magTitle = title;
        magISBN = isbn;
    }

    public void setContents(String newContents) {
        contents = newContents;
    }

    public String getContents() {
        return contents;
    }

    public String getISBN() {
        return magISBN;
    }

    public String getTitle() {
        return magTitle;
    }
}
