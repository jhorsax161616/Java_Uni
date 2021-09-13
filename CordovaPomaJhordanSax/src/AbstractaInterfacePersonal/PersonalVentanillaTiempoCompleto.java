package AbstractaInterfacePersonal;

public class PersonalVentanillaTiempoCompleto extends PersonalVentanilla implements IterfacePVTC{
    
    private float Aguinaldos;
    private float Utilidades;
    int CantHorasExtras;
    
    public void IngresePVTC(float Aguinaldos, float Utilidades, int CantHorasExtras, int DNIPersonal, String Nombres, float SueldoBase)
    {
        super.IngreseDatos(DNIPersonal, Nombres, SueldoBase);
        this.Aguinaldos = Aguinaldos;
        this.Utilidades = Utilidades;
        this.CantHorasExtras = CantHorasExtras;
    }
    public float CalculaBeneficios()
    {
        return Aguinaldos + Utilidades;
    }
    public void CalculaSueldoTotal()
    {
        this.pagoTotal = this.SueldoBase + CantHorasExtras * 7 + CalculaBeneficios();
    }
    public void MuestrePVTC()
    {
        CalculaSueldoTotal();
        super.MuestraDatos();
        System.out.println("Utilidades: " + Utilidades);
        System.out.println("CantHorasExtras: " + CantHorasExtras);
        System.out.println("Aguinaldos: " + Aguinaldos);
        System.out.println("Beneficios: " + CalculaBeneficios());
        System.out.println("\nPago Total: " + this.pagoTotal);
    }
    
}
