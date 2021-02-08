package tema08;

/**
 * Ejercicio 37 Tema 8
 * 
 * Pasa números a código morse.
 * 
 * @author Sergio García
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
