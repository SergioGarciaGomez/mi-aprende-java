/**
 * Ejercicio 25 Tema 5
 * Pide un número y lo muestra al revés
 * @author Sergio García
 */
public class Ejercicio25 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Inserte un número entero cualquiera: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    int numero = numeroIntroducido;
    int volteado = 0;
    while ((numero > 0) || (numero < 0)) {
      volteado = volteado * 10 + numero % 10;
      numero /= 10;
    }
    System.out.print("El número " + numeroIntroducido + " al darle la vuelta es " + volteado);
  }
}
