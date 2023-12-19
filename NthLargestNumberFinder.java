import java.util.Arrays;
import java.util.Scanner;

public class NthLargestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the array of elements from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Get the value of N from the user
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Find and print the Nth largest number
        findAndPrintNthLargestNumber(array, N);

        scanner.close();
    }

    // Method to find and print the Nth largest number in an array
    private static void findAndPrintNthLargestNumber(int[] array, int N) {
        if (N <= 0 || N > array.length) {
            System.out.println("Invalid input for N. Please ensure 1 <= N <= array length.");
            return;
        }

        // Sort the array in descending order
        Arrays.sort(array);
        int nthLargest = array[array.length - N];

        // Print the result
        System.out.println(N + "th Largest number: " + nthLargest);
    }
}
