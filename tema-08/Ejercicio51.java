package tema08;

import funciones.Funciones;

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