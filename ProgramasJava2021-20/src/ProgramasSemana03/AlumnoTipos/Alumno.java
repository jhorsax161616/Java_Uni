package ProgramasSemana03.AlumnoTipos;

public class Alumno {
    private int codigo;
    private String nombre;
    
    public void registrar(int n_codigo, String n_nombre)
    {
        codigo = n_codigo;
        nombre = n_nombre;
    }
    public void consultar()
    {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
    }
}
