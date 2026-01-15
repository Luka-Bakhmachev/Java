import java.util.Scanner;

public class LlegirReals {

  public static void main(String[] args) {
    LlegirReals programa = new LlegirReals();
    programa.inici();
  }

  public void inici() {
    System.out.println("Llegiu un nombre real pel teclat:");
    double a = llegirRealTeclat();
    System.out.println("El real ha estat " + a + ".");

    System.out.println("Llegiu un altre nombre real pel teclat:");
    a = llegirRealTeclat();
    System.out.println("L’altre real ha estat " + a + ".");
  }

  public double llegirRealTeclat() {
    Scanner lector = new Scanner(System.in);

    while (true) {
      if (lector.hasNextInt()) {
        System.out.println("Error: això és un enter.");
        lector.next();                  
      }
      else if (lector.hasNextDouble()) {
        return lector.nextDouble();     
      }
      else {
        System.out.println("Error: això no és un nombre.");
        lector.next();                  
      }
    }
  }
}
