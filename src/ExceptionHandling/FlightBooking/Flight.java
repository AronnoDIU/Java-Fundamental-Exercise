package ExceptionHandling.FlightBooking;

public class Flight {
    private final String flightNumber;
    private int availableSeats;

    public Flight(String flightNumber, int availableSeats) {
        this.flightNumber = flightNumber;
        this.availableSeats = availableSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void bookSeat() throws SeatNotAvailableException {
        if (availableSeats <= 0) {
            throw new SeatNotAvailableException("No seats available for flight: " + flightNumber);
        }
        availableSeats--;
    }
}
