package FiguraEntregade10;

public class Cercle extends Figura {
    private int radi;

    public Cercle() { super("circle"); }

    public Cercle(int r) {
        super("circle");
        this.radi = r;
    }

    public int getRadi() { return radi; }
    public void setRadi(int radi) { this.radi = radi; }

    @Override
    public double calcularArea() { return Math.PI * Math.pow(this.getRadi(), 2); }

    @Override
    public void llegirDades() {
        System.out.print("Enter the radius of the circle: ");
        this.setRadi(Figura.scanner.nextInt());
    }
}