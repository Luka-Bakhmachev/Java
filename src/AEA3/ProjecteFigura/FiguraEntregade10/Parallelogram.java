package FiguraEntregade10;

public class Parallelogram extends Figura {
    private int b;
    private int h;

    public Parallelogram() { super("parallelogram"); }

    public Parallelogram(int b, int h) {
        super("parallelogram");
        this.b = b;
        this.h = h;
    }

    public int getB() { return b; }
    public void setB(int b) { this.b = b; }
    public int getH() { return h; }
    public void setH(int h) { this.h = h; }

    @Override
    public double calcularArea() { return this.getB() * this.getH(); }

    @Override
    public void llegirDades() {
        System.out.print("Enter the base: ");
        this.setB(Figura.scanner.nextInt());
        System.out.print("Enter the height: ");
        this.setH(Figura.scanner.nextInt());
    }
}