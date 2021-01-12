/**
 * Ejercicio 4 Tema 7
 * Escribe un programa que lea 10 números por teclado y que luego
 * los muestre en orden inverso, es decir, el primero que se
 * introduce es el último en mostrarse y viceversa
 * @author Sergio García
 */
public class Ejercicio04 { // Clase principal
  public static void main(String[] args) {
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    int i;
    
    for (i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random()*101);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = numero[i] * numero[i] * numero[i];
    }
    
    System.out.println("\nSe muestra un número aleatorio entre 0 y 100, su cuadrado y su cubo:\n");
    
    System.out.println("  n  │   n²  │    n³\n─────┼───────┼─────────");
    
    for (i = 0; i < 20; i++) {
      System.out.printf("%4d │ %5d │%8d\n", numero[i], cuadrado[i], cubo[i]);
    }
  }
}
