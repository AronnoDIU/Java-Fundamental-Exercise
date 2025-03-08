package ObjectOrientedConcept.Restaurant;

public class Customer extends Person {
    public Customer(String name, String id) {
        super(name, id);
    }

    @Override
    public String toString() {
        return "Customer [" + super.toString() + "]";
    }
}
