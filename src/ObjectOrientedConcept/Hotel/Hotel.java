package ObjectOrientedConcept.Hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private final List<Guest> guests = new ArrayList<>();
    private final List<Employee> employees = new ArrayList<>();
    private final List<Room> rooms = new ArrayList<>();
    private final List<Booking> bookings = new ArrayList<>();

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public List<Guest> getGuests() {
        return new ArrayList<>(guests);
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public List<Room> getRooms() {
        return new ArrayList<>(rooms);
    }

    public List<Booking> getBookings() {
        return new ArrayList<>(bookings);
    }

    @Override
    public String toString() {
        return "Hotel [guests=" + guests + ", employees=" + employees + ", rooms=" + rooms + ", bookings=" + bookings + "]";
    }
}
