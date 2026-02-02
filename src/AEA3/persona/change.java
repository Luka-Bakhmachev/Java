package persona;
import java.util.Scanner;

public class change {
    static Scanner s = new Scanner(System.in);
    public static int setDni(Persona p, String nouDni) {
        return p.setDni(nouDni);
    }

    public static int setEdat(Persona p, int novaEdat) {
        int edat = s.nextInt();
        if (!s.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number between 1 and 99.");
            s.next();
         } else if (edat < 1 || edat > 99){
             {
                System.out.println("Error: Age must be between 1 and 99.");
                return -1; // Indicate an error
            }
         } else {
            edat = s.nextInt();
            return p.setEdat(edat);
         }
        return 0;
    }

    public static void setNom(Persona p, String nouNom) {
        p.setNom(nouNom);
    }
}