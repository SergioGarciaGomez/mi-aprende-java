package tema08;

import java.util.Scanner;

/**
 * Ejercicio 18 Tema 8
 * 
 * Pasa de decimal a binario
 * 
 * @author Sergio García
 */
public class Ejercicio18 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número en base 10 para pasarlo a binario: ");
    int decimal = Integer.parseInt(s.nextLine());
    
    System.out.println(decimal + " en decimal es " + funciones.Funciones.decimalABinario(decimal) + " en binario.");
  }
}
