package ObjectOrientedConcept.Hospital;

public class Patient extends Person {
    private final String medicalHistory;

    public Patient(String name, String id, String medicalHistory) {
        super(name, id);
        this.medicalHistory = medicalHistory;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    @Override
    public String toString() {
        return "Patient [medicalHistory=" + medicalHistory + ", " + super.toString() + "]";
    }
}
