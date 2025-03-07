package ObjectOrientedConcept.Transportation;

public class Main {
    public static void main(String[] args) {
        TransportCompany company = new TransportCompany();

        Vehicle car = new Car("ABC123", "Toyota Camry", 4);
        Vehicle bus = new Bus("XYZ789", "Volvo Bus", 50);

        Driver driver1 = new Driver("Alice", "D001");
        Driver driver2 = new Driver("Bob", "D002");

        company.addVehicle(car);
        company.addVehicle(bus);
        company.addDriver(driver1);
        company.addDriver(driver2);

        System.out.println(company);

        car.startEngine();
        bus.startEngine();
    }
}
