package ObjectOrientedConcept.Library;

public record Book(String title, String author, String isbn) {

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
    }
}
