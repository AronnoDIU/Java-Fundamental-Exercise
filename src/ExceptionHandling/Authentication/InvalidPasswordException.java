package ExceptionHandling.Authentication;

public class InvalidPasswordException extends AuthenticationException {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
