package ProgramasSemana03.HerenVehiculo;

public abstract class Vehiculo {
    float precio, depreciacion, total;
    
    public abstract float CalcularPrecioFinal(float precio);
    
    public void Mostrar(String vehiculo)
    {
        System.out.println("VEHICULO: " + vehiculo);
        System.out.println("El precio es: " + precio);
        System.out.println("Depreciacion: " + depreciacion);
        System.out.println("Precio total: " + total);
    }
}
