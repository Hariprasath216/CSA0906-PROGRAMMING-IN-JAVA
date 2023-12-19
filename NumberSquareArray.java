import java.util.ArrayList;
import java.util.Scanner;

public class NumberSquareArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get the lower and upper range from the user
            System.out.print("Enter the lower range: ");
            int lowerRange = scanner.nextInt();

            System.out.print("Enter the upper range: ");
            int upperRange = scanner.nextInt();

            // Validate the input ranges
            if (lowerRange > upperRange) {
                System.out.println("Invalid input. Upper range should be greater than or equal to lower range.");
                return;
            }

            // Create an array with pairs of numbers and their squares
            ArrayList<int[]> result = createNumberSquareArray(lowerRange, upperRange);

            // Display the result
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }

    // Method to create an array with pairs of numbers and their squares
    private static ArrayList<int[]> createNumberSquareArray(int lower, int upper) {
        ArrayList<int[]> result = new ArrayList<>();
        for (int i = lower; i <= upper; i++) {
            int[] pair = {i, i * i};
            result.add(pair);
        }
        return result;
    }
}
