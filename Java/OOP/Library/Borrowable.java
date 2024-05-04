package Library;

public abstract class Borrowable {
    protected String libraryId;
    protected boolean borrowed = false;

    public boolean isAvailable() {
        return !this.borrowed;
    }

    abstract public String getTitle();

    abstract public String getISBN();

    public void borrow() {
        assert !borrowed;
        borrowed = true;
    }

    public void returnBack() {
        assert borrowed;
        borrowed = false;
    }
}
