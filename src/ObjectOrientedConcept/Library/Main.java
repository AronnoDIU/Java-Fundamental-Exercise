package ObjectOrientedConcept.Library;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");

        library.addBook(book1);
        library.addBook(book2);
        library.addMember(member1);
        library.addMember(member2);

        Loan loan1 = new Loan(book1, member1, LocalDate.now(), LocalDate.now().plusDays(14));
        Loan loan2 = new Loan(book2, member2, LocalDate.now(), LocalDate.now().plusDays(14));

        System.out.println(loan1);
        System.out.println(loan2);
    }
}
