import java.util.Scanner;
public class divisor {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a dividend");
		int dividend = s.nextInt();
		System.out.println("Enter the divisor");
		int divisor = s.nextInt();
		int i = 0;

		do {
			dividend = dividend - divisor;
			System.out.println(dividend);
			i++;

		} while (dividend >= divisor);
		System.out.println(i);
	}
}