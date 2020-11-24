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
    System.out.print("Introduzca la altura del rombo: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
      System.out.print("Error. Debe introducir un número impar igual o mayor a 3.");
    } else 
  }
}
