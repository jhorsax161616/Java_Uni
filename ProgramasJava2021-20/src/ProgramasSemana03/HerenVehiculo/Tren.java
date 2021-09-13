package ProgramasSemana03.HerenVehiculo;

public class Tren extends Vehiculo{
    public void Registrar(float precio)
    {
        this.precio = precio;
        CalcularPrecioFinal(precio);
    }
    public float CalcularPrecioFinal(float precio) {
        depreciacion = (float) (precio * 0.45);
        total = precio - depreciacion;
        return total;
    }
}
