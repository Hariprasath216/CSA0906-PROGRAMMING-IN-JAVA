import java.util.Scanner;

public class SkipNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the values of M, N, and K from the user
        System.out.print("Enter the value of M: ");
        int m = scanner.nextInt();

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();

        // Print numbers from M to N, skipping K numbers in between
        printNumbersWithSkip(m, n, k);

        scanner.close();
    }

    // Method to print numbers from M to N, skipping K numbers in between
    private static void printNumbersWithSkip(int m, int n, int k) {
        if (m > n || k <= 0) {
            System.out.println("Invalid input. Please ensure M <= N and K > 0.");
            return;
        }

        System.out.print("Numbers from " + m + " to " + n + " by skipping " + k + " numbers: ");

        for (int i = m; i <= n; i += k) {
            System.out.print(i + ", ");
        }

        System.out.println();
    }
}
