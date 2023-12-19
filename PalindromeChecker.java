import java.util.Scanner;
public class PalindromeChecker
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Check if a string is palindrome");
        System.out.println("2. Check if a number is palindrome");

        int choice = scanner.nextInt();

        switch (choice) 
        {
            case 1:
                String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string:");
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println(a+ " is a palindrome.");
        }
        else
        {
            System.out.println(a+ " is not a palindrome.");
        }
           break;
             case 2:
                int reversedNum = 0, remainder;
                System.out.println("Enter a number:");
                int num = scanner.nextInt();
                
    
   
    int originalNum = num;
    
    
    while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }
    
    
    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome.");
    }
    else {
      System.out.println(originalNum + " is not Palindrome.");
    }
     break;
  default:
                System.out.println("Invalid choice");
        }
}
}
        