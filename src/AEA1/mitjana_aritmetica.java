import java.util.Scanner;
public class mitjana_aritmetica {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Write how many numbers you wanna mediate"); 
        int choice = s.nextInt();
        double user_nums = 0;
        int[] medium_array = new int[choice];
        double test = 0;
        for (int i = 0; i< medium_array.length; i++){
            user_nums = s.nextDouble();
            
            System.out.println("Write the next number");
            test = test+user_nums;
        }
        System.out.println("-----------------------");
        System.out.println(test/choice);

    }
}