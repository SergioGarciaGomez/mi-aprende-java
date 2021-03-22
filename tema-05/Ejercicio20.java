import java.util.Scanner;

/**
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide
 * hueca
 *
 * @author Sergio García
 */
public class Ejercicio20 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());
    System.out.println("Introduzca el carácter para el borde de la pirámide: ");
    String relleno = s.nextLine();

    int altura = 1;
    int i = 0;
    int espaciosPorDelante = alturaIntroducida - 1;
    int espaciosPorMedio = 0;

    while (altura < alturaIntroducida) {

      // Inserta espacios por delante
      for (i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }

      // Pinta los caracteres 
      System.out.print(relleno);

      // Inserta espacios por enmedio
      for (i = 0; i < espaciosPorMedio; i++) {
        System.out.print(" ");
      }

      if (altura > 1) {
        System.out.print(relleno);
      }

      System.out.println();
      espaciosPorDelante--;
      espaciosPorMedio += 2;
      altura++;
    }
    
    for (i = 0; i < altura * 2; i++) {
      System.out.print(relleno);
    }
  }
}