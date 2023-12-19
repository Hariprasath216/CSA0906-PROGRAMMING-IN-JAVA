import java.util.Scanner;

public class NumberTrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows for the pattern
        System.out.print("Enter the number of rows for the pattern: ");
        int numRows = scanner.nextInt();

        // Print the pattern
        printNumberTrianglePattern(numRows);

        scanner.close();
    }

    // Method to print the number triangle pattern
    private static void printNumberTrianglePattern(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            // Print the number i multiple times for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "  ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
