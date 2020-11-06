/**
 * Ejercicio 14 Tema 4
 * Dice si el número introducido es par y/o divisible entre 5
 * @author Sergio García
 */
public class Ejercicio14 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduzca un número: ");
    int n = Integer.parseInt(System.console().readLine());
    
    if ((n % 2) == 0) {
      System.out.printf("El número %d es par ", n);
    } else {
      System.out.printf("El número %d no es par ", n);
    }
    
    if ((n % 5) == 0) {
      System.out.println("y es divisible por 5.");
    } else {
      System.out.println("y no es divisible por 5.");
    }
  }
}