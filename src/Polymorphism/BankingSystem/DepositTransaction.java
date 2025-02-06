package Polymorphism.BankingSystem;

public class DepositTransaction extends Transaction {

    public DepositTransaction(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    public void execute(Account account) {
        account.deposit(getAmount());
        System.out.println("Deposit of " + getAmount() + " executed.");
    }
}
