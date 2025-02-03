package ExceptionHandling.FlightBooking;

public class Main {
    public static void main(String[] args) {
        BookingService bookingService = new BookingService();
        Flight flight1 = new Flight("FL123", 2);
        bookingService.addFlight(flight1);

        try {
            bookingService.bookFlight("FL123");
            System.out.println("Flight booked successfully");
        } catch (BookingException e) {
            System.err.println(e.getMessage());
        }

        try {
            bookingService.bookFlight("FL123");
            System.out.println("Flight booked successfully");
        } catch (BookingException e) {
            System.err.println(e.getMessage());
        }

        try {
            bookingService.bookFlight("FL123");
        } catch (BookingException e) {
            System.err.println(e.getMessage());
        }

        try {
            bookingService.bookFlight("FL999");
        } catch (BookingException e) {
            System.err.println(e.getMessage());
        }
    }
}
