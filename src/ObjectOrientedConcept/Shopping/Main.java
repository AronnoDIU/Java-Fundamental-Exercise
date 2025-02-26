package ObjectOrientedConcept.Shopping;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        User user = new User("John Doe", "john.doe@example.com");
        Product product1 = new Product("Laptop", BigDecimal.valueOf(999.99));
        Product product2 = new Product("Smartphone", BigDecimal.valueOf(499.99));

        user.getCart().addProduct(product1);
        user.getCart().addProduct(product2);

        Order order = new Order(user);

        System.out.println(order);
    }
}
