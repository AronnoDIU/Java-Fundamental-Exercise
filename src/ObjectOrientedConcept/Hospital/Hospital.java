package ObjectOrientedConcept.Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private final List<Patient> patients = new ArrayList<>();
    private final List<Doctor> doctors = new ArrayList<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public List<Patient> getPatients() {
        return new ArrayList<>(patients);
    }

    public List<Doctor> getDoctors() {
        return new ArrayList<>(doctors);
    }

    @Override
    public String toString() {
        return "Hospital [patients=" + patients + ", doctors=" + doctors + "]";
    }
}
