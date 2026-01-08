import java.util.Scanner;
public class taula_div {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = s.nextInt();

		for (int i = 10; i >= 1; i--) {
			System.out.println(num1+"*"+i+"="+(num1*i));
		}
	}
}