import java.util.*;

class MultiplicationTable 
{
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);

        
        System.out.print("Enter the starting number (m): ");
        int m = s.nextInt();

        System.out.print("Enter the ending number (n): ");
        int n = s.nextInt();

        // Ensure that m is less than or equal to n
        if (m > n) {
            System.out.println("Invalid input. The starting number (m) must be less than or equal to the ending number (n).");
            return;
        }

        
        for (int i = m; i <= n; i++) {
            System.out.println("Multiplication table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }

        
    }
}
