/**
 * Ejercicio 8 Tema 5
 * Muestra la tabla de multiplicar de un número introducido por teclado
 * @author Sergio García
 */
public class Ejercicio08 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número y te digo su tabla de multiplicar: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    
    for (int i = 0; i <= 10; i ++) {
      int multiplicacion = (numero * i);  
      System.out.printf("%d x %2d = %4d \n", numero, i, multiplicacion);
    }
  }
}
