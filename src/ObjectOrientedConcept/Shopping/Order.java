package ObjectOrientedConcept.Shopping;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    private final User user;
    private final List<Product> products;
    private final BigDecimal totalPrice;

    public Order(User user) {
        this.user = user;
        this.products = user.getCart().getProducts();
        this.totalPrice = user.getCart().getTotalPrice();
    }

    public User getUser() {
        return user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order [user=" + user + ", products=" + products + ", totalPrice=" + totalPrice + "]";
    }
}
