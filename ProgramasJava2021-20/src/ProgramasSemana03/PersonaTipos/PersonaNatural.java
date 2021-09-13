package ProgramasSemana03.PersonaTipos;

public class PersonaNatural extends Persona{
    int numDNI;
    String genero;
    
    public void RegistrarNat(int numDNI, String genero, String name)
    {
        super.Registrar(name);
        this.numDNI = numDNI;
        this.genero = genero;
    }
    public void MostrarNat()
    {
        super.Mostrar();
        System.out.println("Numero DNI: " + numDNI);
        System.out.println("Genero: " + genero);
    }
}
