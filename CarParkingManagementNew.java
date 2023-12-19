import java.util.HashMap;
import java.util.Scanner;

public class CarParkingManagementNew {
    private static final int MAX_CAPACITY = 10; // Adjust the capacity as needed

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, CarDetails> parkingLot = new HashMap<>();

        while (true) {
            System.out.println("1. Park a car");
            System.out.println("2. Retrieve a car");
            System.out.println("3. Display Parking Lot Status");
            System.out.println("4. Search by Owner's Name");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    if (parkingLot.size() >= MAX_CAPACITY) {
                        System.out.println("Parking lot is full. Cannot park more cars.");
                    } else {
                        parkCar(scanner, parkingLot);
                    }
                    break;
                case 2:
                    retrieveCar(scanner, parkingLot);
                    break;
                case 3:
                    displayParkingLotStatus(parkingLot);
                    break;
                case 4:
                    searchCarByOwnerName(scanner, parkingLot);
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void parkCar(Scanner scanner, HashMap<String, CarDetails> parkingLot) {
        System.out.print("Enter car registration number: ");
        String regNumber = scanner.nextLine();
        if (!isValidRegistrationNumber(regNumber)) {
            System.out.println("Invalid input. Please enter a valid registration number.");
            return;
        }

        if (parkingLot.containsKey(regNumber)) {
            System.out.println("Car with registration number " + regNumber + " is already parked.");
            return;
        }

        System.out.print("Enter car owner's name: ");
        String ownerName = scanner.nextLine();
        if (!isValidOwnerName(ownerName)) {
            System.out.println("Invalid input. Please enter a valid owner's name (letters only).");
            return;
        }

        System.out.print("Enter car color: ");
        String color = scanner.nextLine();
        if (!isValidColor(color)) {
            System.out.println("Invalid input. Please enter a valid car color (letters only and max length 20).");
            return;
        }

        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        if (!isValidString(model)) {
            System.out.println("Invalid input. Please enter a valid car model (max length 50).");
            return;
        }

        CarDetails carDetails = new CarDetails(ownerName, color, model);
        parkingLot.put(regNumber, carDetails);
        System.out.println("Car parked successfully!");
    }

    private static void retrieveCar(Scanner scanner, HashMap<String, CarDetails> parkingLot) {
        System.out.print("Enter car registration number to retrieve: ");
        String regNumberRetrieve = scanner.nextLine();
        if (!isValidRegistrationNumber(regNumberRetrieve)) {
            System.out.println("Invalid input. Please enter a valid registration number.");
            return;
        }

        if (parkingLot.containsKey(regNumberRetrieve)) {
            CarDetails carDetails = parkingLot.get(regNumberRetrieve);
            System.out.println("Car with registration number " + regNumberRetrieve + " belongs to " +
                    carDetails.getOwnerName() + " and has color " + carDetails.getColor() +
                    " and model " + carDetails.getModel() + ".");
            parkingLot.remove(regNumberRetrieve);
            System.out.println("Car retrieved successfully!");
        } else {
            System.out.println("Car with registration number " + regNumberRetrieve +
                    " is not found in the parking lot.");
        }
    }

    private static void displayParkingLotStatus(HashMap<String, CarDetails> parkingLot) {
        System.out.println("Parking Lot Status:");
        if (parkingLot.isEmpty()) {
            System.out.println("No cars parked yet.");
        } else {
            for (String regNumber : parkingLot.keySet()) {
                CarDetails carDetails = parkingLot.get(regNumber);
                System.out.println("Slot " + regNumber + ": " + carDetails.getOwnerName() +
                        "'s car, Color: " + carDetails.getColor() + ", Model: " + carDetails.getModel());
            }
        }
    }

    private static void searchCarByOwnerName(Scanner scanner, HashMap<String, CarDetails> parkingLot) {
        System.out.print("Enter owner's name to search: ");
        String searchOwnerName = scanner.nextLine();
        boolean found = false;
        for (String regNumber : parkingLot.keySet()) {
            CarDetails carDetails = parkingLot.get(regNumber);
            if (carDetails.getOwnerName().equalsIgnoreCase(searchOwnerName)) {
                System.out.println("Car with registration number " + regNumber + " found. Color: " +
                        carDetails.getColor() + ", Model: " + carDetails.getModel());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No car found for owner: " + searchOwnerName);
        }
    }

    private static boolean isValidString(String input) {
        return !input.isEmpty() && input.length() <= 50; // Adjust the length as needed
    }

    private static boolean isValidRegistrationNumber(String regNumber) {
        return !regNumber.isEmpty(); // Allow any input for registration number (letters and numbers)
    }

    private static boolean isValidOwnerName(String ownerName) {
        return ownerName.matches("[a-zA-Z]+"); // Only letters allowed
    }

    private static boolean isValidColor(String color) {
        return color.matches("[a-zA-Z]+") && color.length() <= 20; // Only letters allowed and max length 20
    }
}

class CarDetails {
    private String ownerName;
    private String color;
    private String model;

    public CarDetails(String ownerName, String color, String model) {
        this.ownerName = ownerName;
        this.color = color;
        this.model = model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
