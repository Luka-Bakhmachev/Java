package FiguraEntregade10;
import java.util.Scanner;

public abstract class Figura {
    protected static int comptadorId = 1; 
    public static Scanner scanner = new Scanner(System.in);

    protected String figura;
    protected int id;

    public Figura() {
        this.id = comptadorId++;
        this.figura = ""; 
    }

    public Figura(String figura) {
        this.id = comptadorId++;
        this.figura = figura;
    }

    public String getFigura() { return figura; }
    public void setFigura(String figura) { this.figura = figura; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public abstract double calcularArea();
    public abstract void llegirDades();

    public static boolean seguentFigura() {
        System.out.print("\nDo you want to enter another shape for calculations? (y/n): ");
        String resposta = scanner.next();
        return resposta.equalsIgnoreCase("y"); 
    }

    public void imprimirDades() {
        System.out.println("\nThe shape with id " + this.getId() + " is a " + this.getFigura() + ".");
        System.out.println("The area of the " + this.getFigura() + " is: " + this.calcularArea());
        System.out.println("-------------");
    }
}