import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the value of N from the user
        System.out.print("Enter N value: ");

        // Validate input to handle non-integer inputs
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid integer for N: ");
            scanner.next(); // consume the invalid input
        }

        int N = scanner.nextInt();

        // Get the N-digit number from the user
        System.out.print("Enter " + N + " digit number: ");

        // Validate input to handle non-numeric inputs
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid numeric value: ");
            scanner.next(); // consume the invalid input
        }

        int number = scanner.nextInt();

        // Find the sum of digits and ensure it is a single digit
        int singleDigitSum = findSingleDigitSum(number);

        // Display the result
        System.out.println("Sum of digits (single digit): " + singleDigitSum);

        scanner.close();
    }

    // Method to find the sum of digits and ensure it is a single digit
    private static int findSingleDigitSum(int number) {
        int sum = 0;

        while (number > 0 || sum > 9) {
            if (number == 0) {
                number = sum;
                sum = 0;
            }
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
