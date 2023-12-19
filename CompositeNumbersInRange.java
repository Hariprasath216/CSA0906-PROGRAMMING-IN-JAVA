import java.util.Scanner;

public class CompositeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the values of A and B from the user
        System.out.print("Enter the value of A: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of B: ");
        int b = scanner.nextInt();

        // Print all the composite numbers between A and B
        printCompositeNumbersInRange(a, b);

        scanner.close();
    }

    // Method to check if a number is composite
    private static boolean isComposite(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }

        return false;
    }

    // Method to print all composite numbers between A and B
    private static void printCompositeNumbersInRange(int a, int b) {
        if (a > b) {
            System.out.println("Invalid input. Please ensure A <= B.");
            return;
        }

        System.out.print("Composite numbers between " + a + " and " + b + ": ");

        for (int i = a; i <= b; i++) {
            if (isComposite(i)) {
                System.out.print(i + ", ");
            }
        }

        System.out.println();
    }
}
