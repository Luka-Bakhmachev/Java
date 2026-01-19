package AritmeticaModulos;
//importem la biblioteca Scanner per a poder recolir dades de la temrinal
import java.util.Scanner;

public class CalculArees {
    private static double area = 0;
    public static void main (String args[]){
    CalculArees programa = new CalculArees();
    programa.inici();
    }

    
    public  void inici() {
    Scanner s = new Scanner(System.in);


    System.out.println("De quina figura vols calcular l'area?\n");
    System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.\n");

    String figura = s.nextLine();
    switch(figura){
        case "triangle" -> Aritmetica.triangle();
        case "quadrat" -> quadrat();
        case "rectangle" -> rectangle();
        case "trapezi" -> trapezi();
        case "rombe" -> rombe();
        case "paralelogram" -> paralelogram();
        case "cercle" -> cercle(s);
        default -> {
            System.out.println("Aquesta figura no està contemplada al programa.");
        }
    }
    System.out.println("L'area de la figura " + figura + " és: " + area);
    }


  
    
    public static void quadrat(){
        double r = 37.0;
        area = Math.pow(r, 2);
    }
    public static void rectangle(){
        double a = 68.0;
        double b = 39.0;
        area = a*b;
    }
    public static void trapezi(){
        double a = 35.0;
        double b = 16.0;
        double h = 5.0;
        area = ((a*b)*h)/2;
    }
    public static void rombe(){
        double dM = 75.0;
        double dm = 30.0;
        area = (dM*dm)/2;
    }
    public static void paralelogram(){
        double b = 45.0;
        double h = 13.0;
        area = b*h;
    }
    public static void cercle(Scanner s){
        System.out.println("Quin es el radi del cercle?");
        double r = s.nextDouble();
        //funció matemàtica que eleva a 2 el radi
        //Math.PI = nombre pi (3.14159....)
        area = Math.pow(r, 2)*Math.PI; // area = r * r* 3.14;
    }
}