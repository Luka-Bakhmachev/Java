import java.util.Scanner;

public class discompte_100 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //input
        System.out.println("Introduce the price of the whatever: ");
        double num1 = s.nextDouble();

        if(num1 > 100){
            double divisor = (num1*8)/100;
            System.out.println("The whatever is like: "+ (num1-divisor));
        }
        else if(num1<30){

            System.out.println("Dang too much: "+ (num1+2.00));
        }
        else{
            System.out.println("Nothing was applied "+num1);
        }
    }
}