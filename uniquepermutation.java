import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniquePermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get the given number from the user
            System.out.print("Given Number: ");
            int givenNumber = scanner.nextInt();

            // Validate the input number
            if (givenNumber < 0) {
                System.out.println("Invalid input. Please enter a non-negative integer.");
                return;
            }

            // Generate and print unique permutations
            System.out.println("Permutations are:");
            printUniquePermutations(String.valueOf(givenNumber));
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }

    // Method to print unique permutations of a string
    private static void printUniquePermutations(String str) {
        Set<String> set = new HashSet<>();
        generatePermutations("", str, set);
        for (String permutation : set) {
            System.out.println(permutation);
        }
    }

    // Helper method to generate permutations
    private static void generatePermutations(String prefix, String remaining, Set<String> set) {
        int n = remaining.length();
        if (n == 0) {
            set.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1), set);
            }
        }
    }
}
