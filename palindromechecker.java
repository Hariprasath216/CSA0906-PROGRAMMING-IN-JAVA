import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the user's choice
        System.out.println("Choose the type of input to check for palindrome:");
        System.out.println("1. String");
        System.out.println("2. Number");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Check if the given string is a palindrome
                System.out.print("Enter the string: ");
                scanner.nextLine(); // consume the newline character
                String inputString = scanner.nextLine();
                checkStringPalindrome(inputString);
                break;

            case 2:
                // Check if the given number is a palindrome
                System.out.print("Enter the number: ");
                long inputNumber = scanner.nextLong();
                checkNumberPalindrome(inputNumber);
                break;

            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }

        scanner.close();
    }

    // Method to check if a string is a palindrome
    private static void checkStringPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversedStr)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    // Method to check if a number is a palindrome
    private static void checkNumberPalindrome(long number) {
        long originalNumber = number;
        long reversedNumber = 0;

        while (number != 0) {
            long digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
