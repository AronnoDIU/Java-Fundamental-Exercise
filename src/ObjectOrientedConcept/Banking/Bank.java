package ObjectOrientedConcept.Banking;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return new ArrayList<>(customers);
    }

    @Override
    public String toString() {
        return "Bank [customers=" + customers + "]";
    }
}
