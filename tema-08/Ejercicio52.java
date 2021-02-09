package tema08;

import funciones.Funciones;

/**
 * Ejercicio 52 Tema 8
 * 
 * Implementa la funci�n aleatorioDeArray con la cabecera que se muestra a
 * continuaci�n:
 * public static int aleatorioDeArray(int[] a)
 * Esta funci�n debe devolver un n�mero del array escogido al azar entre todos
 * los disponibles. Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a)
 * podr�a devolver el 111, el 222, el 333 o el 444. Si b = {52, 37}, aleatorio-
 * DeArray(b) podr�a devolver el 52 o el 37. Utiliza la funci�n en un programa de
 * prueba.
 * 
 * @author Sergio Garc�a
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