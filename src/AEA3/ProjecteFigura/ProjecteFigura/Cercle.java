package ProjecteFigura;

public class Cercle extends Figura {
    private int radi;

    public Cercle() {
        super();
    }

    public Cercle(int r) {
        super("cercle");
        this.radi = r;
    }

    public int getRadi() { return radi; }
    public void setRadi(int radi) { this.radi = radi; }

    @Override
    public double calcularArea() {
        return Math.PI * radi * radi;
        //again, Math.PI. Does anyone go around googling for the value of pi as a function? Idk but i did
    }
}
