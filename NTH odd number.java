import java.util.Scanner;

public class NthOddNumbers {
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

        // Print the nth odd numbers
        printNthOddNumbers(N);

        scanner.close();
    }

    // Method to print the nth odd numbers
    private static void printNthOddNumbers(int N) {
        if (N <= 0) {
            System.out.println("Invalid input. Please enter a positive integer for N.");
            return;
        }

        System.out.print("Hence the values printed for i are: ");

        for (int i = 1, count = 0; count < N; i += 2, count++) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
