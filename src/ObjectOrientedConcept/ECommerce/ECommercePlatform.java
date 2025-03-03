package ObjectOrientedConcept.ECommerce;

import java.util.ArrayList;
import java.util.List;

public class ECommercePlatform {
    private final List<Customer> customers = new ArrayList<>();
    private final List<Order> orders = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public List<Customer> getCustomers() {
        return new ArrayList<>(customers);
    }

    public List<Order> getOrders() {
        return new ArrayList<>(orders);
    }

    @Override
    public String toString() {
        return "ECommercePlatform [customers=" + customers + ", orders=" + orders + "]";
    }
}
