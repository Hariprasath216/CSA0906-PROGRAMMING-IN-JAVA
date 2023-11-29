import java.util.Scanner;

class MaxMinSumDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        
        System.out.print("Enter the value of M: ");
        int M = scanner.nextInt();
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        

        
        int mthMaximum = array[array.length - M];
        int nthMinimum = array[N - 1];

        int sum = mthMaximum + nthMinimum;
        int difference = mthMaximum - nthMinimum;

        
        System.out.println("1st Maximum Number = " + mthMaximum);
        System.out.println(N + "th Minimum Number = " + nthMinimum);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);

        scanner.close();
    }
}
