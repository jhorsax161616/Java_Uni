package ProgramasSemana02.EmpresaIndustria;

public class Industria {
    
    private String NombInd;
    private Empresa emp;
    
    public void Registrar() // Constructor? y variables locales
    {
        int NRUC;
        String NmEmp;
        float PrdT;
        
        System.out.print("Ingreso de Nombre de la Industria: ");
        NombInd = leerCadena.lectura();
        
        System.out.print("Ingreso de Numero de RUC: ");
        NRUC = Integer.parseInt(leerCadena.lectura());
        
        System.out.print("Ingreso de Nombre de la Empresa: ");
        NmEmp = leerCadena.lectura();
        
        System.out.print("Ingreso de la produccion Total: ");
        PrdT = Float.parseFloat(leerCadena.lectura());
        
        emp = new Empresa (NmEmp, NRUC, PrdT);
    }
    public String consultarEmp()
    {
        String Datos;
        
        Datos = emp.Consultar();
        
        return "\nLos datos de la Empresa son: \n" + Datos;
    }
    public String TotalProd()
    {
        float total;
        
        total = emp.DevolverProd();
        
        return "\nEl total de Produccion es: " + total;
    }
    
}
