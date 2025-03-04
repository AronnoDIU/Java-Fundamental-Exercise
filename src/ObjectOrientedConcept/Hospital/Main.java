package ObjectOrientedConcept.Hospital;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Patient patient1 = new Patient("Alice", "P001", "No allergies");
        Patient patient2 = new Patient("Bob", "P002", "Diabetic");

        Doctor doctor1 = new Doctor("Dr. Smith", "D001", "Cardiology");
        Doctor doctor2 = new Doctor("Dr. Johnson", "D002", "Neurology");

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        Appointment appointment1 = new Appointment(patient1, doctor1, LocalDateTime.now().plusDays(1));
        Appointment appointment2 = new Appointment(patient2, doctor2, LocalDateTime.now().plusDays(2));

        doctor1.addAppointment(appointment1);
        doctor2.addAppointment(appointment2);

        System.out.println(hospital);
    }
}
