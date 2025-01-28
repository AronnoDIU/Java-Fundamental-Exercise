package ExceptionHandling.Authentication;

public class Main {
    public static void main(String[] args) {
        AuthenticationService authService = new AuthenticationService();
        authService.registerUser("user1", "password1");

        try {
            authService.authenticate("user1", "password1");
            System.out.println("Authentication successful");
        } catch (AuthenticationException e) {
            System.err.println(e.getMessage());
        }

        try {
            authService.authenticate("user1", "wrongpassword");
        } catch (AuthenticationException e) {
            System.err.println(e.getMessage());
        }

        try {
            authService.authenticate("user2", "password2");
        } catch (AuthenticationException e) {
            System.err.println(e.getMessage());
        }
    }
}
