package Enum;
/**
 *
 * @author jhorsax
 */
public class Simples {
    
    //Los enum son para declarar variables constantes por convencion
    //Estas variables son como objetos de la clase Transportes generalmente se aplica cuando se tiene varias variables statics
    //Al ser considerado como una clase, puede tener atributos y comportamientos
    public enum Transportes{
        AVION(1000), TREN(600), AUTO(500);
        
        int velocidad;
        
        Transportes(int s){
            
            velocidad = s;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here

        /*Transportes alls [] = Transportes.values().velocidad;
        
        for (Transportes t : alls){
            System.out.println(t);
        }*/

        System.out.println(Transportes.AVION.velocidad);
        System.out.println(Transportes.TREN.velocidad);
        System.out.println(Transportes.AUTO.velocidad);
    }
    
}
