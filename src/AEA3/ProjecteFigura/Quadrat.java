package AEA3.ProjecteFigura;

public class Quadrat extends Figura {
    private int costat;

    public Quadrat() {
        super();
    }

    public Quadrat(int r) {
        super("quadrat");
        this.costat = r;
    }

    public int getCostat() { return costat; }
    public void setCostat(int costat) { this.costat = costat; }
    //boring shape
    @Override
    public double calcularArea() {
        return costat * costat; 
    }
}