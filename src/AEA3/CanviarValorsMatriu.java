import java.util.Scanner;

public class CanviarValorsMatriu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("How many rows you want: ");
        int rows = s.nextInt();
        System.out.print("How many columns you want: ");
        int cols = s.nextInt();

        int[][] matriu = new int[rows][cols];

        // Input matrix data
        System.out.println("Type the value of this position:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Valor [" + (i) + "][" + (j) + "]: ");
                matriu[i][j] = s.nextInt();
            }
        }

        // Transform matrix 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    matriu[i][j] = 1;
                } else if (i % 2 == 0 && j % 2 != 0) {
                    matriu[i][j] = 2;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    matriu[i][j] = 3;
                } else {
                    matriu[i][j] = 4;
                }
            }
        }

        // Output transformed matrix
        System.out.println("Transformed Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
    }
}
