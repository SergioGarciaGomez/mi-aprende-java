/**
 * Ejercicio 7 Tema 5
 * Control de acceso a una caja fuerte. Combinación de 4 dígitos.
 * Tenemos 4 intentos para abrir la caja
 * @author Sergio García
 */
public class Ejercicio07 { // Clase principal
  public static void main(String[] args) {
    boolean esCorrecto = false;
    int intentos = 3;
    int combinacion;
    do {
      System.out.print("Introduzca la clave: ");
      combinacion = Integer.parseInt(System.console().readLine());
      if (combinacion == 2790) {
        esCorrecto = true;
      } else {
        System.out.printf("Combinación incorrecta. Te quedan %d intentos. \n", intentos);
      }
      intentos--;
    } while ((intentos >= 0) && (!esCorrecto));
    
    if (esCorrecto) {
      System.out.print("Combinación correcta.\nLa caja se ha abierto.");
    } else { 
    System.out.print("La caja fuerte se ha bloqueado.");
    } 
  }
}
