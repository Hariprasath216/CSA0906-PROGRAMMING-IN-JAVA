import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the age from the user
        System.out.print("Enter your age: ");
        
        // Validate input to handle non-integer inputs
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid age: ");
            scanner.next(); // consume the invalid input
        }
        
        int age = scanner.nextInt();

        // Check eligibility and print the result
        checkVoteEligibility(age);

        scanner.close();
    }

    // Method to check vote eligibility and print the result
    private static void checkVoteEligibility(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else if (age >= 0) {
            int yearsLeft = 18 - age;
            System.out.println("You are allowed to vote after " + yearsLeft + " years.");
        } else {
            System.out.println("Invalid age. Please enter a valid age.");
        }
    }
}
