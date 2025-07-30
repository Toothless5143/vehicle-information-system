/**
 * Represents a car, providing a concrete implementation of the Vehicle and
 * CarVehicle interfaces. It stores all relevant details for a car.
 */
public class Car implements Vehicle, CarVehicle {
    private String make;
    private String model;
    private int year;
    private int numberOfDoors;
    private String fuelType;

    /**
     * Constructs a new Car with essential information.
     * @param make The make of the car.
     * @param model The model of the car.
     * @param year The year of manufacture.
     */
    public Car(String make, String model, int year) {
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
    public void setNumberOfDoors(int doors) { this.numberOfDoors = doors; }

    @Override
    public int getNumberOfDoors() { return this.numberOfDoors; }

    @Override
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    @Override
    public String getFuelType() { return this.fuelType; }

    /**
     * Displays all details of the car to the console in a formatted way.
     */
    public void displayDetails() {
        System.out.println("\n--- Car Details ---");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Number of Doors: " + getNumberOfDoors());
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("-------------------");
    }
}
