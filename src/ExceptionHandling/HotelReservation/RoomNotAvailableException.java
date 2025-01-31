package ExceptionHandling.HotelReservation;

public class RoomNotAvailableException extends ReservationException {
    public RoomNotAvailableException(String message) {
        super(message);
    }
}
