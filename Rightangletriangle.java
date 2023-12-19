import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows for the triangle
        System.out.print("Enter the number of rows for the right-angled triangle: ");
        int numRows = scanner.nextInt();

        // Print the right-angled triangle
        printRightAngleTriangle(numRows);

        scanner.close();
    }

    // Method to print a right-angled triangle
    private static void printRightAngleTriangle(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            // Print '*' characters for each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
