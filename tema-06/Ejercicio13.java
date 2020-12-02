/**
 * Ejercicio 13 Tema 6
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los
 * dos dados tengan el mismo valor.
 * @author Sergio García
 */
public class Ejercicio13 { // Clase principal
  public static void main(String[] args) {
    
    int n1 = 0;
    int n2 = 0;
    
    do {
      for (int i = 0; i < 2; i++) {
        n1 = (int)(Math.random() * 6) + 1;
        n2 = (int)(Math.random() * 6) + 1;
        System.out.print(n1 + " " + n2 + " ");
        System.out.println();
      }
    } while (n1 != n2);
  }
}