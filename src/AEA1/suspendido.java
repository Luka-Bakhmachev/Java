import java.util.Scanner;
public class suspendido {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Write how many students you wanna check"); 
        int choice = s.nextInt();
        int[] medium_array = new int[choice];
        boolean close = false;
        for (int i = 0; i <medium_array.length;i++){
            System.out.println("Write the students grade");
            choice = s.nextInt();
            if (choice < 4){
                close = true;
                break;
            }
        }
        if(close!=false){
            System.out.println("Hay un suspesendido");
        }else{System.out.print("No hay suspendidos");}
    }
}