public class ReduceToZero {
    public static void main(String[] args) {
        // Test Cases
        System.out.println(numberOfSteps(5)); // Output: 7
        System.out.println(numberOfSteps(10)); // Output: 6
        System.out.println(numberOfSteps(12)); // Output: 9
        System.out.println(numberOfSteps(18)); // Output: 8
        System.out.println(numberOfSteps(20)); // Output: 9
    }

    public static int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                // If the current number is even, divide it by 2
                num /= 2;
            } else {
                // If the current number is odd, subtract 1 from it
                num -= 1;
            }
            steps++;
        }
        return steps;
    }
}
