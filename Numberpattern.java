import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter the number to be printed: ");
        int number = scanner.nextInt();

        // Get the maximum number of times to be printed
        System.out.print("Max Number of times to be printed: ");
        int maxTimes = scanner.nextInt();

        // Print the pattern
        printNumberPattern(number, maxTimes);

        scanner.close();
    }

    // Method to print the number pattern
    private static void printNumberPattern(int number, int maxTimes) {
        // Print the upper part of the pattern
        for (int i = 1; i <= maxTimes; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Print the lower part of the pattern
        for (int i = maxTimes - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter the number to be printed: ");
        int number = scanner.nextInt();

        // Get the maximum number of times to be printed
        System.out.print("Max Number of times to be printed: ");
        int maxTimes = scanner.nextInt();

        // Print the pattern
        printNumberPattern(number, maxTimes);

        scanner.close();
    }

    // Method to print the number pattern
    private static void printNumberPattern(int number, int maxTimes) {
        // Print the upper part of the pattern
        for (int i = 1; i <= maxTimes; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Print the lower part of the pattern
        for (int i = maxTimes - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
