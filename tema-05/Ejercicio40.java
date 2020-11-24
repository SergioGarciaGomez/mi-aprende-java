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
    System.out.print("Por favor, introduzca la altura del rombo: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    int espaciado = 0;
    int espaciosDelante = alturaIntroducida / 2;
    if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
    System.out.print("Error. Debe introducir una altura impar mayor o igual a 3");
    } else {
      int altura = 1;
    
      // parte de arriba //
      while (altura <= alturaIntroducida / 2 + 1) {
        
        // inserta espacios delante
        for (int i = 1; i <= espaciosDelante; i++) {
          System.out.print(" ");
        }
      
        // pinta la línea
        System.out.print("*");
        
        for (int i = 1; i < espaciado; i++) {
          System.out.print(" ");
        }
        
        if (altura>1) {
          System.out.print("*");
        }
        
        System.out.println();
        altura++;
        espaciosDelante--;
        espaciado+=2;
        
      } // while parte de arriba
      
      // parte de abajo //
      espaciado = alturaIntroducida - 3;
      espaciosDelante = 1;
      altura = 0;
      while (altura < alturaIntroducida / 2) {
        
        // inserta espacios delante
        for (int i = 1; i <= espaciosDelante; i++) {
          System.out.print(" ");
        }
      
        // pinta la línea
        System.out.print("*");
        for (int i = 1; i < espaciado; i++) {
          System.out.print(" ");
        }
        
        if(altura < alturaIntroducida / 2 - 1) {
          System.out.print("*");
        }
      
        System.out.println();
        altura++;
        espaciosDelante++;
        espaciado -= 2;
      } // while parte de abajo
    } // else
  }
}
