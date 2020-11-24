/**
 * Ejercicio 62 Tema 5
 * Los números de la suerte son el 3, el 7, el 8 y el 9.
 * Los números de la mala suerte son: el 0, el 1, el 2, el 4, el 5 y el 6. 
 * Un número es afortunado si contiene más números de la suerte que de la mala
 * suerte. Realiza un programa que diga si un número introducido por el usuario
 * es afortunado o no.
 * @author Sergio García
 */
public class Ejercicio62 { // Clase principal
  public static void main(String[] args) {
    
    System.out.print("Introduzca un número: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    int numerosSuerte = 0;
    int numerosMalaSuerte = 0;
    long numeroIntroducidoCopia = numeroIntroducido;
    
    while (numeroIntroducido > 0) {
      int digito = (int)numeroIntroducido % 10;
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
        numerosSuerte++;
      } else {
        numerosMalaSuerte++;
      }
      numeroIntroducido /= 10;
    }
    
    if (numerosSuerte == numerosMalaSuerte) {
      System.out.print("El número " + numeroIntroducidoCopia + " es un número neutro.");
    } else if (numerosSuerte > numerosMalaSuerte) {
      System.out.print("El número " + numeroIntroducidoCopia + " es un núnero afortunado.");
    } else {
      System.out.print("El número " + numeroIntroducidoCopia + " es un número de mala suerte.");
    }
  }
}
