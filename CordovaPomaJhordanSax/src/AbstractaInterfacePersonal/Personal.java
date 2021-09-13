package AbstractaInterfacePersonal;

public abstract class Personal {
    
    int DNIPersonal;
    String Nombres;
    int CantDiasTrabajados;
    float SueldoBase;
    
    public void Registrar(int DNIPersonal, String Nombres, int CantDiasTrabajados, float SueldoBase)
    {
        this.DNIPersonal = DNIPersonal;
        this.CantDiasTrabajados = CantDiasTrabajados;
        this.Nombres = Nombres;
        this.SueldoBase = SueldoBase;
    }
    
    public abstract void CalculaSueldoTotal();
}
