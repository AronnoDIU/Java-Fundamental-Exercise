package ExceptionHandling.FlightBooking;

import java.util.HashMap;
import java.util.Map;

public class BookingService {
    private final Map<String, Flight> flights;

    public BookingService() {
        flights = new HashMap<>();
    }

    public void addFlight(Flight flight) {
        flights.put(flight.getFlightNumber(), flight);
    }

    public Flight getFlight(String flightNumber) throws FlightNotFoundException {
        Flight flight = flights.get(flightNumber);
        if (flight == null) {
            throw new FlightNotFoundException("Flight not found: " + flightNumber);
        }
        return flight;
    }

    public void bookFlight(String flightNumber) throws BookingException {
        Flight flight = getFlight(flightNumber);
        flight.bookSeat();
    }
}
