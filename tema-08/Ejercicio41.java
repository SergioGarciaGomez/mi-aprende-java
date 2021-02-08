package tema08;

import java.util.Scanner;

/**
 * Ejercicio 41 Tema 8
 * 
 * Realiza un programa que pinte un triángulo relleno tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura. Este ejercicio
 * ya se realizó en el tema de bucles, ahora se trata de usar una función para
 * que la implementación sea más sencilla. Por ejemplo, se puede crear una
 * función linea(char caracter, int repeticiones) que pinte una línea con el
 * carácter especificado.
 * 
 * @author Sergio García
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