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
    
    while 
  }
}
