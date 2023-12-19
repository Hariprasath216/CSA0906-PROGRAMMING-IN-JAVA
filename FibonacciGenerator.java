class FibonacciGenerator implements Runnable {
    private int count;

    // Constructor to initialize the count
    public FibonacciGenerator(int count) {
        this.count = count;
    }

    // Method to generate Fibonacci series up to the given count
    private void generateFibonacci() {
        int first = 0, second = 1;

        System.out.println("Fibonacci series:");

        for (int i = 0; i < count; i++) {
            System.out.print(first + " ");

            int temp = first + second;
            first = second;
            second = temp;
        }
    }

    // Overridden run method to start the thread
    @Override
    public void run() {
        generateFibonacci();
    }
}

public class Main {
    public static void main(String[] args) {
        // Test cases
        generateFibonacciSeries(5);
        generateFibonacciSeries(7);
        generateFibonacciSeries(-10);
        generateFibonacciSeries(0);
        // The following test cases will result in a compilation error
        // generateFibonacciSeries("EIGHT FIVE");
        // generateFibonacciSeries(12.65);
    }

    // Method to create a new thread and start generating Fibonacci series
    private static void generateFibonacciSeries(int count) {
        if (count < 0) {
            System.out.println("Invalid input. Please enter a non-negative count.");
            return;
        }

        // Create a new thread and start it
        Thread thread = new Thread(new FibonacciGenerator(count));
        thread.start();
    }
}
