package ProgramasSemana03.Figuras;

public class Cuadrado extends Figura {
    public int lado;
    
    public Cuadrado(int ldo)
    {
        this.lado = ldo;
    }
    
    public double area() {
        return (lado * lado);
    }
}
