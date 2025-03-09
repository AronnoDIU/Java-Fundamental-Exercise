package ObjectOrientedConcept.Hotel;

public record Room(String roomNumber, String type, double pricePerNight) {

    @Override
    public String toString() {
        return "Room [roomNumber=" + roomNumber + ", type=" + type + ", pricePerNight=" + pricePerNight + "]";
    }
}
