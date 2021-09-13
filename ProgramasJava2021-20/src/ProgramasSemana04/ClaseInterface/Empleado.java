package ProgramasSemana04.ClaseInterface;

public class Empleado extends Persona{
    
    public Empleado(int cod, String nombre, int sldo)
    {
        super(cod, nombre);
        this.sueldo = sldo;
    }
    public String mostrarDatos()
    {
        return codigo + "\t" + nombre + "\t" + sueldo;
    }
}
