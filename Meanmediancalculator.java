import java.util.*;

class MeanMedianModeCalculator {
    public static void main(String[] args) {
        int[] array = {16, 18, 27, 16, 23, 21, 19};
        
        int mean = calculateMean(array);
        int median = calculateMedian(array);
        int mode = calculateMode(array);
        
        System.out.println("Mean = " + mean);
        System.out.println("Median = " + median);
        System.out.println("Mode = " + mode);
    }

    public static int calculateMean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static int calculateMedian(int[] array) {
        Arrays.sort(array);
        int n = array.length;
        if (n % 2 == 1) {
            return array[n / 2];
        } else {
            int mid1 = array[n / 2 - 1];
            int mid2 = array[n / 2];
            return (mid1 + mid2) / 2;
        }
    }

    public static int calculateMode(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int mode = -1;
        
        for (int num : array) {
            int frequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, frequency);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = num;
            }
        }
        return mode;
     }
}
