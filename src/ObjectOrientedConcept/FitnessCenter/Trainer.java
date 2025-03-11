package ObjectOrientedConcept.FitnessCenter;

public class Trainer extends Person {
    private final String specialty;

    public Trainer(String name, String id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public String toString() {
        return "Trainer [specialty=" + specialty + ", " + super.toString() + "]";
    }
}
