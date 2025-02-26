package ObjectOrientedConcept.Shopping;

public class User {
    private final String name;
    private final String email;
    private final Cart cart;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.cart = new Cart();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Cart getCart() {
        return cart;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", email=" + email + ", cart=" + cart + "]";
    }
}
