/**
 * Ejercicio 19 Tema 4
 * Escribe el número de dígitos que tiene un número positivo o negativo de hasta 5 cifras
 * @author Sergio García
 */
public class Ejercicio19 { // Clase principal
  public static void main(String[] args) { 
    int n, numeroDigitos = 0;
    System.out.print("Introduzca un número entero (5 cifras como máximo y puede ser negativo): ");
    //Math.abs devuelve el valor absoluto de cualquier número, por ejemplo -10 lo devolvería como 10.
    n = Math.abs(Integer.parseInt(System.console().readLine()));
    
    if ( n < 10 ) {
      numeroDigitos = 1;
    }
    
    if (( n >= 10 ) && ( n < 100 )) {
      numeroDigitos = 2;
    }
    
    if (( n >= 100 ) && ( n < 1000 )) {
      numeroDigitos = 3;
    }

    if (( n >= 1000 ) && ( n < 10000 )) {
      numeroDigitos = 4;
    }

    if ( n >= 10000 ) {
      numeroDigitos = 5;
    }

    System.out.printf("El número introducido tiene %d dígitos.", numeroDigitos);  
  }
}