package Arrays;

import java.util.ArrayList;
import java.util.Iterator; //Para iterar el array

/**
 * @author jhorsax
 */
public class array_list {
    public static void main(String[] args) {
        // los array list permite almacenar datos en memoria de forma dinamica
        
        //Este es un array de Strings, podemos usar otros tipos tambien
        ArrayList<String> nombres = new ArrayList<>();
        
        //Añaden el elemento Juan al array
        nombres.add("Juan");
        
        //Añade el elemento en la posicion dada -->2
        nombres.add(1,"Capo");
        nombres.add(2,"Pablo");
        
        //Devuelve numero de elementos del array
        System.out.println(nombres.size());
        
        //Devuelve el elemento en la posicion dada --> 2
        System.out.println(nombres.get(2));
        
        //Comprueba si existe el elemento dado
        System.out.println(nombres.contains("Pablo"));
        System.out.println(nombres.contains("PPP"));
        
        //Devuelve la posicion de la primera ocurrencia del elemento
        System.out.println(nombres.indexOf("Capo"));
        
        //Devuelve la posicion de la ultima ocurrencia del elemento
        System.out.println(nombres.lastIndexOf("Pablo"));
        
        //Borra el elemento de la posicion dada
        nombres.remove(2);
        
        //Borra la priemera ocurrencia del elemento dado
        nombres.remove("Juan");
        
        //Borra todos los elementos del array
        nombres.clear();
        
        //Devuelve true si el array esta vacio
        System.out.println(nombres.isEmpty());
        
        //Podemos copiar el arraylist con clone() y pasar a un array con toArray();
        
        //LOS ITERADORES SE MANEJAN DE UNA FORMA PARTICULAR
        
        // Declaración el ArrayList
        ArrayList<String> nombreArrayList = new ArrayList<String>();

        // Añadimos 10 Elementos en el ArrayList
        for (int i=1; i<=10; i++){
            nombreArrayList.add("Elemento "+i); 
        }

        // Añadimos un nuevo elemento al ArrayList en la posición 2
        nombreArrayList.add(2, "Elemento 3");

        // Declaramos el Iterador e imprimimos los Elementos del ArrayList
        Iterator<String> nombreIterator = nombreArrayList.iterator();
        while(nombreIterator.hasNext()){
            String elemento = nombreIterator.next();
            System.out.print(elemento+" / ");
        }
        
        //Referencia gracias a: https://jarroba.com/arraylist-en-java-ejemplos/
    }
    
}
