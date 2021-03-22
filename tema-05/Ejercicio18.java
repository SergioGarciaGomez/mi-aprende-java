import java.util.Scanner;

/**
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en
 * 7.
 *
 * @author Sergio García
 */
public class Ejercicio18 {

  public static void main(String[] args) {

    int primerN;
    int segundoN;
    Scanner s = new Scanner(System.in);

    do {

      System.out.println("Introduzca un número entero: ");
      primerN = Integer.parseInt(s.nextLine());
      System.out.println("Introduzca otro número diferente al anterior: ");
      segundoN = Integer.parseInt(s.nextLine());

      if (primerN == segundoN) {
        System.out.println("Los números deben ser diferentes.");
      }

    } while (primerN == segundoN);
    
    if(primerN > segundoN) {
      
      int aux = primerN;
      primerN = segundoN;
      segundoN = aux;
    }

    for (int i = primerN; i <= segundoN; i += 7) {
      System.out.print(i + " ");
    }
 
    System.out.println();
  }
}