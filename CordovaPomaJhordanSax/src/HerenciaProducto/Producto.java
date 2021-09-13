package HerenciaProducto;

public class Producto {
    
    private int CodPro;
    float PrecioCompra;
    float PrecioVenta;
    
    public void RegProd(int CodPro, float PrecioCompra)
    {
        this.CodPro = CodPro;
        this.PrecioCompra = PrecioCompra;
    }
    public void MostrarProd()
    {
        System.out.println("Codigo: " + CodPro);
    }
}
