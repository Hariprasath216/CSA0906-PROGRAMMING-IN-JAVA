import java.util.Scanner;

class CharacterCounter {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      char ch;
      int upperCount = 0, lowerCount = 0, numberCount = 0;
      
      do {
         System.out.print("Enter a character (* to end): ");
         ch = input.next().charAt(0);
         if (Character.isUpperCase(ch)) {
            upperCount++;
         } else if (Character.isLowerCase(ch)) {
            lowerCount++;
         } else if (Character.isDigit(ch)) {
            numberCount++;
         }
      } while (ch != '*');
      
      System.out.println("Uppercase: " + upperCount);
      System.out.println("Lowercase: " + lowerCount);
      System.out.println("Numbers  : " + numberCount);
   }
}