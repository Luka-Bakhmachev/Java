package Calculadora;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                printMenu();
                System.out.print("Choose an option: ");
                String option = scanner.nextLine().trim();

                if (option.equals("0")) {
                    System.out.println("Exiting calculator.");
                    break;
                }

                try {
                    executeOption(option, scanner);
                } catch (NumberFormatException | InputMismatchException e) {
                    System.out.println("Invalid input. Please enter numeric values.");
                    scanner.nextLine();
                } catch (ArithmeticException e) {
                    System.out.println("Math error: " + e.getMessage());
                }
                System.out.println();
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nScientific Calculator");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("5 - Power");
        System.out.println("6 - Square root");
        System.out.println("7 - Sine");
        System.out.println("8 - Cosine");
        System.out.println("9 - Tangent");
        System.out.println("10 - Log base 10");
        System.out.println("11 - Natural log");
        System.out.println("12 - Factorial");
        System.out.println("13 - Absolute value");
        System.out.println("0 - Exit");
    }

    private static void executeOption(String option, Scanner scanner) {
        switch (option) {
            case "1" -> {
                double[] addOperands = readTwoDoubles(scanner, "first number", "second number");
                System.out.println("Result: " + (addOperands[0] + addOperands[1]));
            }
            case "2" -> {
                double[] subOperands = readTwoDoubles(scanner, "first number", "second number");
                System.out.println("Result: " + (subOperands[0] - subOperands[1]));
            }
            case "3" -> {
                double[] mulOperands = readTwoDoubles(scanner, "first number", "second number");
                System.out.println("Result: " + (mulOperands[0] * mulOperands[1]));
            }
            case "4" -> {
                double[] divOperands = readTwoDoubles(scanner, "dividend", "divisor");
                if (divOperands[1] == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                System.out.println("Result: " + (divOperands[0] / divOperands[1]));
            }
            case "5" -> {
                double[] powOperands = readTwoDoubles(scanner, "base", "exponent");
                System.out.println("Result: " + Math.pow(powOperands[0], powOperands[1]));
            }
            case "6" -> {
                double sqrtValue = readDouble(scanner, "number");
                if (sqrtValue < 0) {
                    throw new ArithmeticException("Square root of negative number");
                }
                System.out.println("Result: " + Math.sqrt(sqrtValue));
            }
            case "7" -> {
                double sinValue = readDouble(scanner, "angle in degrees");
                System.out.println("Result: " + Math.sin(Math.toRadians(sinValue)));
            }
            case "8" -> {
                double cosValue = readDouble(scanner, "angle in degrees");
                System.out.println("Result: " + Math.cos(Math.toRadians(cosValue)));
            }
            case "9" -> {
                double tanValue = readDouble(scanner, "angle in degrees");
                System.out.println("Result: " + Math.tan(Math.toRadians(tanValue)));
            }
            case "10" -> {
                double logValue = readDouble(scanner, "number");
                if (logValue <= 0) {
                    throw new ArithmeticException("Logarithm argument must be positive");
                }
                System.out.println("Result: " + Math.log10(logValue));
            }
            case "11" -> {
                double lnValue = readDouble(scanner, "number");
                if (lnValue <= 0) {
                    throw new ArithmeticException("Natural logarithm argument must be positive");
                }
                System.out.println("Result: " + Math.log(lnValue));
            }
            case "12" -> {
                int factorialInput = readInt(scanner, "non-negative integer");
                if (factorialInput < 0) {
                    throw new ArithmeticException("Factorial input must be non-negative");
                }
                System.out.println("Result: " + factorial(factorialInput));
            }
            case "13" -> {
                double absValue = readDouble(scanner, "number");
                System.out.println("Result: " + Math.abs(absValue));
            }
            default -> System.out.println("Unknown option. Please choose a valid menu item.");
        }
    }

    private static double[] readTwoDoubles(Scanner scanner, String firstName, String secondName) {
        double first = readDouble(scanner, firstName);
        double second = readDouble(scanner, secondName);
        return new double[]{first, second};
    }

    private static double readDouble(Scanner scanner, String prompt) {
        System.out.print("Enter " + prompt + ": ");
        String input = scanner.nextLine().trim();
        return Double.parseDouble(input);
    }

    private static int readInt(Scanner scanner, String prompt) {
        System.out.print("Enter " + prompt + ": ");
        String input = scanner.nextLine().trim();
        return Integer.parseInt(input);
    }

    private static long factorial(int value) {
        long result = 1;
        for (int i = 2; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
