package ObjectOrientedConcept.Hotel;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        Guest guest1 = new Guest("Alice", "G001");
        Guest guest2 = new Guest("Bob", "G002");

        Employee employee1 = new Employee("John", "E001", "Manager");
        Employee employee2 = new Employee("Jane", "E002", "Receptionist");

        Room room1 = new Room("101", "Single", 100.00);
        Room room2 = new Room("102", "Double", 150.00);

        hotel.addGuest(guest1);
        hotel.addGuest(guest2);
        hotel.addEmployee(employee1);
        hotel.addEmployee(employee2);
        hotel.addRoom(room1);
        hotel.addRoom(room2);

        Booking booking1 = new Booking("B001", guest1, LocalDate.now(), LocalDate.now().plusDays(3));
        booking1.addRoom(room1);

        Booking booking2 = new Booking("B002", guest2, LocalDate.now(), LocalDate.now().plusDays(2));
        booking2.addRoom(room2);

        hotel.addBooking(booking1);
        hotel.addBooking(booking2);

        System.out.println(hotel);
    }
}
