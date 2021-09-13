package ProgramasSemana03.PersonaTipos;

public class Persona {
    String nombre;
    
    public void Registrar(String nombre)
    {
        this.nombre = nombre;
    }
    public void Mostrar()
    {
        System.out.println("Nombre: " + nombre);
    }
}
