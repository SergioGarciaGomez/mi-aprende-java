/**
 * Ejercicio 40 Tema 5
 * Realiza un programa que pinte por pantalla un rombo hueco hecho con
 * asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
 * sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
 * mensaje de error.
 * @author Sergio García
 */
public class Ejercicio40 { // Clase principal
  public static void main(String[] args) {
    
    int alturaIntroducida = 0;
    int espaciado = 0;
    int espaciosDelante = alturaIntroducida / 2;
    int altura = 1;
    
    while ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
      System.out.print("Introduzca la altura del rombo: ");
      alturaIntroducida = Integer.parseInt(System.console().readLine());
      if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
        System.out.println("Error. Debe introducir un número impar igual o mayor a 3.");
      }
    }
    
    // Parte superior 
    while (altura <= alturaIntroducida / 2 + 1) {
      // Inserta los espacios delante dependiendo de la altura
      for (int i = 1; i <= espaciosDelante; i++) {
        System.out.print(" ");
      }
      // Dibuja la línea
      for (int i = 1; i < espaciado; i++) {
        System.out.print(" ");
      }
      
      if (altura > 1) {
        System.out.print("*");
      }
    } // While parte superior
    
    // Parte inferior
    espaciado = alturaIntroducida - 3;
    espaciosDelante = 1;
    altura = 0;
    
    while (altura < alturaIntroducida / 2) {
      // inserta los espacios delante 
      for (int i = 1; i <= espaciosDelante; i++) {
        System.out.print(" ");
      }
      // Dibuja la línea
      System.out.print("*");
      for (int i = 1; i < espaciado; i++) {
        System.out.print(" ");
      }
      
      if (altura < alturaIntroducida / 2 - 1) {
        System.out.print("*");
      }
      
      System.out.println();
      altura++;
      espaciosDelante++;
      espaciado -= 2;
    } // While parte inferior
  }
}
