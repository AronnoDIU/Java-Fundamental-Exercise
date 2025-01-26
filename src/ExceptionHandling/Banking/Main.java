package ExceptionHandling.Banking;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount account1 = new BankAccount("12345", 1000);
        BankAccount account2 = new BankAccount("67890", 500);

        bank.addAccount(account1);
        bank.addAccount(account2);

        try {
            bank.transfer("12345", "67890", 200);
            System.out.println("Transfer successful");
        } catch (AccountNotFoundException | InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }

        try {
            bank.transfer("12345", "67890", 2000);
        } catch (AccountNotFoundException | InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }

        try {
            bank.transfer("12345", "11111", 100);
        } catch (AccountNotFoundException | InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }
    }
}
