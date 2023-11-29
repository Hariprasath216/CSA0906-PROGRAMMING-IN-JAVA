import java.util.*;
class  FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int givenNumber = scanner.nextInt();
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        scanner.close();
        int numberOfFactors = findFactors(givenNumber);
        System.out.println("Number of factors = " + numberOfFactors);
        int nthFactor = findNthFactor(givenNumber, n);
        System.out.println(n + "th factor of " + givenNumber + " = " + nthFactor);
    }
    private static int findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
    private static int findNthFactor(int num, int n) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
                if (count == n) {
                    return i;
                }
            }
        }
        return -1; 
    }
}