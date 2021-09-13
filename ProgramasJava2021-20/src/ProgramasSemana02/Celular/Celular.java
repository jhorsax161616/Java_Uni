package ProgramasSemana02.Celular;

public class Celular {
    private String Marca;
    private String Modelo;
    private int NumSerie;
    
    public void Registrar()
    {
        System.out.print("Ingrese Marca: ");
        this.Marca = leerCadena.lectura();
        System.out.print("Ingrese Modelo: ");
        this.Modelo = leerCadena.lectura();
        System.out.print("Ingrese Número de Serie: ");
        this.NumSerie = Integer.parseInt(leerCadena.lectura());
    }
    public void Mostrar()
    {
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Numero de Serie: " + NumSerie);
        
    }
}
