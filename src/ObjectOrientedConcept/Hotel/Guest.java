package ObjectOrientedConcept.Hotel;

public class Guest extends Person {
    public Guest(String name, String id) {
        super(name, id);
    }

    @Override
    public String toString() {
        return "Guest [" + super.toString() + "]";
    }
}
