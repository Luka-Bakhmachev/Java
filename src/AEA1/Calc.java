import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        double num1 = s.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = s.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = s.nextDouble();

        double result;

        //Calc
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);

        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);

        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);

        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Division by zero");
            }

        } else {
            System.out.println("Error: Invalid operator");
        }

        s.close();
    }
}
