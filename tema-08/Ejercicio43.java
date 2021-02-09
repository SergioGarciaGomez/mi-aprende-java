package tema08;

import java.util.Scanner;

/**
 * Ejercicio 43 Tema 8
 * 
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura. Utiliza
 * funciones para pintar las líneas.
 * 
 * @author Sergio García
 */
public class Ejercicio43 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(s.nextLine());
    
    for (int i = 0; i < altura; i++) {
      System.out.print(funciones.Funciones.linea(' ', i));
      System.out.println(funciones.Funciones.linea('*', altura - i));
    }
  }
}
