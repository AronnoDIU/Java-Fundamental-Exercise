package ObjectOrientedConcept.Hospital;

import java.time.LocalDateTime;

public record Appointment(Patient patient, Doctor doctor, LocalDateTime appointmentTime) {

    @Override
    public String toString() {
        return "Appointment [patient=" + patient.getName() + ", doctor=" + doctor.getName() + ", appointmentTime=" + appointmentTime + "]";
    }
}
