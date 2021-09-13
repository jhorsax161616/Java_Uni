package ProgramasSemana02.Alumno;

public class PrincipAlumno {

    public static void main(String[] args){
        Alumno alum = new Alumno();
        
        System.out.println("_INGRESO DE DATOS DE ALUMNO_");
        alum.Registrar();
        
        System.out.println("_REPORTE DE DATOS DE ALUMNO_");
        alum.Mostrar();
        
    }
    
}
