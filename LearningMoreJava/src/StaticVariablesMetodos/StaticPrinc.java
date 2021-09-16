package StaticVariablesMetodos;

import static StaticVariablesMetodos.StaticClass.*;

public class StaticPrinc {

    public static void main(String[] args) {
        // TODO code application logic here
        int suma = StaticClass.suma(5, 10);
        
        System.out.println("Suma es: " + suma);
        
        //System.out.println("Valor pi: " + StaticClass.PI);
        
        System.out.println("La guia esta en: " + StaticClass.guia);
        
        //SI HACEMOS USO DEL IMPORT
        
        System.out.println("\nLa suma es: " + suma(10,-6));
        
        System.out.println("Valor pi: " + PI);
    }
    
}
