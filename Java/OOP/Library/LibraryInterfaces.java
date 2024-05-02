package Library;

abstract class Borrowable {
    protected String libraryId;
    protected boolean borrowed = false;
    public boolean isAvailable() {
        return !this.borrowed;
    }
    public void borrow()  {
        assert !borrowed;
        borrowed = true;
    }
    public void returnBack() {
        assert borrowed;
        borrowed = false;
    }
}
