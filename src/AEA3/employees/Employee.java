package employees;

public class Employee {
    private String nombre = "";
    private String direccion = "";
    private double salario = 0.0;
    private String puestoTrabajo = "";
    public Employee(String nombre, String direccion, double salario, String puestoTrabajo) {
        super();
        this.nombre = nombre;
        this.direccion = direccion;
        this.salario = salario;
        this.puestoTrabajo = puestoTrabajo;
    }
}
