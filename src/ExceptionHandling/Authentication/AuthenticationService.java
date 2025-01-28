package ExceptionHandling.Authentication;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationService {
    private final Map<String, User> users;

    public AuthenticationService() {
        users = new HashMap<>();
    }

    public void registerUser(String username, String password) {
        users.put(username, new User(username, password));
    }

    public void authenticate(String username, String password) throws AuthenticationException {
        User user = users.get(username);
        if (user == null) {
            throw new UserNotFoundException("User not found: " + username);
        }
        if (!user.password().equals(password)) {
            throw new InvalidPasswordException("Invalid password for user: " + username);
        }
    }
}
