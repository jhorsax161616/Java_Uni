package Arrays;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jhorsax
 */
public class Arrays_Diversos_Datos {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList python = new ArrayList();
        
        python.add("Hola");
        python.add(5);
        python.add(2.69);
        python.add(true);
        python.add('A');
        
        Iterator my_iterador = python.iterator();
        while(my_iterador.hasNext()){
            System.out.println(my_iterador.next());
        }
        
    }
    
}
