/**
 * Ejercicio 9 Tema 6
 * Realiza un programa que vaya generando números aleatorios pares
 * entre 0 y 100 y que no termine hasta que no saque el número 24. El
 * programa deberá decir al final cuántos números se han generado.
 * @author Sergio García
 */
public class Ejercicio09 { // Clase principal
  public static void main(String[] args) {
    
    int totalNumeros = 0;
    boolean numero24 = false;
    int numero = 0;
    
    while (!numero24) {
      numero = (int)(Math.random() * 51) * 2;
      totalNumeros++;
      System.out.print(numero + " ");
      
      if (numero == 24) {
        numero24 = true;
        System.out.print("\n¡Ahí está el 24!\nPara encontrarlo entre los pares del 0 al 100 se han generado " + totalNumeros + " números");
      }
    }
  }
}