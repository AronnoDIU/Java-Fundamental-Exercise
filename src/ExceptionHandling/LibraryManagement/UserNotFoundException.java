package ExceptionHandling.LibraryManagement;

public class UserNotFoundException extends LibraryException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
