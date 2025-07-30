/**
 * Represents a truck, providing a concrete implementation of the Vehicle
 * and TruckVehicle interfaces. It stores all relevant details for a truck.
 */
public class Truck implements Vehicle, TruckVehicle {
    private String make;
    private String model;
    private int year;
    private double cargoCapacity;
    private String transmissionType;

    public Truck(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String getMake() { return this.make; }

    @Override
    public String getModel() { return this.model; }

    @Override
    public int getYear() { return this.year; }

    @Override
    public void setCargoCapacity(double capacity) { this.cargoCapacity = capacity; }

    @Override
    public double getCargoCapacity() { return this.cargoCapacity; }

    @Override
    public void setTransmissionType(String transmission) { this.transmissionType = transmission; }

    @Override
    public String getTransmissionType() { return this.transmissionType; }

    /**
     * Displays all details of the truck to the console.
     */
    public void displayDetails() {
        System.out.println("\n--- Truck Details ---");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Cargo Capacity (tons): " + getCargoCapacity());
        System.out.println("Transmission Type: " + getTransmissionType());
        System.out.println("---------------------");
    }
}
