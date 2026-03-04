package FiguraEntregade10;

public class Trapezi extends Figura {
    private int a;
    private int b;
    private int h;

    public Trapezi() { super("trapezoid"); }

    public Trapezi(int a, int b, int h) {
        super("trapezoid");
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public int getA() { return a; }
    public void setA(int a) { this.a = a; }
    public int getB() { return b; }
    public void setB(int b) { this.b = b; }
    public int getH() { return h; }
    public void setH(int h) { this.h = h; }

    @Override
    public double calcularArea() { return ((this.getA() + this.getB()) * this.getH()) / 2.0; }

    @Override
    public void llegirDades() {
        System.out.print("Enter the top base (a): ");
        this.setA(Figura.scanner.nextInt());
        System.out.print("Enter the bottom base (b): ");
        this.setB(Figura.scanner.nextInt());
        System.out.print("Enter the height (h): ");
        this.setH(Figura.scanner.nextInt());
    }
}