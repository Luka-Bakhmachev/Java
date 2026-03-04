package ProjecteFigura;

public class Figura {
    private static int comptadorId = 1; 
    
    protected String figura;
    protected int id;


    public Figura() {
        this.id = comptadorId++;
        this.figura = ""; 
    }

    public Figura(String figura) {
        this.id = comptadorId++;
        this.figura = figura;
    }


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


    public double calcularArea() {
        return 0.0;
    }


    public void imprimirDades() {
        
        System.out.println("La figura amb id " + id + " és un " + figura + ".");
        System.out.println("L'àrea del " + figura + " és: " + calcularArea());
        System.out.println("-------------");
    }
}
