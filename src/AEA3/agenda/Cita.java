package agenda;

public class Cita {
    private int hora;
    private int minuts;
    private String titol;
    private String text;

    public Cita(int hora, int minuts, String titol, String text) {
        this.hora = hora;
        this.minuts = minuts;
        this.titol = titol;
        this.text = text;
    }

    public String getTitol() {
        return titol;
    }

    public void modificarText(String text) {
        this.text = text;
    }
}