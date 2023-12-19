import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter the number: ");

        // Validate input to handle non-integer inputs
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid integer: ");
            scanner.next(); // consume the invalid input
        }

        int number = scanner.nextInt();

        // Check if the number is a Perfect number
        checkPerfectNumber(number);

        scanner.close();
    }

    // Method to check if a number is a Perfect number
    private static void checkPerfectNumber(int number) {
        if (number < 1) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            int sum = 1; // Initialize sum with 1 because 1 is a divisor of every number

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            if (sum == number) {
                System.out.println("It’s a Perfect Number");
            } else {
                System.out.println("It’s not a Perfect Number");
            }
        }
    }
}
