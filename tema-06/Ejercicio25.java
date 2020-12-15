/**
 * Ejercicio 25 Tema 6
 * Escribe un programa que muestre por pantalla 100 números enteros separados
 * por un espacio. Los números deben estar generados de forma aleatoria en
 * un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
 * almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
 * @author Sergio García
 */
public class Ejercicio25 { // Clase principal
  public static void main(String[] args) {
    
    for (int i = 0; i < 100; i++) {
      
      int n = (int)(Math.random() * 191) + 10;
      
      boolean esPrimo = true;
      
      for (int h = 2; h < n; h++) {
        if ((n % h) == 0) {
        esPrimo = false;
        }
      }
      
      if (esPrimo) {
        System.out.print(" #" + n + "# ");
      } else if ((n % 5) == 0) {
        System.out.print(" [" + n + "] ");
      } else {
        System.out.print(" " + n + " ");
      }
    } 
  }
}