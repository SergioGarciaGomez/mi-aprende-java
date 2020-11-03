/**
 * Ejercicio 4 Tema 5
 * Muestra los números del 320 al 160, de 20 en 20 hacia atrás
 * @author Sergio García
 */
public class Ejercicio04 { // Clase principal
  public static void main(String[] args) {
    for(int i = 320; i >= 160; i -= 20) {
      System.out.print(i + ", ");
    }
  }
}
