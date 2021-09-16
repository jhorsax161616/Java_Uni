package Sobrecarga_Metodos_Construct;
/**
 *
 * @author jhorsax
 */
public class Calculadora {
    // Los dos parámetros y el valor de retorno son de tipo int
  public static int suma(int a, int b) {
    return a + b;
  }

  // Los dos parámetros y el valor de retorno son de tipo float
  public static float suma(float a, float b) {
    return a + b;
  }

  // Un parámetro es de tipo int, mientras que el otro parametro
  // y el valor de retorno son de tipo float
  public static float suma(int a, float b) {
    return a + b;
  }

  public static float suma(float a, int b) {
    return a + b;
  }
}
