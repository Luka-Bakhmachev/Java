package ProjecteFigura;

public class Parallelogram extends Figura {
    private int b;
    private int h;

    public Parallelogram() {
        super();
    }

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
    public double calcularArea() {
        return b * h;
    }
}
