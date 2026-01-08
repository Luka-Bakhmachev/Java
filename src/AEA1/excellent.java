import java.util.Scanner;
public class excellent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Write how many numbers you wanna excellent"); 
        int choice = s.nextInt();
        
        int user_nums = 0;
        int[] medium_array = new int[choice];
        boolean close = false;

        for (int i = 0; i< medium_array.length; i++){
            System.out.println("Write number");
            medium_array[i] = s.nextInt();
            
            if (medium_array[i]==10){
                close = true;
            }
        }
        

        if (close!=false){
            System.out.println("There is number 10");
        }else{
            System.out.println("There is no number 10");
        }
    }
}