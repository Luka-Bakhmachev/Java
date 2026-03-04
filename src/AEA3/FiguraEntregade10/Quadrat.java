package FiguraEntregade10;

public class Quadrat extends Figura {
    private int costat;

    public Quadrat() { super("square"); }

    public Quadrat(int r) {
        super("square");
        this.costat = r;
    }

    public int getCostat() { return costat; }
    public void setCostat(int costat) { this.costat = costat; }

    @Override
    public double calcularArea() { return this.getCostat() * this.getCostat(); }

    @Override
    public void llegirDades() {
        System.out.print("Enter the side of the square: ");
        this.setCostat(Figura.scanner.nextInt());
    }
}