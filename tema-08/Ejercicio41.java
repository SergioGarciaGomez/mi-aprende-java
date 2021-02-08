package tema08;

import java.util.Scanner;

/**
 * Ejercicio 41 Tema 8
 * 
 * Realiza un programa que pinte un tri�ngulo relleno tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura. Este ejercicio
 * ya se realiz� en el tema de bucles, ahora se trata de usar una funci�n para
 * que la implementaci�n sea m�s sencilla. Por ejemplo, se puede crear una
 * funci�n linea(char caracter, int repeticiones) que pinte una l�nea con el
 * car�cter especificado.
 * 
 * @author Sergio Garc�a
 */
public class Ejercicio41 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(s.nextLine());
    
    for (int i = altura; i > 0; i--) {
      System.out.println(funciones.Funciones.linea('*', i));
    }
  }
}