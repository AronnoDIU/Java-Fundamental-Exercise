package ExceptionHandling.FlightBooking;

public class SeatNotAvailableException extends BookingException {
    public SeatNotAvailableException(String message) {
        super(message);
    }
}
