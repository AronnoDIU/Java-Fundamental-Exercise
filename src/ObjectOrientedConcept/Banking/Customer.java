package ObjectOrientedConcept.Banking;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final String customerId;
    private final List<Account> accounts = new ArrayList<>();

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", customerId=" + customerId + ", accounts=" + accounts + "]";
    }
}
