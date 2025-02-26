package ObjectOrientedConcept.Shopping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> products = new ArrayList<>();
    private BigDecimal totalPrice = BigDecimal.ZERO;

    public void addProduct(Product product) {
        products.add(product);
        totalPrice = totalPrice.add(product.price());
    }

    public void removeProduct(Product product) {
        products.remove(product);
        totalPrice = totalPrice.subtract(product.price());
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    @Override
    public String toString() {
        return "Cart [products=" + products + ", totalPrice=" + totalPrice + "]";
    }
}
