import java.util.Scanner;

public class Taula_mult_v3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int user_num_input = s.nextInt();
        for(int i = 1; i <= user_num_input; i++) {
            System.out.println("---------------------- \n " +
                "La taula de " + i);
            for (int y = 1; y <= 10; y++) {
                System.out.println(i+"*"+y+"="+(i*y));
            }

        }
    }
}