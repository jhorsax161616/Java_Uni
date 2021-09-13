package ProgramasSemana04.EjemploClaseInterna;

public class PrincipCtaBanco {

    public static void main(String[] args) {
        // TODO code application logic here
        double bal, rat;
        
        System.out.print("Ingrese balance: ");
        bal = Integer.parseInt(leerCadena.lectura());
        
        System.out.print("Ingrese ratio: ");
        rat = Integer.parseInt(leerCadena.lectura());
        
        CExternaCtaBanco cta1 = new CExternaCtaBanco(bal, rat);
        
        cta1.Reporte();
    }
    
}
