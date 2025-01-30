package ExceptionHandling.LibraryManagement;

public class Main {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();
        Book book1 = new Book("1234567890", "Effective Java");
        User user1 = new User("user1", "John Doe");

        libraryService.addBook(book1);
        libraryService.addUser(user1);

        try {
            libraryService.borrowBook("user1", "1234567890");
            System.out.println("Book borrowed successfully");
        } catch (LibraryException e) {
            System.err.println(e.getMessage());
        }

        try {
            libraryService.borrowBook("user1", "0987654321");
        } catch (LibraryException e) {
            System.err.println(e.getMessage());
        }

        try {
            libraryService.borrowBook("user2", "1234567890");
        } catch (LibraryException e) {
            System.err.println(e.getMessage());
        }
    }
}
