import java.util.Scanner;

public class interactive_menu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean close = false;
        int sum = 0;
        int add = 0;
        int choice = 0;

        do {
            System.out.print("--------------------------------------- \n" +
                    "Hello user, Choose what you'd like to do: \n" +
                    "1. Show the entry message \n" +
                    "2. Show today's date \n" +
                    "3. Sum a number \n" +
                    "4. Close \n");

            // Check input
            if (!s.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1 and 4.");
                s.next(); 
                continue;
            }

            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello world");
                    break;
                case 2:
                    System.out.println("Today's date is 10/06/2025");
                    break;
                case 3:
                    System.out.println("Introduce first number");
                    // Check the sum input
                    if (!s.hasNextInt()) {
                        System.out.println("Invalid input! Please enter a number.");
                        s.next();
                        continue;
                    }
                    sum = s.nextInt();

                    System.out.println("Introduce the number to be added");
                    // Check the add input
                    if (!s.hasNextInt()) {
                        System.out.println("Invalid input! Please enter a number.");
                        s.next();
                        continue;
                    }
                    add = s.nextInt();

                    System.out.println("Result: " + (sum + add));
                    break;
                case 4:
                    close = true;
                    break;
                default:
                    System.out.println("Not an option");
            }
        } while (!close);

        System.out.println("Bye bye user.");
    }
}