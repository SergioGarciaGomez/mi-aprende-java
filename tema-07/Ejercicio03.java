/**
 * Ejercicio 3 Tema 7
 * Escribe un programa que lea 10 números por teclado y que luego
 * los muestre en orden inverso, es decir, el primero que se
 * introduce es el último en mostrarse y viceversa
 * @author Sergio García
 */
public class Ejercicio03 { // Clase principal
  public static void main(String[] args) {
    int[] n = new int[10];
    int i;
    System.out.println("Introduzca 10 números enteros.");
    System.out.println("Pulse la tecla INTRO para continuar");
    
    for (i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("\nLos números introducidos al revés son los siguientes:");
    
    for (i = 9; i >= 0; i--) {
      System.out.println(n[i]);
    }
  }
}
