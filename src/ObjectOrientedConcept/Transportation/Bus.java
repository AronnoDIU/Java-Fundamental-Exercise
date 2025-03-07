package ObjectOrientedConcept.Transportation;

public class Bus extends Vehicle {
    private final int seatingCapacity;

    public Bus(String licensePlate, String model, int seatingCapacity) {
        super(licensePlate, model);
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Bus engine started.");
    }

    @Override
    public String toString() {
        return "Bus [seatingCapacity=" + seatingCapacity + ", " + super.toString() + "]";
    }
}
