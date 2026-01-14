import java.util.Scanner;
public class Estrelles {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        char sym = s.next().charAt(0);
        int row = s.nextInt();
        charprint(sym, row);
    }
    public static void charprint (char symbol, int rows) {
        for (int i = 0; i < rows; i++) {
            System.out.print(symbol);
        }
        //String completeLine = String.valueOf(symbol).repeat(rows);
        //System.out.println(completeLine);
    }
}


