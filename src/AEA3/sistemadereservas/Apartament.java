package sistemadereservas;

public class Apartament extends Allotjament {
    private int habitacions;
    private boolean teCuina;

    public Apartament(String nom, int capacitat, int habitacions, boolean teCuina) {
        super(nom, capacitat);
        this.habitacions = habitacions;
        this.teCuina = teCuina;
    }

    public int getHabitacions() { return habitacions; }
    public boolean isTeCuina() { return teCuina; }

    @Override
    public double calcularPreuPerNit() {
        return 100 + (habitacions * 10);
    }

    @Override
    public String mostrarInformacio() {
        return "Apartament: " + nom +
                ", Capacitat: " + capacitat +
                ", Habitacions: " + habitacions +
                ", Cuina: " + teCuina +
                ", Preu: " + calcularPreuPerNit() +
                ", Disponible: " + disponible;
    }
}