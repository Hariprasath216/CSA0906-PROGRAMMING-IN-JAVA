import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the character from the user
        System.out.print("Enter the character to be printed: ");
        char character = scanner.next().charAt(0);

        // Get the maximum number of times to be printed
        System.out.print("Max Number of times to be printed: ");
        int maxTimes = scanner.nextInt();

        // Print the pattern
        printCharacterPattern(character, maxTimes);

        scanner.close();
    }

    // Method to print the character pattern
    private static void printCharacterPattern(char character, int maxTimes) {
        for (int i = 1; i <= maxTimes; i++) {
            // Print the character multiple times for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(character + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
