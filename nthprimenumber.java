import java.util.Scanner;

public class NthPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get the value of N from the user
            System.out.print("N: ");
            int N = scanner.nextInt();

            // Validate N to be a positive integer
            if (N <= 0) {
                System.out.println("Invalid input. N should be a positive integer.");
                return;
            }

            // Calculate and display the Nth prime number
            int nthPrime = calculateNthPrime(N);
            System.out.println(N + "th Prime number is " + nthPrime);

            // Calculate and display the next N prime numbers
            System.out.print(N + " prime numbers after " + nthPrime + " are: ");
            printNextNPrimes(NthPrime, N);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }

    // Method to calculate the Nth prime number
    private static int calculateNthPrime(int N) {
        int count = 0;
        int number = 1;
        while (count < N) {
            number++;
            if (isPrime(number)) {
                count++;
            }
        }
        return number;
    }

    // Method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to print the next N prime numbers after a given prime number
    private static void printNextNPrimes(int startNumber, int N) {
        int count = 0;
        int number = startNumber + 1;
        while (count < N) {
            if (isPrime(number)) {
                System.out.print(number + ", ");
                count++;
            }
            number++;
        }
        System.out.println();
    }
}
