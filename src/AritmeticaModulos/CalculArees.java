package AritmeticaModulos;
//importem la biblioteca Scanner per a poder recolir dades de la temrinal
import java.util.Scanner;

public class CalculArees {
    private static double area = 0;
    public static void main (String args[]){
    CalculArees programa = new CalculArees();
    programa.inici();
    }


    public void inici() {
    Scanner s = new Scanner(System.in);


    System.out.println("De quina figura vols calcular l'area?\n");
    System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.\n");

    String figura = s.nextLine();
    switch(figura){
        case "triangle" -> area = Aritmetica.triangle();
        case "quadrat" -> area = Aritmetica.quadrat();
        case "rectangle" -> area = Aritmetica.rectangle();
        case "trapezi" -> area = Aritmetica.trapezi();
        case "rombe" -> area = Aritmetica.rombe();
        case "paralelogram" -> area = Aritmetica.paralelogram();
        case "cercle" -> area = Aritmetica.cercle(s);
        default -> {
            System.out.println("Aquesta figura no està contemplada al programa.");
        }
    }
    System.out.println("L'area de la figura " + figura + " és: " + area);
    }
}