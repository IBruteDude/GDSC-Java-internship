package Library;

import java.util.ArrayList;
import java.util.List;

public class DVD extends Borrowable {
    private final String dvdTitle;
    private final String dvdISBN;
    private List<Byte> contents = new ArrayList<>();

    public DVD(String title, String isbn) {
        dvdTitle = title;
        dvdISBN = isbn;
    }

    public void setContents(List<Byte> newContents) {
        contents = newContents;
    }

    public List<Byte> getContents() {
        return contents;
    }

    public String getISBN() {
        return dvdISBN;
    }

    public String getTitle() {
        return dvdTitle;
    }
}
