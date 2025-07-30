/**
 * Defines a contract specific to car-like vehicles. It specifies methods
 * for handling the number of doors and the vehicle's fuel type.
 */
public interface CarVehicle {
    /**
     * Sets the number of doors for the car.
     * @param doors The number of doors.
     */
    void setNumberOfDoors(int doors);

    /**
     * Retrieves the number of doors the car has.
     * @return The number of doors.
     */
    int getNumberOfDoors();

    /**
     * Sets the fuel type for the car.
     * @param fuelType The type of fuel (e.g., "Petrol", "Diesel", "Electric").
     */
    void setFuelType(String fuelType);

    /**
     * Retrieves the fuel type of the car.
     * @return The fuel type.
     */
    String getFuelType();
}
