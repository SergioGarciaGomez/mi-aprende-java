/**
 * Ejercicio 13 Tema 5
 * Lee una lista de 10 números y dice cuántos son positivos y cuántos negativos
 * @author Sergio García
 */
public class Ejercicio13 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduzca 10 números enteros: ");
    int positivos = 0;
    int negativos = 0;
    for (int i = 0; i < 10; i++) {
      if (Integer.parseInt(System.console().readLine()) < 0 ) {
        negativos++;
      } else {
        positivos++;
      }
    }
    if (negativos == 1) {
      System.out.printf("Hay %d números positivos y %d negativo.", positivos, negativos);
    } else if (positivos == 1) {
      System.out.printf("Hay %d número positivo y %d negativos.", positivos, negativos);
    } else {
      System.out.printf("Hay %d números positivos y %d negativos.", positivos, negativos);
    }
  }
}
