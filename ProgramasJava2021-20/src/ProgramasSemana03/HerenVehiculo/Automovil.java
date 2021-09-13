package ProgramasSemana03.HerenVehiculo;

public class Automovil extends Vehiculo{
    
    public void Registrar(float precio)
    {
        this.precio = precio;
        CalcularPrecioFinal(precio);
    }
    public float CalcularPrecioFinal(float precio) {
        depreciacion = (float) (precio * 0.25);
        total = precio - depreciacion;
        return total;
    }
}
