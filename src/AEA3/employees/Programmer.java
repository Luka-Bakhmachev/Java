package employees;

public class Programmer extends Employee {
    private String lenguajeProgramacion = "";
    
    public Programmer(String nombre, String direccion, double salario, String lenguajeProgramacion) {
        super(nombre, direccion, salario, lenguajeProgramacion);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }
    
}
