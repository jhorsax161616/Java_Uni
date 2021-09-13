package ProgramasSemana03.Figuras;

public class Circulo extends Figura{
    public int radio;
    
    public Circulo(int rdo)
    {
        this.radio = rdo;
    }
    
    public double area()
    {
        return (Math.PI * Math.pow(radio, 2));
    }
    
}
