import java.util.Scanner;

public class ej1examen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many rows you want: ");
        int rows = s.nextInt();
        

        int[] matrix1 = new int[rows];
        int[] matrix2 = new int[rows];
        int[] sumNums = new int[rows];

        System.out.println("Write the values for the first vector");
        for (int i = 0; i < rows; i++) {
            System.out.print("Type the value of this position:\" [" + (i) + "] : ");
            matrix1[i] = s.nextInt();
        }

        System.out.println("Write the values for the second vector");
        for (int i = 0; i < rows; i++) {
            System.out.print("Type the value of this position:\" [" + (i) + "] : ");
            matrix2[i] = s.nextInt();
        }

        System.out.println("The results of the sum of both vectors is: ");
        for (int i = 0; i < matrix1.length; i++) {
            sumNums[i] += matrix1[i] + matrix2[i];
            System.out.print(sumNums[i] + " ");
        }
        //Three for i loops has got to be a record for me, works for me though
        
    }
}