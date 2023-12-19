import java.util.Scanner;

public class ConsonantVowelSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input word from the user
        System.out.print("Enter a word: ");
        String inputWord = scanner.nextLine();

        // Separate consonants and vowels
        String consonants = separateConsonants(inputWord);
        String vowels = separateVowels(inputWord);

        // Display the result
        System.out.println("Consonants: " + consonants);
        System.out.println("Vowels: " + vowels);

        scanner.close();
    }

    // Method to separate consonants in a given string
    private static String separateConsonants(String str) {
        StringBuilder consonants = new StringBuilder();
        for (char c : str.toLowerCase().toCharArray()) {
            if (isConsonant(c)) {
                consonants.append(c).append(" ");
            }
        }
        return consonants.toString().trim();
    }

    // Method to separate vowels in a given string
    private static String separateVowels(String str) {
        StringBuilder vowels = new StringBuilder();
        for (char c : str.toLowerCase().toCharArray()) {
            if (isVowel(c)) {
                vowels.append(c).append(" ");
            }
        }
        return vowels.toString().trim();
    }

    // Method to check if a character is a consonant
    private static boolean isConsonant(char c) {
        return Character.isLetter(c) && !isVowel(c);
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e
