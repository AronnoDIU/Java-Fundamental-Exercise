package ObjectOrientedConcept.Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();
    private final List<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public List<Member> getMembers() {
        return new ArrayList<>(members);
    }

    @Override
    public String toString() {
        return "Library [books=" + books + ", members=" + members + "]";
    }
}
