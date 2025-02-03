package ExceptionHandling.FlightBooking;

public class FlightNotFoundException extends BookingException {
    public FlightNotFoundException(String message) {
        super(message);
    }
}
