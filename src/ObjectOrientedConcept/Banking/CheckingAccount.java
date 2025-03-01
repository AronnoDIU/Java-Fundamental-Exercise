package ObjectOrientedConcept.Banking;

import java.math.BigDecimal;

public class CheckingAccount extends Account {
    private final BigDecimal overdraftLimit;

    public CheckingAccount(String accountNumber, BigDecimal initialBalance, BigDecimal overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    public BigDecimal getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0 && getBalance().add(overdraftLimit).compareTo(amount) >= 0) {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount [overdraftLimit=" + overdraftLimit + ", " + super.toString() + "]";
    }
}
