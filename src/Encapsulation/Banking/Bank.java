package Encapsulation.Banking;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private final Map<String, Customer> customers;

    public Bank() {
        customers = new HashMap<>();
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getName(), customer);
    }

    public Customer getCustomer(String name) throws CustomerNotFoundException {
        Customer customer = customers.get(name);
        if (customer == null) {
            throw new CustomerNotFoundException("Customer not found: " + name);
        }
        return customer;
    }

    public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount) throws AccountNotFoundException, InsufficientFundsException {
        Account fromAccount = null;
        Account toAccount = null;

        for (Customer customer : customers.values()) {
            try {
                if (fromAccount == null) {
                    fromAccount = customer.getAccount(fromAccountNumber);
                }
                if (toAccount == null) {
                    toAccount = customer.getAccount(toAccountNumber);
                }
            } catch (AccountNotFoundException e) {
                // Continue searching
            }
        }

        if (fromAccount == null) {
            throw new AccountNotFoundException("From account not found: " + fromAccountNumber);
        }
        if (toAccount == null) {
            throw new AccountNotFoundException("To account not found: " + toAccountNumber);
        }

        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }
}
