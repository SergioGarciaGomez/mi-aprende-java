/**
 * Ejercicio 5 Tema 7
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras máximo y mínimo al lado del
 * máximo y del mínimo respectivamente.
 * @author Sergio García
 */
public class Ejercicio05 { // Clase principal
  public static void main(String[] args) {
    int[] numero = new int[10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int i;
    System.out.println("Introduzca números. Pulse INTRO para continuar:");
    
    for (i = 0; i < 10; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
      
      if (numero[i] < minimo) {
        minimo = numero[i];
      } 
      
      if (numero[i] > maximo) {
        maximo = numero[i];
      }
    }
    
    System.out.println();
    
    for (i = 0; i < 10; i++) {
      System.out.print(numero[i]);
      
      if (numero[i] == minimo) {
        System.out.print(" mínimo");
      } 
      
      if (numero[i] == maximo) {
        System.out.print(" máximo");
      }
      
      System.out.println();
      
    }
  }
}
