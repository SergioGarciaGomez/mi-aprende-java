/**
 * Ejercicio 35 Tema 5
 * Realiza un programa que pinte una X hecha de asteriscos. 
 * El programa debe pedir la altura. Se debe comprobar que 
 * la altura sea un número impar mayor o igual a 3, en caso 
 * contrario se debe mostrar un mensaje de error.
 * @author Sergio García
 */
public class Ejercicio35 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca la altura de la X: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int i = 0;
    int espaciado = alturaIntroducida - 1;
    int espaciosDelante = 0;
    
    if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
      System.out.print("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3");
    } else {
      
      // parte de arriba 
      while (altura < alturaIntroducida / 2 + 1) {
        
        // inserta espacios delante
        for (i = 1; i <= espaciosDelante; i++) {
          System.out.print(" ");
        }
        
        // pinta la línea
        System.out.print("*");
        for (i = 1; i < espaciado; i++) {
          System.out.print(" ");
        }
      System.out.print("*");
      System.out.println();
      altura++;
      espaciosDelante++;
      espaciado -= 2;
      } // while parte de arriba 
      
      // parte de abajo 
      espaciado = 0;
      espaciosDelante = alturaIntroducida / 2;
      altura = 1;
      while (altura <= alturaIntroducida / 2 + 1) {
        
        // inserta espacios delante
        for (i = 1; i <= espaciosDelante; i++) {
          System.out.print(" ");
        }
        
        // pinta la línea
        System.out.print("*");
        for (i = 1; i < espaciado; i++) {
          System.out.print(" ");
        }
        if(altura>1) {
          System.out.print("*");
        }
        System.out.println();
        altura++;
        espaciosDelante--;
        espaciado+=2;
      } // while parte de abajo
    } // else
  }
}