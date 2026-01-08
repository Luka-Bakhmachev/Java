import java.util.Scanner;
public class multiple_t {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number for adding of 3");
		int num1 = s.nextInt();
		int result = 0;

		for (int i = 0; i <= num1; i=i+3){
			System.out.println("adding "+i);
			result = result+i;
		}
		System.out.println("final result is:"+result);
	}
}