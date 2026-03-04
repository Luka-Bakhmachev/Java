package ProjecteFigura;

public class CalculaArees {
    public static void main(String[] args) {
        
        // 1. Triangle (Ús constructor complex)
        Triangle triangle = new Triangle(23, 24); // (23*24)/2 = 276.0
        triangle.imprimirDades();

        // 2. Quadrat (Ús constructor complex)
        // Nota: A la teva captura dóna 6.0, però com el costat és int, 
        // hem posat 3 perquè l'àrea doni un número enter coherent (9.0).
        Quadrat quadrat = new Quadrat(3); 
        quadrat.imprimirDades();

        // 3. Rectangle (NOMÉS ús del constructor bàsic, tal com s'exigeix)
        Rectangle rectangle = new Rectangle();
        rectangle.setFigura("rectangle"); // Assignem el nom amb el setter
        rectangle.setCostat1(6);          // Assignem valors amb els setters
        rectangle.setCostat2(8);          // 6*8 = 48.0
        rectangle.imprimirDades();

        // 4. Trapezi (Ús constructor complex)
        Trapezi trapezi = new Trapezi(10, 20, 15); // ((10+20)*15)/2 = 225.0
        trapezi.imprimirDades();

        // 5. Rombe (Ús constructor complex)
        Rombe rombe = new Rombe(6, 6); // (6*6)/2 = 18.0
        rombe.imprimirDades();

        // 6. Parallelogram (Ús constructor complex)
        Parallelogram parallelogram = new Parallelogram(2, 7); // 2*7 = 14.0
        parallelogram.imprimirDades();

        // 7. Cercle (Ús constructor complex)
        Cercle cercle = new Cercle(23); // Math.PI * 23 * 23 = 1661.9025...
        cercle.imprimirDades();
    }
}
