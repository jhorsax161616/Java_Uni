package ProgramasSemana04.ClaseInterface;

public class Docente extends Persona implements IfaceDocente{
    
    public Docente(int cod , String nomb)
    {
        super(cod, nomb);
    }
    public void asignaCarga(int horas, int costo)
    {
        this.sueldo = horas * costo;
    }
    public String mostrarDatos()
    {
        return codigo + "\t" + nombre + "\t" + sueldo;
    }
}
