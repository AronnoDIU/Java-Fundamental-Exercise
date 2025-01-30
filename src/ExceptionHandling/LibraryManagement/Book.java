package ExceptionHandling.LibraryManagement;

public record Book(String isbn, String title) {
    public int quantity() {
        return 0;
    }
}
