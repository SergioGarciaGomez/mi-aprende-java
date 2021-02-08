package tema08;

import java.util.Scanner;

/**
 * Ejercicio 42 Tema 8
 * 
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura. Utiliza
 * funciones para pintar las líneas.
 * 
 * @author Sergio García
 */
public class Ejercicio42 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(s.nextLine());
    
    // Imprime la parte superior de la pirámide
    System.out.println(funciones.Funciones.linea('*', altura)); 
    
    // Imprime el caracter de la izquierda y pone espacios
    for (int i = 1; i < altura; i++) {
      System.out.print("*" + funciones.Funciones.linea(' ', altura - i - 2));
      
    // Pone un caracter a la derecha del todo, pero 1 más a la izquierda en cada pasada
      if (i < altura - 1) {
        System.out.println("*");
      }
    }
    System.out.println();
  }
}
