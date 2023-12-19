import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input statement from the user
        System.out.print("Enter a statement: ");
        String inputStatement = scanner.nextLine();

        // Count the number of vowels
        int vowelCount = countVowels(inputStatement);

        // Display the result
        System.out.println("Number of vowels: " + vowelCount);

        scanner.close();
    }

    // Method to count the number of vowels in a given string
    private static int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
