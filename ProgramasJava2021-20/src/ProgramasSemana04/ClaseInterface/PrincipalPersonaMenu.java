package ProgramasSemana04.ClaseInterface;

import java.io.*;

public class PrincipalPersonaMenu {

    public static void main(String[] args) {
        // TODO code application logic here
        int op, codemp, coddoc, sld, horas, costo;
        String nombemp, nombdoc;
        
        do{
            System.out.println("===MENU===\n");
            System.out.println("1. Empleado");
            System.out.println("2. Docente");
            System.out.println("3. Salir");
                
            do{
                System.out.print("Ingrese opcion: ");
                op = Integer.parseInt(leerCadena.lectura());
                
                if (op <1 || op >3)
                    System.out.println("Error, Ingrese de nuevo");
            }while (op < 1 || op > 3);
        }while(5 > 5); //CORREGIR
    }
    
}
