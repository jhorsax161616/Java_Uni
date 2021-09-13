package ProgramasSemana02.Colores;

public class PrincColores {

    public static void main(String[] args) {
        int CodigoU;
        String DescripcionUtil;
        float PrecioUnitario;
        String Marca;
        int UnidadCaja;
        int CantVendida;
        int CodigoOferta;
        char DescripO;
        
        System.out.println("===VENTA DE COLORES===");
        
        System.out.print("\nIngrese nombre del utilitario: ");
        DescripcionUtil = leerCadena.lectura();
        System.out.print("Ingrese codigo de utilitario: ");
        CodigoU = Integer.parseInt(leerCadena.lectura());
        System.out.print("Ingrese marca: ");
        Marca = leerCadena.lectura();
        System.out.print("Ingrese precio Unitario: ");
        PrecioUnitario = Float.parseFloat(leerCadena.lectura());
        System.out.print("Ingrese Cantidad de unidades por Caja: ");
        UnidadCaja = Integer.parseInt(leerCadena.lectura());
        System.out.print("Ingrese Cantidad de Cajas Vendidas: ");
        CantVendida = Integer.parseInt(leerCadena.lectura());
        System.out.print("Ingrese Codigo de Oferta: ");
        CodigoOferta = Integer.parseInt(leerCadena.lectura());
        System.out.print("Ingrese Descripcion de Oferta (char): ");
        DescripO = leerCadena.lectura().charAt(0);
        
        Colores Venta1 = new Colores();
        Venta1.Colores(CodigoU, DescripcionUtil, PrecioUnitario, Marca, UnidadCaja, CantVendida, CodigoOferta, DescripO);
        
        System.out.println("\n==DETALLES DE LA CAJA DE COLORES===");
        Venta1.DevolverDatosCajaColor();
        
        System.out.println("\n==DETALLES DE LA VENTA Y MONTO==");
        Venta1.DevolverMontoVentaTotal();
    }
    
}
