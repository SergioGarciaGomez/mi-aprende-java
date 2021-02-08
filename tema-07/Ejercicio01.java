/**
 * Ejercicio 1 Tema 7
 * Define un array de 12 n�meros enteros con nombre num y asigna los valores
 * seg�n la tabla que se muestra a continuaci�n. Muestra el contenido de todos
 * los elementos del array. �Qu� sucede con los valores de los elementos que
 * no han sido inicializados?
 * Posici�n 0  1  2  3  4  5  6  7  8  9  10  11
 * Valor   39 -2        0     14    5 120
 * @author Sergio Garc�a
 */
public class Ejercicio01 { // Clase principal
  public static void main(String[] args) {
    int[] num = new int[12];
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("num[%2d]: %d\n", i, num[i]);
    }
  }
}
