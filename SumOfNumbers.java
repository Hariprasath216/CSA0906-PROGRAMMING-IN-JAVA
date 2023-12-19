import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get the value of N
            System.out.print("Enter the value of N: ");
            int N = scanner.nextInt();

            // Get N numbers from the user
            int[] numbers = new int[N];
            System.out.println("Enter " + N + " numbers:");
            for (int i = 0; i < N; i++) {
                numbers[i] = scanner.nextInt();
            }

            // Find the sum of N numbers
            int sum = findSum(numbers);
            System.out.println("Sum of N numbers: " + sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Loop variable beyond the size N.");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }

    // Method to find the sum of N numbers
    private static int findSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
