package ExceptionHandling.LibraryManagement;

public class BookNotFoundException extends LibraryException {
    public BookNotFoundException(String message) {
        super(message);
    }
}
