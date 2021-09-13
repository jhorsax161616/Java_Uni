package HerenciaProducto;

import java.io.*;

public class leerCadena {
    public static String lectura()
    {
        String cadena = null;
        try{
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        cadena = input.readLine();
        }
        catch(IOException e){
            System.out.println("Algo salio mal :( ");
        }
        return cadena;
    }
}
