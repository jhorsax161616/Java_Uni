package ProgramasSemana04.ClaseInterface;

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
            
            switch(op)
            {
                case 1:{
                    System.out.println("-----Ingrese datos del Empleado------");
                    
                    System.out.println("Ingrese Codigo del Empleado: ");
                    codemp = Integer.parseInt(leerCadena.lectura());
                    
                    System.out.println("Ingrese nombre del empleado: ");
                    nombemp = leerCadena.lectura();
                    
                    System.out.println("Ingrese Sueldo del Empleado: ");
                    sld = Integer.parseInt(leerCadena.lectura());
                    
                    Empleado emp = new Empleado(codemp, nombemp, sld);
                    
                    System.out.println("==Mostrar Datos del Empleado==");
                    System.out.println(emp.mostrarDatos());
                }break;
                
                case 2:{
                    System.out.println("-----Ingrese datos del Docente------");
                    
                    System.out.println("Ingrese Codigo del Docente: ");
                    coddoc = Integer.parseInt(leerCadena.lectura());
                    
                    System.out.println("Ingrese nombre del Docente: ");
                    nombdoc = leerCadena.lectura();
                    
                    Docente docen = new Docente(coddoc, nombdoc);
                    
                    System.out.println("Ingrese Horas: ");
                    horas = Integer.parseInt(leerCadena.lectura());
                    
                    System.out.println("Ingrese Costo: ");
                    costo = Integer.parseInt(leerCadena.lectura());
                    
                    docen.asignaCarga(horas, costo);
                    
                    System.out.println("==Mostrar Datos del Docente==");
                    System.out.println(docen.mostrarDatos());
                }break;
                
                case 3:{
                    System.out.println("\tGracias...!!! Vuelva pronto.");
                }break;
            }
        }while(op!=3);
    }
    
}
