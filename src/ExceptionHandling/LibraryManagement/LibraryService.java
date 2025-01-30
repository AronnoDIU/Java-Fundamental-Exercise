package ExceptionHandling.LibraryManagement;

import java.util.HashMap;
import java.util.Map;

public class LibraryService {
    private final Map<String, Book> books;
    private final Map<String, User> users;

    public LibraryService() {
        books = new HashMap<>();
        users = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.isbn(), book);
    }

    public void addUser(User user) {
        users.put(user.userId(), user);
    }

    public Book getBook(String isbn) throws BookNotFoundException {
        Book book = books.get(isbn);
        if (book == null) {
            throw new BookNotFoundException("Book not found: " + isbn);
        }
        return book;
    }

    public User getUser(String userId) throws UserNotFoundException {
        User user = users.get(userId);
        if (user == null) {
            throw new UserNotFoundException("User not found: " + userId);
        }
        return user;
    }

    public void borrowBook(String userId, String isbn) throws LibraryException {
        User user = getUser(userId);
        Book book = getBook(isbn);

        assert user.borrowedBooks() != null;
        if (user.borrowedBooks().contains(book)) {
            throw new LibraryException("User already borrowed the book: " + isbn);
        } else {
            user.borrowedBooks().add(book);
        }

        if (book.quantity() == 0) {
            throw new LibraryException("Book is not available: " + isbn);
        }
    }
}
