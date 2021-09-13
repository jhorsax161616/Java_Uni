package ProgramasSemana03.PersonaTipos;

public class PersonaJuridica extends Persona{
    int numRuc;
    String nombreRepresentante;
    
    public void RegistrarJud(String name, int numRUC, String nombreR)
    {
        super.Registrar(name);
        this.numRuc = numRUC;
        this.nombreRepresentante = nombreR;
    }
    public void MostrarJud()
    {
        super.Mostrar();
        System.out.println("Numero RUC: " + numRuc);
        System.out.println("Nombre representante: " + nombreRepresentante);
    }
}
