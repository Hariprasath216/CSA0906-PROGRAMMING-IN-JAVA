import java.util.Arrays;
import java.util.Scanner;

public class ReverseAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input word from the user
        System.out.print("Enter a word: ");
        String inputWord = scanner.nextLine();

        // Arrange letters alphabetically in reverse order
        String result = arrangeAlphabeticallyReverse(inputWord);

        // Display the result
        System.out.println("Alphabetical Order: " + result);

        scanner.close();
    }

    // Method to arrange letters alphabetically in reverse order
    private static String arrangeAlphabeticallyReverse(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        StringBuilder result = new StringBuilder(new String(charArray));
        return result.reverse().toString();
    }
}
