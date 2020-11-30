/**
 * Ejercicio 4 Tema 6
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
 * separados por espacios.
 * @author Sergio García
 */
public class Ejercicio04 { // Clase principal
  public static void main(String[] args) {
    
    int numero = 0;
    
    for (int i = 0; i < 20; i++) {
      numero = (int)(Math.random() * 11);
      System.out.print(numero + " ");
    }
  }
}