package HerenciaProducto;

public class PrincProducto {

    public static void main(String[] args) {
        // TODO code application logic here
        int op, CodPro;
        String Editorial,Idioma, Marca, TipoRenglon;
        float PrecioCompra;
        do{
            do{
                System.out.print("====MENU===\n\n");
                System.out.println("1.Diccionario");
                System.out.println("2.Cuaderno");
                System.out.println("3.Salir");
                
                System.out.print("Ingrese una opcion: ");
                op = Integer.parseInt(leerCadena.lectura());
                if(op<1 || op>3)
                    System.out.println("Error, vuelve a ingresar. \n");
                
            }while(op<1 || op>3);
            
            switch(op)
            {
                case 1:{
                    
                    System.out.print("Ingrese Editorial: ");
                    Editorial = leerCadena.lectura();
                    System.out.print("Ingrese Idioma: ");
                    Idioma = leerCadena.lectura();
                    System.out.print("Ingrese Codigo: ");
                    CodPro = Integer.parseInt(leerCadena.lectura());
                    System.out.print("Ingrese Precio de Compra: ");
                    PrecioCompra = Float.parseFloat(leerCadena.lectura());
                    
                    Diccionario dic1 = new Diccionario();
                    dic1.RegDiccion(Editorial, Idioma, CodPro, PrecioCompra);
                    
                    System.out.println("===MOSTRANDO DATOS===\n");
                    dic1.MostrarDiccionario();
                           
                }break;
                
                case 2:{
                    System.out.print("Ingrese Marca: ");
                    Marca = leerCadena.lectura();
                    System.out.print("Ingrese Tipo de Renglon: ");
                    TipoRenglon = leerCadena.lectura();
                    System.out.print("Ingrese Codigo: ");
                    CodPro = Integer.parseInt(leerCadena.lectura());
                    System.out.print("Ingrese Precio de Compra: ");
                    PrecioCompra = Float.parseFloat(leerCadena.lectura());
                    
                    Cuaderno cua1 = new Cuaderno();
                    cua1.RegCuader(Marca, TipoRenglon, CodPro, PrecioCompra);
                    
                    System.out.println("\n===MOSTRANDO DATOS===\n");
                    cua1.MostrarCuaderno();
                }break;
                                
                case 3:{
                    System.out.println("Adios.. Gracias por la visita");
                }
            }
        }while(op!=3);
    }
    
}
