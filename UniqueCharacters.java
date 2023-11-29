import java.util.*;
class UniqueCharacters {
    public static void main(String[] args) {
        String inputString = "abcb";
        System.out.println("Input String: " + inputString);
        printUniqueCharacters(inputString);
    }

    private static void printUniqueCharacters(String str) {
        char[] characters = str.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < characters.length; j++) {
                if (i != j && characters[i] == characters[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.print(characters[i] + " ");
            }
        }
    }
}