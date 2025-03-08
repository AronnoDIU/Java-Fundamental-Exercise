package ObjectOrientedConcept.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final String orderId;
    private final Customer customer;
    private final List<Dish> dishes = new ArrayList<>();

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public List<Dish> getDishes() {
        return new ArrayList<>(dishes);
    }

    public double getTotalAmount() {
        return dishes.stream().mapToDouble(Dish::price).sum();
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", customer=" + customer + ", dishes=" + dishes + ", totalAmount=" + getTotalAmount() + "]";
    }
}
