import java.util.Scanner;

public class Mult3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input
        System.out.println("Enter first number: ");
        double num1 = s.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = s.nextDouble();
        System.out.println("Enter third number: ");
        double num3 = s.nextDouble();

        double result = num1*num2*num3;
        System.out.println("Your result is:"+result);
    }
}