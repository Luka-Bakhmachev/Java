package ProjecteFigura;

public class Triangle extends Figura {
    private int base;
    private int h;

    public Triangle() {
        super();
    }

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
        return (base * h) / 2.0;
    }
}
