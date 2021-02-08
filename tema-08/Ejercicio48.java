package tema08;

/**
 * Ejercicio 48 Tema 8 Define la función concatena con la siguiente cabecera:
 * public static int[] concatena(int[] a, int[] b) Esta función toma dos arrays
 * como parámetros y devuelve un array que es el resultado de concatenar ambos.
 * Por ej. si a = { 8, 9, 0 } y b = { 1, 2, 3 }, concatena(a, b) devuelve { 8,
 * 9, 0, 1, 2, 3 }.
 * 
 * @author Sergio García
 */
public class Ejercicio48 {

  public static void main(String[] args) {
    int[] a = {8, 9, 0};
    int[] b = {1, 2, 3};
    for (int e : funciones.Funciones.concatenaArrays(a, b)) {
    System.out.print(e + " ");
    }
  }
}
