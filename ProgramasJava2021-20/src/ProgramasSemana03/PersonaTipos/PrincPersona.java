package ProgramasSemana03.PersonaTipos;

public class PrincPersona {

    public static void main(String[] args) {
        PersonaNatural p1 = new PersonaNatural();
        PersonaJuridica p2 = new PersonaJuridica();
        
        String nombre, genero, nombreR;
        int op, numDNI, numRUC;
        
        do{
            do{
                System.out.print("====MENU===\n\n");
                System.out.println("1.Persona Natural");
                System.out.println("2.Persona Juridica");
                System.out.println("3.Salir");
                
                System.out.print("Ingrese una opcion: ");
                op = Integer.parseInt(leerCadena.lectura());
                if(op<1 || op>3)
                    System.out.println("Error, vuelve a ingresar. \n");
                
            }while(op<1 || op>3);
            
            switch(op)
            {
                case 1:{
                    
                    System.out.print("Ingrese nombre: ");
                    nombre = leerCadena.lectura();
                    
                    System.out.print("Ingrese numero DNI: ");
                    numDNI = Integer.parseInt(leerCadena.lectura());
                                        
                    System.out.print("Ingrese genero: ");
                    genero = leerCadena.lectura();
                    
                    p1.RegistrarNat(numDNI, genero, nombre);
                    System.out.println("\n==DATOS==\n");
                    p1.MostrarNat();
                           
                }break;
                
                case 2:{
                    System.out.print("Ingrese nombre: ");
                    nombre = leerCadena.lectura();
                    
                    System.out.print("Ingrese numero RUC: ");
                    numRUC = Integer.parseInt(leerCadena.lectura());
                                        
                    System.out.print("Ingrese nombre Representante: ");
                    nombreR = leerCadena.lectura();
                    
                    p2.RegistrarJud(nombre, numRUC, nombreR);
                    System.out.println("\n==DATOS==\n");
                    p2.MostrarJud();
                }break;
                
                case 3:{
                    System.out.println("Adios.. Gracias por la visita");
                }break;
            }
        }while(op!=3);
    }
    
}
