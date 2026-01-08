import java.util.Scanner;

public class discompte_95 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input
        System.out.println("Introduce the price of the whatever: ");
        double num1 = s.nextDouble();

        if (num1 > 95.00){
            double divisor = (num1 * 15) / 100;
            System.out.println(num1 - divisor);
        }
        else {
            System.out.println("Price is: " + num1);
        }
    }
}