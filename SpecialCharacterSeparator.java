import java.util.Scanner;

public class SpecialCharacterSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input line from the user
        System.out.print("Enter a line of text: ");
        String inputLine = scanner.nextLine();

        // Separate special characters and count them
        int specialCharCount = 0;
        System.out.println("Special characters in the line:");

        for (char c : inputLine.toCharArray()) {
            if (isSpecialCharacter(c)) {
                System.out.println(c);
                specialCharCount++;
            }
        }

        System.out.println("Number of special characters: " + specialCharCount);

        scanner.close();
    }

    // Method to check if a character is a special character
    private static boolean isSpecialCharacter(char c) {
        // You can customize this method based on the definition of special characters you want to consider
        return !Character.isLetterOrDigit(c) && !Character.isWhitespace(c);
    }
}
