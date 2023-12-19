import java.util.Scanner;

public class PerfectNumberPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the value of N from the user
        System.out.print("Enter the value of N: ");

        // Validate input to handle non-integer inputs
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid integer for N: ");
            scanner.next(); // consume the invalid input
        }

        int N = scanner.nextInt();

        // Print the first N perfect numbers
        printPerfectNumbers(N);

        scanner.close();
    }

    // Method to check if a number is a perfect number
    private static boolean isPerfectNumber(int number) {
        int sum = 1; // 1 is always a divisor, start with 1

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }

        return sum == number;
    }

    // Method to print the first N perfect numbers
    private static void printPerfectNumbers(int N) {
        if (N <= 0) {
            System.out.println("Invalid input. Please enter a positive integer for N.");
            return;
        }

        System.out.print("First " + N + " perfect numbers are: ");

        int count = 0;
        int number = 1;

        while (count < N) {
            if (isPerfectNumber(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }

        System.out.println();
    }
}
