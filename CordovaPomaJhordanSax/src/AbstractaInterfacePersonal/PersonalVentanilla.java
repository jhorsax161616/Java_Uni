package AbstractaInterfacePersonal;

public class PersonalVentanilla extends Personal{
    
    float pagoTotal;
    public void IngreseDatos(int DNIPersonal, String Nombres, float SueldoBase)
    {
        super.Registrar(DNIPersonal, Nombres, 1, SueldoBase);
    }
    public void MuestraDatos()
    {
        System.out.println("Nombres: "+ Nombres);
        System.out.println("DNI: "+ DNIPersonal);
        System.out.println("Sueldo Base: "+ SueldoBase);
    }

    @Override
    public void CalculaSueldoTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
