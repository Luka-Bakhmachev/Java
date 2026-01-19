package AritmeticaModulos;

import java.util.Scanner;

public class Aritmetica {
    //private static double area = 0;

    public static double triangle(){
        double b = 23.0;
        double h = 8.0;
        return (b*h)/2;
    }
    public static double quadrat(){
        double r = 37.0;
        return Math.pow(r, 2);
    }
    public static double rectangle(){
        double a = 68.0;
        double b = 39.0;
        return a*b;
    }
    public static double trapezi(){
        double a = 35.0;
        double b = 16.0;
        double h = 5.0;
        return ((a*b)*h)/2;
    }
    public static double rombe(){
        double dM = 75.0;
        double dm = 30.0;
        return (dM*dm)/2;
    }
    public static double paralelogram(){
        double b = 45.0;
        double h = 13.0;
        return b*h;
    }
    public static double cercle(Scanner s){
        System.out.println("Quin es el radi del cercle?");
        double r = s.nextDouble();
        //funció matemàtica que eleva a 2 el radi
        //Math.PI = nombre pi (3.14159....)
        return Math.pow(r, 2)*Math.PI; // area = r * r* 3.14;
    }

    
}
