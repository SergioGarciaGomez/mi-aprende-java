package tema08;

import funciones.Funciones;

/**
 * Ejercicio 51 Tema 8
 * 
 * Realiza un programa que rellene un array con 10 n�meros aleatorios comprendidos
 * entre 2 y 100 (ambos incluidos) y que los muestre por pantalla. A
 * continuaci�n, el programa indicar� para cada uno de ellos si es un n�mero
 * primo y/o un capic�a de la forma que muestra el ejemplo.
 * 
 * @author Sergio Garc�a
 */
public class Ejercicio51 {

  public static void main(String[] args) {
    
    int[] a = Funciones.generaArrayInt(10, 2, 100);
    
    System.out.println("Array aleatorio generado:\n");
    Funciones.muestraArrayInt(a);
    System.out.println();
    
    for (int n : a) {
      if (Funciones.esPrimo(n)) {
        System.out.print("El " + n + " es primo");
      } else {
        System.out.print("El " + n + " no es primo");
      }
      
      if (Funciones.esCapicua(n)) {
        System.out.println(" y es capic�a.");
      } else {
        System.out.println(" y no es capic�a.");
      }
    }
  }
}