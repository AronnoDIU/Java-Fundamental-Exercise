package ObjectOrientedConcept.Transportation;

public record Driver(String name, String driverId) {

    @Override
    public String toString() {
        return "Driver [name=" + name + ", driverId=" + driverId + "]";
    }
}
