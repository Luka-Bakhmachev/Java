package FiguraEntregade10;

public class Triangle extends Figura {
    private int base;
    private int h;

    public Triangle() { super("triangle"); }

    public Triangle(int b, int a) {
        super("triangle");
        this.base = b;
        this.h = a;
    }

    public int getBase() { return base; }
    public void setBase(int base) { this.base = base; }
    public int getH() { return h; }
    public void setH(int h) { this.h = h; }

    @Override
    public double calcularArea() {
        return (this.getBase() * this.getH()) / 2.0; 
    }

    @Override
    public void llegirDades() {
        System.out.print("Enter the base of the triangle: ");
        this.setBase(Figura.scanner.nextInt());
        System.out.print("Enter the height of the triangle: ");
        this.setH(Figura.scanner.nextInt());
    }
}