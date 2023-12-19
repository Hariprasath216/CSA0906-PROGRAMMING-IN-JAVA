import java.util.Scanner;

public class InvertedPyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows for the inverted pyramid
        System.out.print("Enter the number of rows for the inverted pyramid: ");
        int numRows = scanner.nextInt();

        // Print the inverted pyramid pattern
        printInvertedPyramidPattern(numRows);

        scanner.close();
    }

    // Method to print an inverted pyramid pattern
    private static void printInvertedPyramidPattern(int numRows) {
        for (int i = 0; i < numRows; i++) {
            // Print spaces before each row
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print '*' characters for each row
            for (int j = 0; j < 2 * (numRows - i) - 1; j++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
