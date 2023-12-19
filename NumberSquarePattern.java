import java.util.Scanner;

public class NumberSquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows for the pattern
        System.out.print("Enter the number of rows for the pattern: ");
        int numRows = scanner.nextInt();

        // Print the pattern
        printNumberSquarePattern(numRows);

        scanner.close();
    }

    // Method to print the number square pattern
    private static void printNumberSquarePattern(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            // Print square of each number i, padded with spaces
            for (int j = 1; j <= i; j++) {
                System.out.print((int)Math.pow(j, 2) + "   ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
