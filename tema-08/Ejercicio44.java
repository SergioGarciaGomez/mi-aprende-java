package tema08;

import java.util.Scanner;

/**
 * Ejercicio 44 Tema 8
 * 
 * Realiza un programa que pinte un tri�ngulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura. Utiliza
 * funciones para pintar las l�neas.
 * 
 * @author Sergio Garc�a
 */
public class Ejercicio44 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(s.nextLine());
    
    System.out.println(funciones.Funciones.linea('*',  altura));
    
    for (int i = 1; i < altura; i++) {
      System.out.print(funciones.Funciones.linea(' ', i));
      System.out.print("*" + funciones.Funciones.linea(' ', altura - i - 2));
      
      if (i < altura - 1) {
        System.out.println("*");
      }
    }
    System.out.println();
  }
}