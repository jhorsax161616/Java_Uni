package AbstractaInterfacePersonal;

public class PersonalDirectivo extends Personal{
    float PagoComision;
    float SueldoTotal;
    
    public void IngreseDatosPD(float SueldoBase, float PagoComision, int DNIPersonal, String Nombres, int CantDiasTrabajados)
    {
        super.Registrar(DNIPersonal, Nombres, CantDiasTrabajados, SueldoBase);
        this.PagoComision = PagoComision;
        this.SueldoBase = SueldoBase;
    }
    public void CalculaSueldoTotal()
    {
        SueldoTotal = PagoComision * this.CantDiasTrabajados + SueldoBase;
    }
    public void MuestraDatosPD()
    {
        CalculaSueldoTotal();
        System.out.println("Nombres: "+ Nombres);
        System.out.println("DNI: "+ DNIPersonal);
        System.out.println("Sueldo Base: "+ SueldoBase);
        System.out.println("Pago Comision: "+ PagoComision);
        System.out.println("Cantidad de dias Trabajados: "+ CantDiasTrabajados);
        System.out.println("\nSueldo Total: "+ SueldoTotal);
    }
}
