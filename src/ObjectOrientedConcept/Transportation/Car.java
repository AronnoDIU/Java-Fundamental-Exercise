package ObjectOrientedConcept.Transportation;

public class Car extends Vehicle {
    private final int numberOfDoors;

    public Car(String licensePlate, String model, int numberOfDoors) {
        super(licensePlate, model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public String toString() {
        return "Car [numberOfDoors=" + numberOfDoors + ", " + super.toString() + "]";
    }
}
