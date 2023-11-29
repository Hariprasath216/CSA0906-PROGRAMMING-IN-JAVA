import java.util.Scanner;
class MissingNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers separated by spaces: ");
        String input = scanner.nextLine();
        String[] numStrings = input.split(" ");

        int[] nums = Arrays.stream(numStrings)
                           .mapToInt(Integer::parseInt)
                           .toArray();

        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is: " + missingNumber);
    }

    private static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int expectedSum = n * (n - 1) / 2;
        int actualSum = Arrays.stream(nums).sum();
        return expectedSum - actualSum;
    }
}