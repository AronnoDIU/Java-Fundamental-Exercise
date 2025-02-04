package Encapsulation.Banking;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Customer customer1 = new Customer("Alice");
        Account account1 = new Account("ACC123", 1000);
        customer1.addAccount(account1);

        Customer customer2 = new Customer("Bob");
        Account account2 = new Account("ACC456", 500);
        customer2.addAccount(account2);

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        try {
            bank.transferFunds("ACC123", "ACC456", 200);
            System.out.println("Transfer successful");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println("Alice's balance: " + customer1.getAccount("ACC123").getBalance());
            System.out.println("Bob's balance: " + customer2.getAccount("ACC456").getBalance());
        } catch (AccountNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
