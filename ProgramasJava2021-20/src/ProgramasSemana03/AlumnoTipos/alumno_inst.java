package ProgramasSemana03.AlumnoTipos;

public class alumno_inst extends Alumno{
    private String espec;
    
    public void regDatos(int n_codigo, String n_nombre, String n_spec)
    {
        super.registrar(n_codigo, n_nombre);
        espec = n_spec;
    }
    public void conDatos()
    {
        super.consultar();
        System.out.println("Especialidad: "+ espec + "\n");
    }
}
