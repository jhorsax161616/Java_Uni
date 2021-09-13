package ProgramasSemana03.HerenVehiculo;

public class Bicicleta extends Vehiculo{
    public void Registrar(float precio)
    {
        this.precio = precio;
        CalcularPrecioFinal(precio);
    }
    public float CalcularPrecioFinal(float precio) {
        depreciacion = (float) (precio * 0.05);
        total = precio - depreciacion;
        return total;
    }
}
