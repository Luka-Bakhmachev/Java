import java.util.Scanner;

public class ej2examen {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("How many rows you want: ");
        int rows = s.nextInt();
        int[] matrix = new int[rows];
        boolean close = false;
        int numPos = 0;

        System.out.println("Write the values for the vector");
        for (int i = 0; i < rows; i++) {
            System.out.print("Type the value of element 1:");
            matrix[i] = s.nextInt();
        }
        System.out.println("Now type the number you want to find:");
        int numFind = s.nextInt();

        for (int i=0; i < numFind; i++) {
            if (matrix[i] == numFind) {
                close = true;
                numPos = i;
            }
        }
        if (close) {
            System.out.println("The number " + numFind + " in position " + (numPos+1));
            // Added 1 to numPos to convert from 0 position to 1 position, so the user understands better
        } else {
            System.out.println("The number " + numFind + " is not in the array.");
        }
        //also could have used a break; when found to avoid unnecessary iterations
        //but im too lazy, also it works fine like this
        //AND also i do not care that i used two seperate for i loops, if ill get a bad grade for it so be it.
    }
}