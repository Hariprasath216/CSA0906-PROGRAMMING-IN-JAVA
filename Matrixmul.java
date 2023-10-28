import java.util.*;

class MatrixMul {
    public static void main(String args[]) {
        int[][] mat1 = {{1, 2}, {5, 3}};
        int[][] mat2 = {{2, 3}, {4, 1}};

        int[][] result = multiplyMatrices(mat1, mat2);

        if (result != null) {
            System.out.println("Matrix Product:");
            printMatrix(result);
        } else {
            System.out.println("Matrix multiplication is not possible with the given matrices.");
        }
    }

    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int rows1 = mat1.length;
        int cols1 = mat1[0].length;
        int rows2 = mat2.length;
        int cols2 = mat2[0].length;

        if (cols1 != rows2) {
            return null;
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "   ");
            }
            System.out.println();
        }
    }
}