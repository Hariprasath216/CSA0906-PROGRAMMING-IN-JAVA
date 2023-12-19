import java.util.Scanner;

public class HollowSquareDollarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the square
        System.out.print("Enter the size of the square: ");
        int size = scanner.nextInt();

        // Print the hollow square dollar pattern
        printHollowSquareDollarPattern(size);

        scanner.close();
    }

    // Method to print a hollow square dollar pattern
    private static void printHollowSquareDollarPattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // Print '$' for the first and last rows, and for the first and last columns
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("$ ");
                } else {
                    // Print space for the inner part of the square
                    System.out.print("  ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
