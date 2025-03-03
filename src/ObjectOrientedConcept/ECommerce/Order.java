package ObjectOrientedConcept.ECommerce;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    private final Customer customer;
    private final List<Item> items;
    private final BigDecimal totalAmount;

    public Order(Customer customer, List<Item> items) {
        this.customer = customer;
        this.items = items;
        this.totalAmount = calculateTotalAmount();
    }

    private BigDecimal calculateTotalAmount() {
        return items.stream()
                .map(Item::price)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Order [customer=" + customer + ", items=" + items + ", totalAmount=" + totalAmount + "]";
    }
}
