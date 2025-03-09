package ObjectOrientedConcept.Hotel;

public class Employee extends Person {
    private final String position;

    public Employee(String name, String id, String position) {
        super(name, id);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee [position=" + position + ", " + super.toString() + "]";
    }
}
