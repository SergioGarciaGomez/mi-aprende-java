/**
 * Ejercicio 1 Tema 6
 * Muestra 10 números aleatorios
 * @author Sergio García
 */
public class Ejercicio01 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Números aleatorios con decimales en el intervalo [0, 1)");
    for(int i = 1; i < 11; i ++) {
      System.out.println(Math.random());
    }
    
    System.out.println("Números aleatorios con decimales en el intervalo [0, 100)");
    for(int i = 1; i < 11; i ++) {
      System.out.println(Math.random() * 100);
    }
    
  System.out.println("Números aleatorios enteros en el intervalo [0, 99]");
    for(int i = 1; i < 11; i ++) {
      System.out.println((int)(Math.random() * 100));
    }
  }
}