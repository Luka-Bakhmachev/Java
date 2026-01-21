package agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private int any;
    private List<Pagina> pagines;
    private int indexActual;

    public Agenda(int any) {
        this.any = any;
        this.pagines = new ArrayList<>();
        this.indexActual = 0;
    }

    public void avancarPagina() {
        if (indexActual < pagines.size() - 1) {
            indexActual++;
        }
    }

    public void retrocedirPagina() {
        if (indexActual > 0) {
            indexActual--;
        }
    }

    public Pagina llegirPagina() {
        if (pagines.isEmpty()) return null;
        return pagines.get(indexActual);
    }

    public void afegirPagina(Pagina p) {
        pagines.add(p);
    }
}
