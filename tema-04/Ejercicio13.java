/**
 * Ejercicio 13 Tema 4
 * Ordena 3 números de menos a mayor
 * @author Sergio García
 */
public class Ejercicio13 { // Clase principal
  public static void main(String[] args) {
    int numero;
    System.out.print("Ordena 3 números de menor a mayor.\nIntroduzca 3 números: ");
    int a = Integer.parseInt(System.console().readLine());
    int b = Integer.parseInt(System.console().readLine());
    int c = Integer.parseInt(System.console().readLine());
    
    if (a > b) {
      numero = a;
      a = b;
      b = numero;
    }
    
    if (b > c) {
      numero = b;
      b = c;
      c = numero;
    }
    
    if (a > b) {
      numero = a;
      a = b;
      b = numero;
    }
    
    System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + ".");
  }
}