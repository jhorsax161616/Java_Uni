package HerenciaProducto;

public class Cuaderno extends Producto{
    
    private String Marca;
    private String TipoRenglon;
    private float PorcVentaCuaderno;
    private float ganancia;
    
    public void RegCuader(String Marca, String TipoRenglon, int CodPro, float PrecioCompra)
    {
        super.RegProd(CodPro, PrecioCompra);
        this.Marca = Marca;
        this.TipoRenglon = TipoRenglon;
    }
    public void MostrarCuaderno()
    {
        CalcPrecioVenta();
        super.MostrarProd();
        System.out.println("Marca: " + Marca);
        System.out.println("Tipo de Renglon: " + TipoRenglon);
        System.out.println("Precio de venta: " + this.PrecioVenta);
    }
    private void CalcPrecioVenta()
    {
        ganancia = (float) (this.PrecioCompra * 0.4);
        this.PrecioVenta = this.PrecioCompra + ganancia;
    }
}
