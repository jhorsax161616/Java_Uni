package Sobrecarga_Metodos_Construct;

/**
 *
 * @author jhorsax
 */
public class cliente {
    
    String name;
    String apellidos;
    String alias = "Ninguno";
    
    cliente(String name, String apellidos, String alias){
        this.name = name;
        this.apellidos = apellidos;
        this.alias = alias;
    }
    
    cliente(String name, String apellidos){
        this.name = name;
        this.apellidos = apellidos;
    }
    
    public void showName(){
        System.out.println(name + " " + apellidos + " (" + alias + ")");
    }
}
