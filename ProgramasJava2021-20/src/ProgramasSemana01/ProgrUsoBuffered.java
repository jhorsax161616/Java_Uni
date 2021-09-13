package ProgramasSemana01;

import java.io.*;

public class ProgrUsoBuffered {

    public static void main(String[] args) throws IOException{
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int num1, num2, num3;
        
        System.out.print("Ingrese numero 1: ");
        num1 = Integer.parseInt(input.readLine());
        
        System.out.print("Ingrese numero 2: ");
        num2 = Integer.parseInt(input.readLine());
        
        num3 = num1 + num2;
        
        System.out.println("La suma es: " + num3);
        
    }
    
}
