package ObjectOrientedConcept.Restaurant;

public record Dish(String name, double price) {

    @Override
    public String toString() {
        return "Dish [name=" + name + ", price=" + price + "]";
    }
}
