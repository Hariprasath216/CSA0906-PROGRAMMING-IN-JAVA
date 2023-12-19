import java.util.Arrays;

public class KWeakestRows {
    public static void main(String[] args) {
        // Test Case
        int[][] mat = {
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 0},
            {1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0}
        };
        int k = 2;
        int[] result = kWeakestRows(mat, k);

        // Output: [2, 0]
        System.out.println(Arrays.toString(result));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        // Create an array to store the indices along with their strength
        int[][] strengths = new int[m][2];

        // Calculate the strength for each row and store in the strengths array
        for (int i = 0; i < m; i++) {
            int strength = 0;
            for (int j = 0; j < n; j++) {
                strength += mat[i][j];
            }
            strengths[i] = new int[]{i, strength};
        }

        // Sort the strengths array based on strength and then index
        Arrays.sort(strengths, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });

        // Create the result array with k weakest row indices
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = strengths[i][0];
        }

        return result;
    }
}
