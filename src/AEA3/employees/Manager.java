package employees;

public class Manager extends Employee {
    private int numTrabajadores = 0;
    
    public Manager(String nombre, double salario) {
        super(nombre, salario, "Manager");
        
        ++numTrabajadores;
    }
}