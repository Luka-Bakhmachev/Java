package ProjecteFigura;

public class Figura {
    // Ús de static per autoincrementar l'ID automàticament
    private static int comptadorId = 1; 
    
    protected String figura;
    protected int id;

    // Constructor bàsic
    public Figura() {
        this.id = comptadorId++;
        this.figura = ""; 
    }

    // Constructor complex
    public Figura(String figura) {
        this.id = comptadorId++;
        this.figura = figura;
    }

    // Getters i Setters
    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Mètode per defecte per ser sobreescrit pel polimorfisme
    public double calcularArea() {
        return 0.0;
    }

    // Mètode comú per imprimir
    public void imprimirDades() {
        // Adaptat a la sortida de la imatge
        System.out.println("La figura amb id " + id + " és un " + figura + ".");
        System.out.println("L'àrea del " + figura + " és: " + calcularArea());
        System.out.println("-------------");
    }
}
