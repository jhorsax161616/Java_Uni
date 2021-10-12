package ProgramasSemana09.Excepciones;

import java.io.*;

public class EjemploExcepciones3 {
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        String respuesta = null;
        
        try
        {
            System.out.print("Sumando 1: ");
            int s1 = Integer.parseInt(br.readLine());
            
            System.out.print("Sumando 2: ");
            int s2 = Integer.parseInt(br.readLine());
            
            int suma = s1/s2;
            
            respuesta = String.valueOf(suma);
        }
        
        catch(NumberFormatException ex){
            respuesta = "Se han introducido caracteres no numéricos.";
        }
        
        catch(ArithmeticException ex){
            respuesta = "División entre cero. No es posible realizar";
        }
        
        finally{
            System.out.println(respuesta);
        }
    }  
}
