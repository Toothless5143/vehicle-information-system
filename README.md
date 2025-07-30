# Vehicle Information System

A simple, command-line based application for managing a fleet of vehicles. This project demonstrates core Object-Oriented Programming (OOP) principles in Java, with a strong focus on using interfaces to create a flexible and scalable system. It allows users to add and view details for different types of vehicles, including cars, motorcycles, and trucks.

## Features

-   **Multi-Vehicle Support:** Handles Cars, Motorcycles, and Trucks, each with unique attributes.
-   **Interactive CLI:** A user-friendly menu-driven interface for easy operation.
-   **Robust Input Validation:** Gracefully handles invalid user inputs (e.g., text instead of numbers) to prevent application crashes.
-   **Modular and Extensible Design:** Utilizes interfaces (`Vehicle`, `CarVehicle`, etc.) to define clear contracts, making it easy to add new vehicle types in the future.
-   **Clear and Documented Code:** The codebase is well-commented and follows standard Java conventions for readability and maintenance.

## Project Structure

The project is organized into interfaces that define behavior and classes that implement it, promoting a clean separation of concerns.

-   **Interfaces:**
    -   `Vehicle.java`: The base interface for all vehicles, defining common methods like `getMake()`, `getModel()`, and `getYear()`.
    -   `CarVehicle.java`: An interface for car-specific attributes (number of doors, fuel type).
    -   `MotorVehicle.java`: An interface for motorcycle-specific attributes (number of wheels, motorcycle type).
    -   `TruckVehicle.java`: An interface for truck-specific attributes (cargo capacity, transmission type).
-   **Classes:**
    -   `Car.java`: A concrete class implementing `Vehicle` and `CarVehicle`.
    -   `Motorcycle.java`: A concrete class implementing `Vehicle` and `MotorVehicle`.
    -   `Truck.java`: A concrete class implementing `Vehicle` and `TruckVehicle`.
-   **Main Application:**
    -   `VehicleInformationSystem.java`: The entry point of the application, containing the main loop and user interaction logic.

## Technologies Used

-   **Java**
-   **Java Development Kit (JDK) 8+**

## How to Run

Follow these steps to compile and run the project from your terminal.

#### 1. Prerequisites

Make sure you have a **Java Development Kit (JDK)** version 8 or later installed on your system. You can verify this by running:
```sh
java -version
```

#### 2. Clone the Repository

```sh
git clone https://github.com/Toothless5143/vehicle-information-system.git
cd vehicle-information-system
```
*(Replace `your-username` with your actual GitHub username)*

#### 3. Compile the Code

Navigate to the project's root directory and compile all the Java source files:
```sh
javac *.java
```
This will generate `.class` files for each `.java` file.

#### 4. Run the Application

After successful compilation, run the main program:
```sh
java VehicleInformationSystem
```
The application will start, and you will see the main menu in your terminal.

## Usage Example

Here is a sample interaction with the program:

```
--- Vehicle Information System Menu ---
1. Create a Car
2. Create a Motorcycle
3. Create a Truck
4. Exit
---------------------------------------
Enter your choice: 1

--- Enter Car Details ---
Enter Make: Toyota
Enter Model: Camry
Enter Year of Manufacture: 2023
Enter Number of Doors: 4
Enter Fuel Type (Petrol, Diesel, Electric): Petrol

--- Car Details ---
Make: Toyota
Model: Camry
Year: 2023
Number of Doors: 4
Fuel Type: Petrol
-------------------

--- Vehicle Information System Menu ---
1. Create a Car
2. Create a Motorcycle
3. Create a Truck
4. Exit
---------------------------------------
Enter your choice: 4
Exiting the Vehicle Information System. Goodbye!
```

The application also handles incorrect input gracefully:
```
--- Enter Car Details ---
Enter Make: Ford
Enter Model: F-150
Enter Year of Manufacture: two-thousand-twenty
Invalid input. Please enter a whole number.
Enter Year of Manufacture: 2022
Enter Number of Doors: four
Invalid input. Please enter a whole number.
Enter Number of Doors: 4
...
```

## Code Principles

This project was built with the following OOP principles in mind:

-   **Abstraction:** The `Vehicle` interface abstracts the common properties and behaviors of all vehicles, hiding complex implementation details.
-   **Encapsulation:** Vehicle data is kept private within the classes and is only accessible through public getter and setter methods.
-   **Interface-based Design:** The use of interfaces ensures that all vehicle classes adhere to a specific "contract," which enforces consistency and allows for a scalable architecture.

## Contributing

Contributions are welcome! If you have ideas for improvements or find a bug, please feel free to open an issue or submit a pull request.

## License

This project is licensed under the **MIT License**. See the `LICENSE` file for more details.
