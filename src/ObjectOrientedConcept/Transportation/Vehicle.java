package ObjectOrientedConcept.Transportation;

public abstract class Vehicle {
    private final String licensePlate;
    private final String model;

    public Vehicle(String licensePlate, String model) {
        this.licensePlate = licensePlate;
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public abstract void startEngine();

    @Override
    public String toString() {
        return "Vehicle [licensePlate=" + licensePlate + ", model=" + model + "]";
    }
}
