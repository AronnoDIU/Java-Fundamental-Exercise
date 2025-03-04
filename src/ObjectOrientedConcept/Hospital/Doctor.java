package ObjectOrientedConcept.Hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person {
    private final String specialization;
    private final List<Appointment> appointments = new ArrayList<>();

    public Doctor(String name, String id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public List<Appointment> getAppointments() {
        return new ArrayList<>(appointments);
    }

    @Override
    public String toString() {
        return "Doctor [specialization=" + specialization + ", name=" + getName() + ", id=" + getId() + "]";
    }
}
