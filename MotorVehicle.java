/**
 * Defines a contract specific to motorcycles, including methods for the
 * number of wheels and the type of motorcycle.
 */
public interface MotorVehicle {
    /**
     * Sets the number of wheels for the motorcycle.
     * @param wheels The number of wheels.
     */
    void setNumberOfWheels(int wheels);

    /**
     * Retrieves the number of wheels.
     * @return The number of wheels.
     */
    int getNumberOfWheels();

    /**
     * Sets the type of the motorcycle.
     * @param type The type (e.g., "Sport", "Cruiser", "Off-road").
     */
    void setMotorcycleType(String type);

    /**
     * Retrieves the type of the motorcycle.
     * @return The motorcycle type.
     */
    String getMotorcycleType();
}
