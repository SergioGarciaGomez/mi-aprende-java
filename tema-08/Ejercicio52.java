package tema08;

import funciones.Funciones;

/**
 * Ejercicio 52 Tema 8
 * 
 * Implementa la función aleatorioDeArray con la cabecera que se muestra a
 * continuación:
 * public static int aleatorioDeArray(int[] a)
 * Esta función debe devolver un número del array escogido al azar entre todos
 * los disponibles. Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a)
 * podría devolver el 111, el 222, el 333 o el 444. Si b = {52, 37}, aleatorio-
 * DeArray(b) podría devolver el 52 o el 37. Utiliza la función en un programa de
 * prueba.
 * 
 * @author Sergio García
 */
public class Ejercicio52 {

  public static void main(String[] args) {
    int[] a = { 999, 10, 100, 190 };
    int[] b = { 25, 500, 30 };
    int[] c = { 0, 0, 20 };
    
    System.out.println(Funciones.aleatorioDeArray(a));
    System.out.println(Funciones.aleatorioDeArray(b));
    System.out.println(Funciones.aleatorioDeArray(c));
  }
}