package Polymorphism.BankingSystem;

public abstract class Transaction {
    private final String transactionId;
    private final double amount;

    public Transaction(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public abstract void execute(Account account);
}
