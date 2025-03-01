package ObjectOrientedConcept.Banking;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Customer customer1 = new Customer("Alice", "C001");
        Customer customer2 = new Customer("Bob", "C002");

        SavingsAccount savingsAccount = new SavingsAccount("SA001", BigDecimal.valueOf(1000), BigDecimal.valueOf(0.03));
        Account checkingAccount = new CheckingAccount("CA001", BigDecimal.valueOf(500), BigDecimal.valueOf(200));

        customer1.addAccount(savingsAccount);
        customer2.addAccount(checkingAccount);

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        System.out.println(bank);

        savingsAccount.applyInterest();
        checkingAccount.withdraw(BigDecimal.valueOf(600));

        System.out.println(bank);
    }
}
