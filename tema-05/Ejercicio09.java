/**
 * Ejercicio 9 Tema 5
 * Nos dice cuantos dígitos tiene un número introducido por teclado
 * @author Sergio García
 */
public class Ejercicio09 { // Clase principal
  public static void main(String[] args) {
    int nDigitos = 1, nIntroducido, n;
    System.out.print("Introduce un número y te digo cuántos dígitos tiene: ");
    nIntroducido = Integer.parseInt(System.console().readLine());
    n = nIntroducido;
    while (n > 10) {
      n/=10;
      nDigitos ++;
    }
    if (nDigitos == 1) {
      System.out.printf("%d tiene %d dígito.", nIntroducido, nDigitos);
    } else {
      System.out.printf("%d tiene %d dígitos.", nIntroducido, nDigitos);
    }
  }
}
