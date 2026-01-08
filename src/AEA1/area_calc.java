import java.util.Scanner;

public class area_calc {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double num1, num2, num3;
		//input
		System.out.println("Choose your geometry:triangle, circle, trapezi, rombe, paralelogram... ");
        String shape = s.nextLine();

        switch(shape){
        	case "triangle":
        		System.out.println("Type the base");
        		num1 = s.nextDouble();
        		System.out.println("Type the height");
        		num2 = s.nextDouble();
        		System.out.println(0.5*num1*num2);
        		break;
        	
        	case "circle":
        		System.out.println("Type the radius");
        		num1 = s.nextDouble();
        		System.out.println(3.14*(num1*2));
        		break;

        	case "trapezi":
        		System.out.println("Type major base");
        		num1 = s.nextDouble();
        		System.out.println("Type minor base");
        		num2 = s.nextDouble();
        		System.out.println("Type the height");
        		num3 = s.nextDouble();
        		System.out.println(((num1+num2)*num3)/2);
        		break;

        	case "robmbe":
        		System.out.println("Type the base");
        		num1 = s.nextDouble();
        		System.out.println("Type the height");
        		num2 = s.nextDouble();
        		System.out.println((num1*num2)/2);
        		break;
        	case "paralelogram":
        		System.out.println("Type the base");
        		num1 = s.nextDouble();
        		System.out.println("Type the height");
        		num2 = s.nextDouble();
        		System.out.println(num1*num2);
        		break;

        }
	}
}