package employees;

public class Manager extends Employee {
    private int numTrabajadores = 0;
    
    public Manager(String nombre, String direccion, double salario) {
        super(nombre, direccion, salario, "Manager");
        ++numTrabajadores;
    }
}