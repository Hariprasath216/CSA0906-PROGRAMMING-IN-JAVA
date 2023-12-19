import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get dimensions of the matrices
        System.out.print("Enter the number of rows for the matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for the matrices: ");
        int cols = scanner.nextInt();

        // Input the first matrix
        int[][] matrix1 = inputMatrix("Enter the elements of the first matrix:", rows, cols, scanner);

        // Input the second matrix
        int[][] matrix2 = inputMatrix("Enter the elements of the second matrix:", rows, cols, scanner);

        // Perform matrix addition
        int[][] resultMatrix = addMatrices(matrix1, matrix2);

        // Display the result
        System.out.println("Resultant Matrix after Addition:");
        displayMatrix(resultMatrix);

        scanner.close();
    }

    // Method to input a matrix from the user
    private static int[][] inputMatrix(String message, int rows, int cols, Scanner scanner) {
        System.out.println(message);
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Method to add two matrices
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    // Method to display a matrix
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
