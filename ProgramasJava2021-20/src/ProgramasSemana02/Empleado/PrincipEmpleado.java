package ProgramasSemana02.Empleado;

class Empleado {
    private String Nombres;
    private String Apellidos;
    private int Edad;
    
    public void Registrar(String Nombre, String Apellido, int Ed)
    {
        this.Nombres = Nombre;
        this.Apellidos = Apellido;
        this.Edad = Ed;
    }
    public void Mostrar()
    {
        System.out.println("Su nombre es: " + Nombres);
        System.out.println("Su apellido es: " + Apellidos);
        System.out.println("Su edad es: " + Edad);
    }
}

public class PrincipEmpleado {

    public static void main(String[] args) {
        
        Empleado Emp = new Empleado();
        
        Emp.Registrar("Pablo", "Escobar", 25);
        
        Emp.Mostrar();
    }
    
}
