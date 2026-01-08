import java.util.Scanner;

public class subscribe_videojoc {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		//input
		System.out.println("Type your sub thing: ");
        int num1 = s.nextInt();
        switch(num1){
	        case 1:
	        	System.out.println("Youre basic");
	        	break;
	        case 2:
	        	System.out.println("Youre standard");
	        	break;
	        case 3:
	        	System.out.println("Youre Premium");
	        	break;
	        case 4:
	        	System.out.println("Youre VIP");
	        	break;
	        default:
	        	System.out.println("That aint an option");
        }

	}
}