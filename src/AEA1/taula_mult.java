import java.util.Scanner;
public class taula_mult {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = s.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num1+"*"+i+"="+(num1*i));
		}
	}
}