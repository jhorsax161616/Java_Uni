package AbstractaInterfacePersonal;

public class PersonalVentanillaTiempoParcial extends PersonalVentanilla{
    int CantHorasAsignadas;
    float sueldott;
    
    public void IngresePVTP(int CantHorasAsignadas, int DNIPersonal, String Nombres, int CantDiasTrabajados)
    {
        super.IngreseDatos(DNIPersonal, Nombres, 0);
        this.CantHorasAsignadas = CantHorasAsignadas;
        this.CantDiasTrabajados = CantDiasTrabajados;
    }
    public void CalculaSueldoTotal()
    {
        sueldott = CantHorasAsignadas * CantDiasTrabajados;
    }
    public void MuestrePVTP()
    {
        CalculaSueldoTotal();
        super.MuestraDatos();
        System.out.println("Cantidad Horas Asignadas: " + CantHorasAsignadas);
        System.out.println("Cantidad Dias Tranajados: " + CantDiasTrabajados);

        System.out.println("\nPago Total: " + sueldott);
        
    }
    
}
