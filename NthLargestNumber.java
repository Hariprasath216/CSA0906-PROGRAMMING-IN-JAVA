import java.util.Arrays;

class NthLargestNumber {
    public static void main(String[] args) {
        // Sample input array
        int[] arr = {14, 67, 48, 23, 5, 62};
        
        // Nth value
        int n = 4;

        int nthLargest = findNthLargest(arr, n);

        System.out.println(n + "th Largest number: " + nthLargest);
    }

    // Function to find the Nth largest number in an array
    private static int findNthLargest(int[] arr, int n) {
        // Sorting the array in descending order
        Arrays.sort(arr);
        
        // Finding the Nth largest element
        int nthLargest = arr[arr.length - n];
        
        return nthLargest;
    }
}
