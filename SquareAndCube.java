import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the decimal number from the user
        System.out.print("Enter the decimal number: ");

        // Validate input to handle non-decimal inputs
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid decimal number: ");
            scanner.next(); // consume the invalid input
        }

        double decimalNumber = scanner.nextDouble();

        // Find and print the square and cube of the given decimal number
        findAndPrintSquareAndCube(decimalNumber);

        scanner.close();
    }

    // Method to find and print the square and cube of a decimal number
    private static void findAndPrintSquareAndCube(double decimalNumber) {
        double square = Math.pow(decimalNumber, 2);
        double cube = Math.pow(decimalNumber, 3);

        System.out.println("Square Number: " + square);
        System.out.println("Cube Number: " + cube);
    }
}
