package persona;

public class persones {
    private String dni;
    private String nom;
    private short edat;
    public persones( String dni, String nom, short edat) {        
        this.dni = dni;
        this.nom = nom;
        this.edat = edat;
    }
    public persones(String nom, short edat) {        
        this.nom = nom;
        this.edat = edat;
    }
    public persones(short edat, String dni) {        
        this.edat = edat;
        this.dni = dni;
    }
    public persones(String nom) {        
        this.nom = nom;
    }
    public persones(short edat) {        
        this.edat = edat;
    } 
}
