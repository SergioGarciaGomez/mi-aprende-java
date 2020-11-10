/**
 * Ejercicio 12 Tema 5
 * Muestra los numeros de Fibonacci que el usuario quiera
 * @author Sergio García
 */
public class Ejercicio12 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Este programa muestra la serie de números de Fibonacci.");
    System.out.print("Introduzca los números que quieras que haya: ");
    int n = Integer.parseInt(System.console().readLine());
    
    switch (n) {
      
      case 1:
        System.out.print("0");
        break;
        
      case 2:
        System.out.print("0 1");
        break;
        
      default:
        System.out.print("0 1");
        int primerNumero = 0;
        int segundoNumero = 1;
        int suma = 1;
        while (n > 2) {
          segundoNumero = primerNumero;
          primerNumero = suma;
          suma = primerNumero + segundoNumero;
          System.out.print(" " + suma);
          n--;
        }
    }
  }
}
