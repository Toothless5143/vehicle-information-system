/**
 * Defines a contract for all vehicles. Any class that implements this interface
 * must provide a way to retrieve the vehicle's make, model, and year of manufacture.
 * This ensures a common set of functionalities across all vehicle types in the system.
 */
public interface Vehicle {
    /**
     * Retrieves the make of the vehicle.
     * @return A String representing the make of the vehicle (e.g., "Ford").
     */
    String getMake();

    /**
     * Retrieves the model of the vehicle.
     * @return A String representing the model of the vehicle (e.g., "Mustang").
     */
    String getModel();

    /**
     * Retrieves the year of manufacture of the vehicle.
     * @return An integer representing the year.
     */
    int getYear();
}
