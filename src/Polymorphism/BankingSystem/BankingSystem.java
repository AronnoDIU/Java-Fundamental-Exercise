package Polymorphism.BankingSystem;

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 1000.0, 2.5);
        Account checking = new CheckingAccount("CA123", 500.0, 200.0);

        Transaction deposit = new DepositTransaction("T1", 200.0);
        Transaction withdraw = new WithdrawTransaction("T2", 150.0);

        savings.printAccountType();
        deposit.execute(savings);
        withdraw.execute(savings);
        savings.addInterest();
        System.out.println("Savings Account Balance: " + savings.getBalance());

        System.out.println();

        checking.printAccountType();
        deposit.execute(checking);
        withdraw.execute(checking);
        System.out.println("Checking Account Balance: " + checking.getBalance());
    }
}
