package persona;

public class PersonaMaker {
    public static void main(String[] args) {
        Persona p = new Persona();
        change.setNom(p, "Alice");
        change.setDni(p, "12345678A");
        change.setEdat(p, 25);
        p.visualitzar();
    }
}
