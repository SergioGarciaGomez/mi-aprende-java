package tema08;

import java.util.Scanner;

/**
 * Ejercicio 17 Tema 8
 * 
 * Pasa de binario a decimal
 * 
 * @author Sergio García
 */
public class Ejercicio17 {

  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número binario para pasarlo a decimal: ");
    long binario = Long.parseLong(s.nextLine());
    
    System.out.println(binario + " en binario es " + funciones.Funciones.binarioADecimal(binario) + " en decimal."); 
  }
}
