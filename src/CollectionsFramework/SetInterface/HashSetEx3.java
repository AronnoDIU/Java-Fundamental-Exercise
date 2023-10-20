package CollectionsFramework.SetInterface;

// We are adding books to set and printing all the books.
public class HashSetEx3 {
    public static void main(String[] args) {

    }
}

class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}