/**
 * Ejercicio 6 Tema 7
 * Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota los
 * elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1,
 * el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
 * posición 0. Finalmente, muestra el contenido del array.
 * @author Sergio García
 */
public class Ejercicio06 { // Clase principal
  public static void main(String[] args) {
    int[] numero = new int[15];
    int i;
    
    System.out.println("Introduzca números. Para continuar pulse INTRO:");
    
    for (i = 0; i < 15; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println();
    
    System.out.println("Array:");
    
    for (i = 0; i < 15; i++) {
      System.out.printf("|%3d  ", i);
    }
  }
}
