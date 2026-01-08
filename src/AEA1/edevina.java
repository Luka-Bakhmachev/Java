import java.util.Scanner;
import java.util.Random;

public class edevina {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Enter a number to guess the secret number");
		int secret_number = rand.nextInt(10);
		int guess = s.nextInt();
		
		while (secret_number != guess) {
			System.out.println("The number was incorrect try again");
			guess = s.nextInt();
		} 
		
		System.out.println("You guessed the correct number:"+secret_number);
	}	
}