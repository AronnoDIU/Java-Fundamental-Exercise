package ExceptionHandling.HotelReservation;

public class InvalidReservationException extends ReservationException {
    public InvalidReservationException(String message) {
        super(message);
    }
}
