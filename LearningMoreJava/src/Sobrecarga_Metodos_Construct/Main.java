package Sobrecarga_Metodos_Construct;

/**
 *
 * @author jhorsax
 */
public class Main {

    public static void main(String[] args) {
        // Sobrecarga de métodos
        int entero = 5;
        float decimal = (float) 2.3;
        
        System.out.println(Calculadora.suma(entero, entero));
        System.out.println(Calculadora.suma(decimal, decimal));
        System.out.println(Calculadora.suma(decimal, entero));
        System.out.println(Calculadora.suma(entero, decimal));
        
        //Sobrecarga de Constructores
        cliente per1 = new cliente("Pedro", "Pablo", "El chinito");
        
        cliente per2 = new cliente("Tito", "Vazques");
        
        per1.showName();
        per2.showName();
    }
    
}
