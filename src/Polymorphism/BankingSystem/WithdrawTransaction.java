package Polymorphism.BankingSystem;

public class WithdrawTransaction extends Transaction {

    public WithdrawTransaction(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    public void execute(Account account) {
        account.withdraw(getAmount());
        System.out.println("Withdrawal of " + getAmount() + " executed.");
    }
}
