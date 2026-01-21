package agenda;

import java.util.ArrayList;
import java.util.List;

public class Pagina {
    private int dia;
    private int mes;
    private List<Cita> cites;

    public Pagina(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
        this.cites = new ArrayList<>();
    }

    public void afegirCita(Cita c) {
        cites.add(c);
    }

    public void borrarCita(Cita c) {
        cites.remove(c);
    }

    public Cita cercarCita(String titol) {
        for (Cita c : cites) {
            if (c.getTitol().equals(titol)) {
                return c;
            }
        }
        return null;
    }

    public List<Cita> llistarCites() {
        return cites;
    }
}