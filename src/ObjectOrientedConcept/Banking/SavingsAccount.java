package ObjectOrientedConcept.Banking;

import java.math.BigDecimal;

public class SavingsAccount extends Account {
    private final BigDecimal interestRate;

    public SavingsAccount(String accountNumber, BigDecimal initialBalance, BigDecimal interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void applyInterest() {
        BigDecimal interest = getBalance().multiply(interestRate);
        deposit(interest);
    }

    @Override
    public String toString() {
        return "SavingsAccount [interestRate=" + interestRate + ", " + super.toString() + "]";
    }
}
