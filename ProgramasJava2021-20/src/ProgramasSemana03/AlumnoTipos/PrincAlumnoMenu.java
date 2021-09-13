package ProgramasSemana03.AlumnoTipos;

public class PrincAlumnoMenu {

    public static void main(String[] args) {
        alumno_inst a1 = new alumno_inst();
        Alumno_Univ a2 = new Alumno_Univ();
        
        int op, codigo;
        String nombre, facultad, espec;
        
        do{
            do{
                System.out.print("====MENU===\n\n");
                System.out.println("1.Alumno Instituto");
                System.out.println("2.Alumno Universidad");
                System.out.println("3.Salir");
                
                System.out.print("Ingrese una opcion: ");
                op = Integer.parseInt(leerCadena.lectura());
                if(op<1 || op>3)
                    System.out.println("Error, vuelve a ingresar. \n");
                
            }while(op<1 || op>3);
            
            switch(op)
            {
                case 1:{
                    System.out.print("Ingrese codigo: ");
                    codigo = Integer.parseInt(leerCadena.lectura());
                    
                    System.out.print("Ingrese nombre: ");
                    nombre = leerCadena.lectura();
                    
                    System.out.print("Ingrese especialidad: ");
                    espec = leerCadena.lectura();
                    
                    a1.regDatos(codigo, nombre, espec);
                    a1.conDatos();
                           
                }break;
                
                case 2:{
                    System.out.print("Ingrese codigo: ");
                    codigo = Integer.parseInt(leerCadena.lectura());
                    
                    System.out.print("Ingrese nombre: ");
                    nombre = leerCadena.lectura();
                    
                    System.out.print("Ingrese facultad: ");
                    facultad = leerCadena.lectura();
                    
                    a2.regDatos(codigo, nombre, facultad);
                    a2.conDatos();
                }break;
                
                case 3:{
                    System.out.println("Ingrese facultad: ");
                }break;
            }
        }while(op!=3);
    }
    
}
