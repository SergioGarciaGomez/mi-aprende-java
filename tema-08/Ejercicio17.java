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
    long decimal = 0;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca un número binario. ");
    System.out.print("Empiece por 1 preferiblemente: ");
    long binario = Long.parseLong(s.nextLine());
    
    int bits = funciones.Funciones.digitos(binario);
    
    for(int i = 0; i < bits; i++) {
      decimal += funciones.Funciones.digitoNumero(binario, bits - i - 1) * funciones.Funciones.potencia(2, i);
    }
    
    System.out.println(binario + " en binario es " + decimal + " en decimal.");
  }
}
