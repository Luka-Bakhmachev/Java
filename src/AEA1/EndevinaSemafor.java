import java.util.Scanner;
import java.util.Random;

public class EndevinaSemafor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        int secret = rand.nextInt(10);
        int guess_num = 0;
        int maxAttempts = 3;
        boolean guessed = false;

        System.out.println("Guess the secret number. You have " + maxAttempts + " attempts.");

        for (int attempts = 0; attempts < maxAttempts; attempts++) {
            System.out.print("Introduce a number to guess: ");
            guess_num = s.nextInt();

            if (guess_num == secret) {
                System.out.println("You chose the right number:  " + secret);
                guessed = true;
                break; 
            } else {
                System.out.println("Incorrect! Attempts left: " + (maxAttempts - attempts - 1));
            }
        }

        if (!guessed) {
            System.out.println("You reached your max guesses, the secret nuber was: " + secret);
        }
    }
}
