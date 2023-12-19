import java.util.Scanner;
import java.util.HashMap;

public class CarParkingManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> parkingLot = new HashMap<>();

        while (true) {
            System.out.println("1. Park a car");
            System.out.println("2. Retrieve a car");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter car registration number: ");
                    String regNumber = scanner.nextLine();
                    System.out.print("Enter car owner's name: ");
                    String ownerName = scanner.nextLine();
                    parkCar(parkingLot, regNumber, ownerName);
                    break;
                case 2:
                    System.out.print("Enter car registration number to retrieve: ");
                    regNumber = scanner.nextLine();
                    retrieveCar(parkingLot, regNumber);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void parkCar(HashMap<String, String> parkingLot, String regNumber, String ownerName) {
        if (parkingLot.containsKey(regNumber)) {
            System.out.println("Car with registration number " + regNumber + " is already parked.");
        } else {
            parkingLot.put(regNumber, ownerName);
            System.out.println("Car parked successfully!");
        }
    }

    private static void retrieveCar(HashMap<String, String> parkingLot, String regNumber) {
        if (parkingLot.containsKey(regNumber)) {
            String ownerName = parkingLot.get(regNumber);
            System.out.println("Car with registration number " + regNumber + " belongs to " + ownerName + ".");
            parkingLot.remove(regNumber);
            System.out.println("Car retrieved successfully!");
        } else {
            System.out.println("Car with registration number " + regNumber + " is not found in the parking lot.");
        }
    }
}
