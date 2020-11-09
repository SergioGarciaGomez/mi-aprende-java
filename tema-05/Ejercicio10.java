/**
 * Ejercicio 10 Tema 5
 * Calcula la media de un conjunto de números positivos.
 * El programa termina cuando el usuario mete un número negativo.
 * @author Sergio García
 */
public class Ejercicio10 { // Clase principal
  public static void main(String[] args) {
    double nIntroducido = 0, numeros = 0, suma = 0;
    System.out.println("Calcula la media de un conjunto de números positivos introducidos");
    System.out.print("Cuando quiera parar introduzca un número negativo: ");
    
    while (nIntroducido >= 0 ) {
      nIntroducido = Double.parseDouble(System.console().readLine());
      numeros ++;
      suma += nIntroducido;
    }
    System.out.print("La media de los números positivos es " + (suma - nIntroducido) / (numeros - 1));
  }
}
