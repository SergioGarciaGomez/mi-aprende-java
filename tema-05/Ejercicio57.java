/**
 * Ejercicio 57 Tema 5
 * Realiza un programa que pinte un triángulo hueco del estilo *****
 * El usuario debe introducir la altura de la figura.           *  *
 *                                                               * *
 *                                                                **
 *                                                                 *
 * @author Sergio García
 */
public class Ejercicio57 { // Clase principal
  public static void main(String[] args) {
    
    int alturaIntroducida = 0;
    
    // Mínimo de 2 de altura
    while (alturaIntroducida < 2) {
      System.out.print("Introduzca la altura del triángulo: ");
      alturaIntroducida = Integer.parseInt(System.console().readLine());
      if (alturaIntroducida < 2) {
        System.out.println("Error. La altura mínima debe ser de 2.");
      }
    }
    
    // Línea de arriba
    for (int i = 0; i < alturaIntroducida; i++) {
      System.out.print("*");
    }
    System.out.println();
    
    // Líneas intermedias
    int espacios = 1;
    for (int i = 1; i < alturaIntroducida - 1; i++) {
      for (int h = 0; h < espacios; h++) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int h = 0; h < alturaIntroducida - i - 2; h++) {
        System.out.print(" ");
      }
      System.out.println("*");
      espacios++;
    }
    
    // Línea de abajo
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.print("*");
  }
}
