/**
 * Defines a contract specific to trucks. It includes methods for
 * managing cargo capacity and the vehicle's transmission type.
 */
public interface TruckVehicle {
    /**
     * Sets the cargo capacity of the truck.
     * @param capacity The capacity in tons.
     */
    void setCargoCapacity(double capacity);

    /**
     * Retrieves the cargo capacity of the truck.
     * @return The capacity in tons.
     */
    double getCargoCapacity();

    /**
     * Sets the transmission type of the truck.
     * @param transmission The transmission type (e.g., "Manual", "Automatic").
     */
    void setTransmissionType(String transmission);

    /**
     * Retrieves the transmission type of the truck.
     * @return The transmission type.
     */
    String getTransmissionType();
}
