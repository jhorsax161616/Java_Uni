package ProgramasSemana02.Colores;

public class Colores {
    private int codUtil;
    private String DescripUtil;
    private float PrecioUni;
    private String Marca;
    private int UnidadesCaja;
    private int CantidadVendida;
    private int CodOferta;
    private char DescripcionOferta;
    private float PorcDescto;
    private String AnuncioOferta;
    private float MontoTotal;
    
    public void Colores(int CodigoU, String DescripcionUtil, float PrecioUnitario, String Marca_e, int UnidadCaja, int CantVendida, int CodigoOferta, char DescripO)
    {
        this.CantidadVendida = CantVendida;
        this.CodOferta = CodigoOferta;
        this.DescripUtil = DescripcionUtil;
        this.Marca = Marca_e;
        this.PrecioUni = PrecioUnitario;
        this.UnidadesCaja = UnidadCaja;
        this.codUtil = CodigoU;
        this.DescripcionOferta = DescripO;
    }
    public void DevolverDatosCajaColor()
    {
        System.out.println("Utilitario: " + DescripUtil);
        System.out.println("Codigo de Utilitario: " + codUtil);
        System.out.println("Precio Unitario: " + PrecioUni);
        System.out.println("Marca: " + Marca);
        System.out.println("Unidades por Caja: " + UnidadesCaja);
    }
    public void DevolverMontoVentaTotal()
    {
        MontoTotal = MontoTotal(DescripcionOferta);
        System.out.println("Cantidad de Cajas: " + CantidadVendida);
        System.out.println("Codigo de Oferta: " + CodOferta);
        System.out.println("Descripcion de Oferta: Tipo " + DescripcionOferta + " " + AnuncioOferta);
        System.out.println("\nMonto de venta Total: " + MontoTotal);
    }
    private float MontoTotal(char op)
    {
        switch (op) {
            case 'a':
            case 'A':{
                this.PorcDescto = (float) 0.05;
                this.AnuncioOferta = "Descuento del 5%";
            }break;
            case 'b':
            case 'B':{
                this.PorcDescto = (float) 0.1;
                this.AnuncioOferta = "Descuento del 10%";
            }break;
            case 'c':
            case 'C':{
                this.PorcDescto = (float) 0.15;
                this.AnuncioOferta = "Descuento del 15%";
            }break;
            default:{
                this.PorcDescto = 0;
                this.AnuncioOferta = "Sin descuento :(";
            }break;
        }
        float montoDescuento = PorcDescto * CantidadVendida * PrecioUni;
        return CantidadVendida * PrecioUni - montoDescuento;
    }
}
