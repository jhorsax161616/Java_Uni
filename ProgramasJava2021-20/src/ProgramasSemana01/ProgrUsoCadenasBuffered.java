package ProgramasSemana01;

import java.io.*;

public class ProgrUsoCadenasBuffered {

    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String name_People;
        char sex_People;
        
        System.out.print("Ingrese nombre: ");
        name_People = input.readLine();
        
        System.out.print("Ingrese genero: ");
        sex_People = (char)input.read();
        
        System.out.println("Name: "+ name_People + " Genero: " + sex_People);
    }
    
}
