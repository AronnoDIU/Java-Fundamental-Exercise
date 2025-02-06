package Polymorphism.BankingSystem;

public class SavingsAccount extends Account {
    private final double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            deposit(-amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }

    @Override
    public void printAccountType() {
        System.out.println("Savings Account");
    }
}
