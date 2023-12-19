import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of elements in the array
        System.out.print("Enter the number of elements in array: ");
        int n = scanner.nextInt();

        // Get the elements of the array from the user
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Remove duplicates and print the result
        int[] result = removeDuplicates(array);
        System.out.println("Non-duplicate items:");
        printArray(result);

        scanner.close();
    }

    // Method to remove duplicates from an array
    private static int[] removeDuplicates(int[] array) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int value : array) {
            uniqueElements.add(value);
        }

        // Convert the set back to an array
        int[] result = new int[uniqueElements.size()];
        int index = 0;
        for (int value : uniqueElements) {
            result[index++] = value;
        }

        return result;
    }

    // Method to print an array
    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
