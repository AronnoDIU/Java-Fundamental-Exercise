package ExceptionHandling.LibraryManagement;

import Generic.GenericLinkedList;

public record User(String userId, String name) {
    public GenericLinkedList<Book> borrowedBooks() {
        return null;
    }
}
