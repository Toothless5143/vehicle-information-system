import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main class for the Vehicle Information System.
 * This program provides a menu-driven interface for a user to enter details
 * for different types of vehicles (Car, Motorcycle, Truck) and displays the
 * information. It robustly handles user input to prevent crashes.
 */
public class VehicleInformationSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            printMenu();
            int choice = getIntInput(scanner, "Enter your choice: ");

            switch (choice) {
                case 1:
                    createCar(scanner);
                    break;
                case 2:
                    createMotorcycle(scanner);
                    break;
                case 3:
                    createTruck(scanner);
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Exiting the Vehicle Information System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        scanner.close();
    }

    /**
     * Prints the main menu options to the console.
     */
    public static void printMenu() {
        System.out.println("\n--- Vehicle Information System Menu ---");
        System.out.println("1. Create a Car");
        System.out.println("2. Create a Motorcycle");
        System.out.println("3. Create a Truck");
        System.out.println("4. Exit");
        System.out.println("---------------------------------------");
    }

    /**
     * Manages the creation and display of a Car object based on user input.
     * @param scanner The Scanner object to read user input.
     */
    private static void createCar(Scanner scanner) {
        System.out.println("\n--- Enter Car Details ---");
        System.out.print("Enter Make: ");
        String make = scanner.nextLine();
        System.out.print("Enter Model: ");
        String model = scanner.nextLine();
        int year = getIntInput(scanner, "Enter Year of Manufacture: ");
        int doors = getIntInput(scanner, "Enter Number of Doors: ");
        System.out.print("Enter Fuel Type (Petrol, Diesel, Electric): ");
        String fuelType = scanner.nextLine();

        Car car = new Car(make, model, year);
        car.setNumberOfDoors(doors);
        car.setFuelType(fuelType);
        car.displayDetails();
    }

    /**
     * Manages the creation and display of a Motorcycle object.
     * @param scanner The Scanner object to read user input.
     */
    private static void createMotorcycle(Scanner scanner) {
        System.out.println("\n--- Enter Motorcycle Details ---");
        System.out.print("Enter Make: ");
        String make = scanner.nextLine();
        System.out.print("Enter Model: ");
        String model = scanner.nextLine();
        int year = getIntInput(scanner, "Enter Year of Manufacture: ");
        int wheels = getIntInput(scanner, "Enter Number of Wheels: ");
        System.out.print("Enter Motorcycle Type (Sport, Cruiser, Off-road): ");
        String type = scanner.nextLine();

        Motorcycle motorcycle = new Motorcycle(make, model, year);
        motorcycle.setNumberOfWheels(wheels);
        motorcycle.setMotorcycleType(type);
        motorcycle.displayDetails();
    }

    /**
     * Manages the creation and display of a Truck object.
     * @param scanner The Scanner object to read user input.
     */
    private static void createTruck(Scanner scanner) {
        System.out.println("\n--- Enter Truck Details ---");
        System.out.print("Enter Make: ");
        String make = scanner.nextLine();
        System.out.print("Enter Model: ");
        String model = scanner.nextLine();
        int year = getIntInput(scanner, "Enter Year of Manufacture: ");
        double capacity = getDoubleInput(scanner, "Enter Cargo Capacity (in tons): ");
        System.out.print("Enter Transmission Type (Manual, Automatic): ");
        String transmission = scanner.nextLine();

        Truck truck = new Truck(make, model, year);
        truck.setCargoCapacity(capacity);
        truck.setTransmissionType(transmission);
        truck.displayDetails();
    }

    /**
     * A robust helper method to get an integer input from the user.
     * It handles InputMismatchException and re-prompts the user until a valid integer is entered.
     * @param scanner The Scanner object for reading input.
     * @param prompt The message to display to the user.
     * @return The valid integer entered by the user.
     */
    private static int getIntInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character to prevent input errors
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.nextLine(); // Clear the invalid input from the scanner buffer
            }
        }
    }

    /**
     * A robust helper method to get a double input from the user.
     * It handles InputMismatchException and re-prompts until valid input is received.
     * @param scanner The Scanner object for reading input.
     * @param prompt The message to display to the user.
     * @return The valid double entered by the user.
     */
    private static double getDoubleInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double value = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number (e.g., 12.5).");
                scanner.nextLine(); // Clear the invalid input
            }
        }
    }
}
