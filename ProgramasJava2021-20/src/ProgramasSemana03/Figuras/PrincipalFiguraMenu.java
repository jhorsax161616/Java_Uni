package ProgramasSemana03.Figuras;

public class PrincipalFiguraMenu {

    public static void main(String[] args) {
        
        int op, lad, rad;
        
        do{
            do{
                System.out.print("====MENU====\n\n");
                System.out.println("1. Cuadrado");
                System.out.println("2. Circulo");
                System.out.println("3. Salir");
                
                System.out.print("Ingrese una opcion: ");
                op = Integer.parseInt(leerCadena.lectura());
                
                if (op < 1 || op > 3)
                    System.out.println("Error. Vuelva a Ingresar. \n");
            }while(op < 1 || op > 3);
            
            switch(op)
            {
                case 1:{
                    do{
                        System.out.print("Ingrese lado de cuadrado: ");
                        lad = Integer.parseInt(leerCadena.lectura());
                        
                        if (lad <= 0)
                            System.out.println("Error. vuelva a ingresar \n");
                        
                    }while(lad <= 0);
                    Cuadrado cuad = new Cuadrado(lad);
                    System.out.println("El Area del cuadrado es: " + cuad.area());
                }break;
                
                case 2:{
                    do{
                        System.out.print("Ingrese radio del circulo: ");
                        rad = Integer.parseInt(leerCadena.lectura());
                        
                        if (rad <= 0)
                            System.out.println("Error. vuelva a ingresar \n");
                        
                    }while(rad <= 0);
                    Circulo circ = new Circulo(rad);
                    System.out.println("El Area del circulo es: " + circ.area());
                }break;
                
                case 3:{
                    System.out.print("Gracias por visitarnos");

                }break;
            }
        }while(op!=3);
    }
    
}
