package ExceptionHandling.HotelReservation;

import java.util.HashMap;
import java.util.Map;

public class HotelService {
    private final Map<String, Room> rooms;
    private final Map<String, Reservation> reservations;

    public HotelService() {
        rooms = new HashMap<>();
        reservations = new HashMap<>();
    }

    public void addRoom(Room room) {
        rooms.put(room.getRoomNumber(), room);
    }

    public void addReservation(Reservation reservation) throws ReservationException {
        Room room = rooms.get(reservation.roomNumber());
        if (room == null) {
            throw new InvalidReservationException("Invalid room number: " + reservation.roomNumber());
        }
        if (!room.isAvailable()) {
            throw new RoomNotAvailableException("Room not available: " + reservation.roomNumber());
        }
        room.setAvailable(false);
        reservations.put(reservation.reservationId(), reservation);
    }

    public void cancelReservation(String reservationId) throws ReservationException {
        Reservation reservation = reservations.get(reservationId);
        if (reservation == null) {
            throw new InvalidReservationException("Invalid reservation ID: " + reservationId);
        }
        Room room = rooms.get(reservation.roomNumber());
        if (room != null) {
            room.setAvailable(true);
        }
        reservations.remove(reservationId);
    }
}
