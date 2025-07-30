/**
 * Represents a motorcycle, providing a concrete implementation of the Vehicle
 * and MotorVehicle interfaces. It stores all relevant details for a motorcycle.
 */
public class Motorcycle implements Vehicle, MotorVehicle {
    private String make;
    private String model;
    private int year;
    private int numberOfWheels;
    private String motorcycleType;

    public Motorcycle(String make, String model, int year) {
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
    public void setNumberOfWheels(int wheels) { this.numberOfWheels = wheels; }

    @Override
    public int getNumberOfWheels() { return this.numberOfWheels; }

    @Override
    public void setMotorcycleType(String type) { this.motorcycleType = type; }

    @Override
    public String getMotorcycleType() { return this.motorcycleType; }

    /**
     * Displays all details of the motorcycle to the console.
     */
    public void displayDetails() {
        System.out.println("\n--- Motorcycle Details ---");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Motorcycle Type: " + getMotorcycleType());
        System.out.println("--------------------------");
    }
}
