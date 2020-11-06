/**
 * Ejercicio 17 Tema 4
 * Escribe la última cifra de cualquier número entero
 * @author Sergio García
 */
public class Ejercicio17 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero: ");
    int n = Integer.parseInt(System.console().readLine());
    System.out.printf("La última cifra del número %d es el " + (n % 10), n);
  }
}