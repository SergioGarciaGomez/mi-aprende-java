package tema08;

import funciones.Funciones;

/**
 * Ejercicio 51 Tema 8
 * 
 * Realiza un programa que rellene un array con 10 números aleatorios comprendidos
 * entre 2 y 100 (ambos incluidos) y que los muestre por pantalla. A
 * continuación, el programa indicará para cada uno de ellos si es un número
 * primo y/o un capicúa de la forma que muestra el ejemplo.
 * 
 * @author Sergio García
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
        System.out.println(" y es capicúa.");
      } else {
        System.out.println(" y no es capicúa.");
      }
    }
  }
}