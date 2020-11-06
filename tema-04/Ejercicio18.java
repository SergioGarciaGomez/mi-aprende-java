/**
 * Ejercicio 18 Tema 4
 * Escribe la primera cifra de un número entero, se permiten hasta 5 cifras
 * @author Sergio García
 */
public class Ejercicio18 { // Clase principal
  public static void main(String[] args) { 
    int n, primeraCifra = 0;
    System.out.print("Introduzca un número entero (de hasta 5 cifras): ");
    n = Integer.parseInt(System.console().readLine());
    
    if ( n < 10 ) {
      primeraCifra = n;
    }
    
    if (( n >= 10 ) && ( n < 100 )) {
      primeraCifra = n / 10;
    }
    
    if (( n >= 100 ) && ( n < 1000 )) {
      primeraCifra = n / 100;
    }
    
    if (( n >= 1000 ) && ( n < 10000 )) {
      primeraCifra = n / 1000;
    }
    
    if ( n >= 10000 ) {
      primeraCifra = n / 10000;
    }
    System.out.println("La primera cifra del número introducido es el " + primeraCifra);
  }
}