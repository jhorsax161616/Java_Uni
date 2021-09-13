package HerenciaProducto;

public class Diccionario extends Producto {
    
    private String Editorial;
    private String Idioma;
    private float PorcVentaDiccionario;
    private float ganancia;
    
    public void RegDiccion(String Editorial, String Idioma, int CodPro, float PrecioCompra)
    {
        super.RegProd(CodPro, PrecioCompra);
        this.Editorial = Editorial;
        this.Idioma = Idioma;
    }
    public void MostrarDiccionario()
    {
        CalcPrecioVenta();
        super.MostrarProd();
        System.out.println("Editorial: " + Editorial);
        System.out.println("Idioma: " + Idioma);
        System.out.println("Precio de venta: " + this.PrecioVenta);
        
    }
    private void CalcPrecioVenta()
    {
        ganancia = (float) (this.PrecioCompra * 0.3);
        this.PrecioVenta = this.PrecioCompra + ganancia;
    }
}
