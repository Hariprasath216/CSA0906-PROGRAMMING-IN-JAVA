import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquareWithDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get the lower and upper range from the user
            System.out.print("Enter lower range: ");
            int lowerRange = scanner.nextInt();

            System.out.print("Enter upper range: ");
            int upperRange = scanner.nextInt();

            // Validate the input ranges
            if (lowerRange >= upperRange) {
                System.out.println("Invalid input. Upper range should be greater than lower range.");
                return;
            }

            // Create a list of numbers that are perfect squares and have a digit sum less than 10
            ArrayList<Integer> result = findPerfectSquaresWithDigitSum(lowerRange, upperRange);

            // Display the result
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }

    // Method to find perfect squares with digit sum less than 10
    private static ArrayList<Integer> findPerfectSquaresWithDigitSum(int lower, int upper) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = lower; i <= upper; i++) {
            if (isPerfectSquare(i) && digitSum(i) < 10) {
                result.add(i);
            }
        }
        return result;
    }

    // Method to check if a number is a perfect square
    private static boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    // Method to calculate the sum of digits of a number
    private static int digitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
