package Id_Static.UI;

import java.util.Scanner;

public class UIMenu {
    
    public static void showMenu(){
        
        
        int op;
        
        do{
            System.out.println("===BIENVENIDO A MIS CITAS===\n");
            System.out.println("1. Doctor");
            System.out.println("2. Paciente");
            System.out.println("3. Salir");
            
            System.out.println("Ingrese opcion: ");
            
            Scanner sc = new Scanner(System.in);
            op = Integer.valueOf(sc.nextLine());
            
            switch (op){
                case 1:
                {
                    System.out.println("Elegiste Doctor");
                }break;
                case 2:
                {
                    showPacienteMenu();
                }break;
                case 3:
                {
                    System.out.println("Gracias por tu visita");
                }break;
                default:
                {
                    System.out.println("Por favor ingrese una opción correcta");
                }break;
            }    
         
        }while (op != 3);
    }
    
    static void showPacienteMenu(){
        int op2;
        
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Reserva una cita");
            System.out.println("2. Mis citas");
            System.out.println("3. Atras");
            
            Scanner sc = new Scanner(System.in);
            op2 = Integer.valueOf(sc.nextLine());
            
            switch (op2){
                case 1:
                {
                    System.out.println("Reservando cita");
                }break;
                
                case 2:
                {
                    System.out.println("Mostrando cita");
                }break;
                
                case 3:
                {
                    //showMenu();
                    System.out.println("Retrocediendo");
                }break;
                
                default:
                {
                    System.out.println("Por favor ingrese una opcion correcta");
                }break;
            }
        }while (op2 != 3);
    }
}
