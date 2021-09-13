package ProgramasSemana03.AlumnoTipos;

public class Alumno_Univ extends Alumno{
    private String facultad;
    
    public void regDatos(int n_codigo, String n_nombre, String n_facultad)
    {
        super.registrar(n_codigo, n_nombre);
        facultad = n_facultad;
    }
    public void conDatos()
    {
        super.consultar();
        System.out.println("Facultad: "+ facultad + "\n");
    }
}
