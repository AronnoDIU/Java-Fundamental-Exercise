package ObjectOrientedConcept.ECommerce;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ECommercePlatform platform = new ECommercePlatform();

        Customer customer1 = new Customer("Alice", "alice@example.com");
        Customer customer2 = new Customer("Bob", "bob@example.com");

        platform.addCustomer(customer1);
        platform.addCustomer(customer2);

        Item item1 = new Item("Laptop", BigDecimal.valueOf(999.99));
        Item item2 = new Item("Smartphone", BigDecimal.valueOf(499.99));

        ShoppingCart cart1 = new ShoppingCart();
        cart1.addItem(item1);
        cart1.addItem(item2);

        Order order1 = new Order(customer1, cart1.getItems());
        platform.placeOrder(order1);

        System.out.println(platform);
    }
}
