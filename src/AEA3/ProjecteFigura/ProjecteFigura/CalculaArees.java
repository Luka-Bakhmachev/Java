package ProjecteFigura;

public class CalculaArees {
    public static void main(String[] args) {
        //Ever seen a use of empty comments? I think empty comments are underappriciated these days.
        //Why would I use them? Well idk. Gonna be my signature move i guess :D
        Triangle triangle = new Triangle(23, 24);
        triangle.imprimirDades();

        //
        Quadrat quadrat = new Quadrat(3); 
        quadrat.imprimirDades();

        //
        Rectangle rectangle = new Rectangle();
        rectangle.setFigura("rectangle"); 
        rectangle.setCostat1(6);
        rectangle.setCostat2(8);
        rectangle.imprimirDades();

        //
        Trapezi trapezi = new Trapezi(10, 20, 15); 
        trapezi.imprimirDades();

        //
        Rombe rombe = new Rombe(6, 6); 
        rombe.imprimirDades();

        //I wonder who genuinelly names these shapes. Espcecially like that.
        Parallelogram parallelogram = new Parallelogram(2, 7);
        parallelogram.imprimirDades();

        //Who'd think of using Math.PI as an actual function? I could've just used a 3.14 and not bother honestly.
        Cercle cercle = new Cercle(23);
        cercle.imprimirDades();
    }
}
