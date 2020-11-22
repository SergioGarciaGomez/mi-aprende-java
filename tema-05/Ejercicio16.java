/**
 * Ejercicio 16 Tema 5
 * Programa que dice si un número introducido es o no es primo.
 * @author Sergio García
 */
public class Ejercicio16 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número cualquiera (positivo y entero): ");
    int numero = Integer.parseInt(System.console().readLine());
    boolean esPrimo = true;
    
    for (int i = 2; i < numero; i++) {
      if ((numero % i) == 0) {
        esPrimo = false;
      }
    }
    
    if (esPrimo) {
      System.out.print("El número introducido es primo.");
    } else {
      System.out.print("El número introducido no es primo.");
    }
  }
}
