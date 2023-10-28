import java.util.*;
class LCMGCD {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        
        System.out.print("Number 1: ");
        int lcm = scanner.nextInt();
        int gcd = lcm;

        for (int i = 2; i <= n; i++) {
            System.out.print("Number " + i + ": ");
            int number = scanner.nextInt();
            
          
            gcd = findGCD(gcd, number);

            lcm = findLCM(lcm, number);
        }

        System.out.println("LCM = " + lcm);
        System.out.println("GCD = " + gcd);

        scanner.close();
    }

    
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

  
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
}