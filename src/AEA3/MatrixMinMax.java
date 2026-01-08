import java.util.Scanner;

public class MatrixMinMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("How many rows you want: ");
        int rows = s.nextInt();
        System.out.print("How many columns you want: ");
        int cols = s.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input matrix data
        System.out.println("Type the value of this position:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Valor [" + (i) + "][" + (j) + "]: ");
                matrix[i][j] = s.nextInt();
            }
        }
        int min = matrix[0][0];
        int max = matrix[0][0];

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

    }
}