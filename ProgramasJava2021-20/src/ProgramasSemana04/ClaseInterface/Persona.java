package ProgramasSemana04.ClaseInterface;

public abstract class Persona {
    
    protected int codigo;
    protected String nombre;
    protected int sueldo;
    
    public Persona(int cod, String nomb)
    {
        this.codigo = cod;
        this.nombre = nomb;
    }
    
    public abstract String mostrarDatos();
}
