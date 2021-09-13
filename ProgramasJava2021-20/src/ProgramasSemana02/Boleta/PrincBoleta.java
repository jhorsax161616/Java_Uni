package ProgramasSemana02.Boleta;

public class PrincBoleta {

    public static void main(String[] args) {
        
        Boleta Venta1 = new Boleta();
        
        System.out.println("__REGISTRO DE VENTA__");
        Venta1.Registrar();
        
        System.out.println("\n__DETALLES DE LA VENTA__");
        Venta1.Mostrar();
    }
    
}
