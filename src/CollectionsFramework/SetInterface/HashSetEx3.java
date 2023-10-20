package CollectionsFramework.SetInterface;

import java.util.HashSet;

// We are adding books to set and printing all the books.
public class HashSetEx3 {
    public static void main(String[] args) {
        HashSet<Book> bookHashSet= new HashSet<>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to HashSet
        bookHashSet.add(b1);
        bookHashSet.add(b2);
        bookHashSet.add(b3);
        //Traversing HashSet
        for(Book b:bookHashSet){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
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