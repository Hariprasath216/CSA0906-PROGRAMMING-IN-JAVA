import java.util.Scanner;

public class PrimeCompositeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the numbers from the user
        System.out.println("Enter the numbers (enter a non-integer to stop):");

        int primeCount = 0;
        int compositeCount = 0;

        // Continue taking input until a non-integer is entered
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (isPrime(number)) {
                primeCount++;
            } else {
                compositeCount++;
            }
        }

        // Display the result
        System.out.println("Composite number: " + compositeCount);
        System.out.println("Prime number: " + primeCount);

        scanner.close();
    }

    // Method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
