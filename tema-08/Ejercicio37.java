package tema08;

/**
 * Ejercicio 37 Tema 8
 * 
 * Pasa n�meros a c�digo morse.
 * 
 * @author Sergio Garc�a
 */
public class Ejercicio37 {

  public static void main(String[] args) {
    int[] numeros = { 213, 54, 33312, 0, 100 };
    for (int numero : numeros) {
      System.out.print("El " + numero + " es el " + funciones.Funciones.convierteEnMorse(numero));
      System.out.println(" en morse.");
    }
  }
}
