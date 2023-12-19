import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Remove vowels from the string
        String result = removeVowels(inputString);

        // Display the result
        System.out.println("The string without vowels is: " + result);

        scanner.close();
    }

    // Method to remove vowels from a given string
    private static String removeVowels(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!isVowel(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
