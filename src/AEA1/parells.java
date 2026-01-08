import java.util.Scanner;
public class parells {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] parralel_nums = new int[100];
        int j = 0;
        for(int i = 0; i< parralel_nums.length; i++){
            parralel_nums[i] = j;
            j= j+2;
            System.out.println(parralel_nums[i]);
        }
        // Well, i wanted to challenge myself to draw the same array as the exercise
        // this is the best that i got. lol.
        System.out.println("Array amb els 100 primers nombres parells:\n");

        for (int i = 0; i < parralel_nums.length; i++) {
            System.out.printf("%-4d", parralel_nums[i]); 
            if ((i + 1) % 10 == 0) {                   
                System.out.println();
            }
        }
    }
}