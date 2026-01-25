package AEA3.min_max_mitj;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
        }

        System.out.println("Highest: " + Calculator.getMax(numbers));
        System.out.println("Lowest: " + Calculator.getMin(numbers));
        System.out.println("Average: " + Calculator.getAverage(numbers));

        sc.close();
    }
}
