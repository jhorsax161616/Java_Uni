package ProgramasSemana02.Boleta;

public class Boleta {
    private String NombreCliente;
    private int NumBoleta;
    private int Cantidad;
    private double Precio;
    private double MontoTotal;
    
    public void Registrar()
    {
        System.out.print("\nIngrese Nombre del Cliente: ");
        this.NombreCliente = leerCadena.lectura();
        System.out.print("Ingrese Número de boleta: ");
        this.NumBoleta = Integer.parseInt(leerCadena.lectura());
        System.out.print("Ingrese Cantidad de productos: ");
        this.Cantidad = Integer.parseInt(leerCadena.lectura());
        System.out.print("Ingrese precio del producto: ");
        this.Precio = Double.parseDouble(leerCadena.lectura());
        CalculaMonto();
    }
    public void Mostrar()
    {
        System.out.println("\nCliente " + NombreCliente);
        System.out.println("N° de boleta " + NumBoleta);
        System.out.println("\nMonto Total a pagar: " + MontoTotal);
    }
    private void CalculaMonto()
    {
        this.MontoTotal = Precio * Cantidad;
    }
}
