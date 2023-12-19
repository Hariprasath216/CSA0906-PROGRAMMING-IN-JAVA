import java.util.Scanner;

public class EvenSumFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the value of n from the user
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Find the sum of even-indexed terms in the Fibonacci series
        int evenSum = findEvenSumFibonacci(n);

        // Display the result
        System.out.println("Sum of even-indexed terms in Fibonacci series till " + n + ": " + evenSum);

        scanner.close();
    }

    // Method to find the sum of even-indexed terms in the Fibonacci series up to n
    private static int findEvenSumFibonacci(int n) {
        int firstTerm = 0;
        int secondTerm = 1;
        int evenSum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += firstTerm;
            }

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        return evenSum;
    }
}
