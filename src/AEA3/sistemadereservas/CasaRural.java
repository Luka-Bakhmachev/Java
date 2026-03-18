package sistemadereservas;

public class CasaRural extends Allotjament {
    private boolean teJardi;
    private boolean tePiscina;

    public CasaRural(String nom, int capacitat, boolean teJardi, boolean tePiscina) {
        super(nom, capacitat);
        this.teJardi = teJardi;
        this.tePiscina = tePiscina;
    }

    public boolean isTeJardi() { return teJardi; }
    public boolean isTePiscina() { return tePiscina; }

    @Override
    public double calcularPreuPerNit() {
        double preu = 150;
        if (tePiscina) preu += 50;
        return preu;
    }

    @Override
    public String mostrarInformacio() {
        return "Casa Rural: " + nom +
                ", Capacitat: " + capacitat +
                ", Jardi: " + teJardi +
                ", Piscina: " + tePiscina +
                ", Preu: " + calcularPreuPerNit() +
                ", Disponible: " + disponible;
    }
}