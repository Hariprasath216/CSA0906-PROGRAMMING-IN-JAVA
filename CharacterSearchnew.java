import java.util.*;
class CharacterSearchnew {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = s.nextLine();

        System.out.print("Enter the character to be searched: ");
        char searchChar = s.next().charAt(0);

        int index = 1;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == searchChar) {
                index = i;
                break;
            }
        }

        if (index != 1) {
            System.out.println(searchChar + " is found in the string at index: " + index);
        } else {
            System.out.println(searchChar + " is not found in the string.");
        }
    }
}