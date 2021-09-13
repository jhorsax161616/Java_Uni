package ProgramasSemana01;

import java.io.*;
import java.io.IOException;

public class ProgramaCajero {

    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                
        int op; float mdp, mrt, msd = 0;
        
        do{
            System.out.println("\n==== CAJERO ====");
            System.out.println("\n1.Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Saldo");
            System.out.println("4. Salir");
            System.out.print("\nSeleccione opción: ");
            op = Integer.parseInt(input.readLine());
            
            if (op != 4){

                switch(op)
                {
                    case 1: {   do{
                                    System.out.print("Ingrese monto a depositar: ");
                                    mdp = Float.parseFloat(input.readLine());
                                    if(mdp <= 0)
                                        System.out.println("ERROR. Vuelva a ingresar..");
                                }while(mdp <= 0);
                                
                                msd += mdp;
                            }break;
                    case 2: {   do{
                                    System.out.print("Ingrese monto a retirar: ");
                                    mrt = Float.parseFloat(input.readLine());
                                    if(mrt <= 0)
                                        System.out.println("ERROR. Vuelva a ingresar..");
                                }while(mrt <= 0);
                                
                                if(mrt <= msd)
                                    msd = msd - mrt;
                                else
                                    System.out.println("Saldo insuficiente");
                        
                            }break;
                    case 3: {
                            System.out.print("Su saldo es: " + msd);
                        }break;
                }
            }
        }while (op != 4);
    }
    
}
