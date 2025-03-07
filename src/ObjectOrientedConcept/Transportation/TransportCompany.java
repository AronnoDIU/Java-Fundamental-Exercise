package ObjectOrientedConcept.Transportation;

import java.util.ArrayList;
import java.util.List;

public class TransportCompany {
    private final List<Vehicle> vehicles = new ArrayList<>();
    private final List<Driver> drivers = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public List<Vehicle> getVehicles() {
        return new ArrayList<>(vehicles);
    }

    public List<Driver> getDrivers() {
        return new ArrayList<>(drivers);
    }

    @Override
    public String toString() {
        return "TransportCompany [vehicles=" + vehicles + ", drivers=" + drivers + "]";
    }
}
