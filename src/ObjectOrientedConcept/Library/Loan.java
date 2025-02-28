package ObjectOrientedConcept.Library;

import java.time.LocalDate;

public record Loan(Book book, Member member, LocalDate loanDate, LocalDate returnDate) {

    @Override
    public String toString() {
        return "Loan [book=" + book + ", member=" + member + ", loanDate=" + loanDate + ", returnDate=" + returnDate + "]";
    }
}
