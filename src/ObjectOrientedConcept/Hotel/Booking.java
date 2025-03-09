package ObjectOrientedConcept.Hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private final String bookingId;
    private final Guest guest;
    private final List<Room> rooms = new ArrayList<>();
    private final LocalDate checkInDate;
    private final LocalDate checkOutDate;

    public Booking(String bookingId, Guest guest, LocalDate checkInDate, LocalDate checkOutDate) {
        this.bookingId = bookingId;
        this.guest = guest;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Guest getGuest() {
        return guest;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getRooms() {
        return new ArrayList<>(rooms);
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public double getTotalAmount() {
        return rooms.stream().mapToDouble(Room::pricePerNight).sum() * (checkOutDate.toEpochDay() - checkInDate.toEpochDay());
    }

    @Override
    public String toString() {
        return "Booking [bookingId=" + bookingId + ", guest=" + guest + ", rooms=" + rooms + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", totalAmount=" + getTotalAmount() + "]";
    }
}
