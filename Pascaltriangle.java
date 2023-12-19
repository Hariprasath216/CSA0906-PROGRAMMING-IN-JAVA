import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows for Pascal's Triangle
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();

        // Print Pascal's Triangle
        printPascalsTriangle(numRows);

        scanner.close();
    }

    // Method to print Pascal's Triangle
    private static void printPascalsTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            // Print leading spaces
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print("  ");
            }

            // Calculate and print the values for each row
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", value);
                value = value * (i - j) / (j + 1);
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
