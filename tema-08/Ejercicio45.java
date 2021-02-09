package tema08;

import java.util.Scanner;

/**
 * Ejercicio 45 Tema 8
 * 
 * Realiza un programa que pinte un valle en v tal como se muestra en los ejemplos. 
 * El usuario debe introducir la altura de la figura. Podemos suponer que el 
 * usuario introduce una altura mayor o igual a 3.
 * 
 * @author Sergio García
 */
public class Ejercicio45 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la altura del valle en v: ");
    int altura = Integer.parseInt(s.nextLine());
    
    // Pinta todo menos la última línea
    for (int i = 1; i < altura; i++) {
      System.out.print(funciones.Funciones.linea('*', i));
      System.out.print(funciones.Funciones.linea(' ', altura * 2 - i * 2 - 1));
      System.out.println(funciones.Funciones.linea('*', i));
    }
    
    // Pinta la línea de abajo
    System.out.print(funciones.Funciones.linea('*', altura * 2 - 1));
    
  }
}