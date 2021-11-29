package Clases;

public class Producto {
    
    private Integer CodProd=null;
    private String Descrip=null;
    private Integer  Saldo=null;
    
    public String DatosCompleto(){
        return getCodProd()+" "+getDescrip()+" "+getSaldo();
    }
    public Integer DevuelveSaldo(){
        return getSaldo();
    }
    // @return the CodProd
    public Integer getCodProd() {
        return CodProd;
    }
    // @param CodProd the CodProd to set
    public void setCodProd(Integer CodProd) {
        this.CodProd = CodProd;
    }
    // @return the Descrip
    public String getDescrip() {
        return Descrip;
    }
    // @param Descrip the Descrip to set
    public void setDescrip(String Descrip) {
        this.Descrip = Descrip;
    }
    // @return the Saldo
    public Integer getSaldo() {
        return Saldo;
    }
    // @param Saldo the Saldo to set
    public void setSaldo(Integer Saldo) {
        this.Saldo = Saldo;
    }
}


