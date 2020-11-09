/**
 * Ejercicio 6 Tema 5
 * Muestra los números del 320 al 160 de 20 en 20 hacia atrás, con while
 * @author Sergio García
 */
public class Ejercicio06 { // Clase principal
  public static void main(String[] args) {
    int i = 320;
    
    do {
      System.out.println(i);
      i-=20;
    } while (i >= 160);
  }
}
