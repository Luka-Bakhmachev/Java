package FiguraEntregade10;
import java.util.Random;

public class CalculaArees {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Welcome to the Area Calculator.");

        do {
            System.out.println("\n--- SHAPES MENU ---");
            System.out.println("1. Triangle\n2. Square\n3. Rectangle\n4. Trapezoid");
            System.out.println("5. Rhombus\n6. Parallelogram\n7. Circle");
            System.out.print("Which shape do you want to create? (1-7): ");
            
            int opcio = Figura.scanner.nextInt();
            Figura f = null; 
            
            boolean usarConstructorComplex = rand.nextBoolean();

            switch (opcio) {
                case 1 -> {
                    if (usarConstructorComplex) {
                        System.out.print("Enter the base of the triangle: ");
                        int b = Figura.scanner.nextInt();
                        System.out.print("Enter the height of the triangle: ");
                        int h = Figura.scanner.nextInt();
                        f = new Triangle(b, h);
                    } else {
                        f = new Triangle();
                        f.llegirDades(); 
                    }
                }
                case 2 -> {
                    if (usarConstructorComplex) {
                        System.out.print("Enter the side of the square: ");
                        int costat = Figura.scanner.nextInt();
                        f = new Quadrat(costat);
                    } else {
                        f = new Quadrat();
                        f.llegirDades();
                    }
                }
                case 3 -> {
                    if (usarConstructorComplex) {
                        System.out.print("Enter the first side of the rectangle: ");
                        int c1 = Figura.scanner.nextInt();
                        System.out.print("Enter the second side of the rectangle: ");
                        int c2 = Figura.scanner.nextInt();
                        f = new Rectangle(c1, c2);
                    } else {
                        f = new Rectangle();
                        f.llegirDades();
                    }
                }
                case 4 -> {
                    if (usarConstructorComplex) {
                        System.out.print("Enter the top base (a): ");
                        int a = Figura.scanner.nextInt();
                        System.out.print("Enter the bottom base (b): ");
                        int b = Figura.scanner.nextInt();
                        System.out.print("Enter the height (h): ");
                        int h = Figura.scanner.nextInt();
                        f = new Trapezi(a, b, h);
                    } else {
                        f = new Trapezi();
                        f.llegirDades();
                    }
                }
                case 5 -> {
                    if (usarConstructorComplex) {
                        System.out.print("Enter the major diagonal (dM): ");
                        int dM = Figura.scanner.nextInt();
                        System.out.print("Enter the minor diagonal (dm): ");
                        int dm = Figura.scanner.nextInt();
                        f = new Rombe(dM, dm);
                    } else {
                        f = new Rombe();
                        f.llegirDades();
                    }
                }
                case 6 -> {
                    if (usarConstructorComplex) {
                        System.out.print("Enter the base: ");
                        int b = Figura.scanner.nextInt();
                        System.out.print("Enter the height: ");
                        int h = Figura.scanner.nextInt();
                        f = new Parallelogram(b, h);
                    } else {
                        f = new Parallelogram();
                        f.llegirDades();
                    }
                }
                case 7 -> {
                    if (usarConstructorComplex) {
                        System.out.print("Enter the radius of the circle: ");
                        int r = Figura.scanner.nextInt();
                        f = new Cercle(r);
                    } else {
                        f = new Cercle();
                        f.llegirDades();
                    }
                }
                default -> System.out.println("Invalid option. Please choose a number between 1 and 7.");
            }
            if (f != null) {
                f.imprimirDades();
            }
        } while (Figura.seguentFigura()); 
        System.out.println("Program finished.");
        Figura.scanner.close(); 
    }
}