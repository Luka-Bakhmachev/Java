public class Estrelles {
    public static void main(String[] args) {
        charprint('*', 5);
        charprint('#', 3);
        charprint('A', 4);  
    }
    public static void charprint (char symbol, int rows) {
        String completeLine = String.valueOf(symbol).repeat(rows);
        System.out.println(completeLine);
        
    }
}


