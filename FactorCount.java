import java.util.*;

class FactorCount {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = s.nextInt();
        int factorCount = countFactors(number);
        System.out.println("Number of factors for " + number + ": " + factorCount);
    }
    private static int countFactors(int num) {
        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
            return -1;
        }

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}