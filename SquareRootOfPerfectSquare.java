import java.util.Scanner;

public class SquareRootOfPerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter the number: ");

        // Validate input to handle non-numeric inputs
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid numeric value: ");
            scanner.next(); // consume the invalid input
        }

        int number = scanner.nextInt();

        // Find and print the square root of the perfect square number
        findAndPrintSquareRoot(number);

        scanner.close();
    }

    // Method to find and print the square root of a perfect square number
    private static void findAndPrintSquareRoot(int number) {
        if (number < 0) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
            return;
        }

        double squareRoot = Math.sqrt(number);

        if (squareRoot % 1 == 0) {
            // The number is a perfect square, print both positive and negative square roots
            System.out.println("Square Root: " + (int) squareRoot + ", " + (-1 * (int) squareRoot));
        } else {
            System.out.println("The entered number is not a perfect square.");
        }
    }
}
