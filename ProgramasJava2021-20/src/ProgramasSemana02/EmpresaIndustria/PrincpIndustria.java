package ProgramasSemana02.EmpresaIndustria;

public class PrincpIndustria {

    public static void main(String[] args) {
        int op;
        
        Industria ind = new Industria();
        
        do{
            System.out.println("\n====MENU INDUSTRIAS====");
            System.out.println("\n1. Registrar");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Salir");
            
            System.out.print("\nIngrese Opcion: ");
            op = Integer.parseInt(leerCadena.lectura());
            
            switch(op){
                case 1:{
                    ind.Registrar();
                }break;
                
                case 2:{
                    System.out.println("\nReportes de datos de la Empresa: "+ ind.consultarEmp() + ind.TotalProd());
                }break;
                
                case 3:{
                    System.out.println("Adios... GRACIAS");
                }break;
            }
        }while(op != 3);
    }
    
}
