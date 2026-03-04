package FiguraEntregade10;

public class Rombe extends Figura {
    private int dM;
    private int dm;

    public Rombe() { super("rhombus"); }

    public Rombe(int dM, int dm) {
        super("rhombus");
        this.dM = dM;
        this.dm = dm;
    }

    public int getDM() { return dM; }
    public void setDM(int dM) { this.dM = dM; }
    public int getDm() { return dm; }
    public void setDm(int dm) { this.dm = dm; }

    @Override
    public double calcularArea() { return (this.getDM() * this.getDm()) / 2.0; }

    @Override
    public void llegirDades() {
        System.out.print("Enter the major diagonal (dM): ");
        this.setDM(Figura.scanner.nextInt());
        System.out.print("Enter the minor diagonal (dm): ");
        this.setDm(Figura.scanner.nextInt());
    }
}