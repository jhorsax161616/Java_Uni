package ProgramasSemana03.HerenVehiculo;

public class PrincVehiculo {

    public static void main(String[] args) {
        int op;
        float precio;
        do{
            do{
                System.out.print("====MENU===\n\n");
                System.out.println("1.Automovil");
                System.out.println("2.Bicicleta");
                System.out.println("3.Tren");
                System.out.println("4.Salir");
                
                System.out.print("Ingrese una opcion: ");
                op = Integer.parseInt(leerCadena.lectura());
                if(op<1 || op>3)
                    System.out.println("Error, vuelve a ingresar. \n");
                
            }while(op<1 || op>4);
            
            switch(op)
            {
                case 1:{
                    
                    System.out.print("Ingrese precio: ");
                    precio = Float.parseFloat(leerCadena.lectura());
                    
                    Automovil Vehi1 = new Automovil();
                    System.out.println("\n==DATOS==\n");
                    Vehi1.Registrar(precio);
                    String tipo = "Automovil";
                    Vehi1.Mostrar(tipo);
                           
                }break;
                
                case 2:{
                    System.out.print("Ingrese precio: ");
                    precio = Float.parseFloat(leerCadena.lectura());
                    
                    Bicicleta Vehi2 = new Bicicleta();
                    System.out.println("\n==DATOS==\n");
                    Vehi2.Registrar(precio);
                    String tipo = "Bicicleta";
                    Vehi2.Mostrar(tipo);
                }break;
                
                case 3:{
                    System.out.print("Ingrese precio: ");
                    precio = Float.parseFloat(leerCadena.lectura());
                    
                    Tren Vehi3 = new Tren();
                    System.out.println("\n==DATOS==\n");
                    Vehi3.Registrar(precio);
                    String tipo = "Tren";
                    Vehi3.Mostrar(tipo);
                }break;
                
                case 4:{
                    System.out.println("Adios.. Gracias por la visita");
                }
            }
        }while(op!=4);
    }
    
}
