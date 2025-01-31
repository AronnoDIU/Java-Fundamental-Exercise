package ExceptionHandling.HotelReservation;

public class Main {
    public static void main(String[] args) {
        HotelService hotelService = new HotelService();
        Room room1 = new Room("101", true);
        hotelService.addRoom(room1);

        try {
            Reservation reservation1 = new Reservation("res1", "101");
            hotelService.addReservation(reservation1);
            System.out.println("Reservation successful");
        } catch (ReservationException e) {
            System.err.println(e.getMessage());
        }

        try {
            Reservation reservation2 = new Reservation("res2", "101");
            hotelService.addReservation(reservation2);
        } catch (ReservationException e) {
            System.err.println(e.getMessage());
        }

        try {
            hotelService.cancelReservation("res1");
            System.out.println("Reservation cancelled successfully");
        } catch (ReservationException e) {
            System.err.println(e.getMessage());
        }
    }
}
