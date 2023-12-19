import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get the given number from the user
            System.out.print("Given Number: ");
            int givenNumber = scanner.nextInt();

            // Get the value of N from the user
            System.out.print("N: ");
            int N = scanner.nextInt();

            // Validate N to be a positive integer
            if (N <= 0) {
                System.out.println("Invalid input. N should be a positive integer.");
                return;
            }

            // Calculate and display the number of factors
            int factorsCount = calculateFactorsCount(givenNumber);
            System.out.println("Number of factors = " + factorsCount);

            // Calculate and display the Nth factor
            int nthFactor = calculateNthFactor(givenNumber, N);
            System.out.println(N + "th factor of " + givenNumber + " = " + nthFactor);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }

    // Method to calculate the number of factors
    private static 
