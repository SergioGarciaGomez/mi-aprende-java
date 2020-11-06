/**
 * Ejercicio 20 Tema 4
 * Dice si el número es capicúa, se permiten 5 cifras y números enteros positivos
 * @author Sergio García
 */
public class Ejercicio20 { // Clase principal
  public static void main(String[] args) { 
    int n;
    boolean capicua = false;
    System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
    n = Integer.parseInt(System.console().readLine());
    
    // Una cifra
    if (n < 10) {
      capicua = true;
    }
    
    // Dos cifras
    if ((n >= 10) && (n < 100)) {
      if ((n / 10) == (n % 10)) {
        capicua = true;
      }
    }
    
    // Tres cifras
    if ((n >= 100) && (n < 1000)) {
      if ((n / 100) == (n % 10)) {
        capicua = true;
      }
    }
    
    // Cuatro cifras
    if ((n >= 1000) && (n < 10000)) {
      if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
        capicua = true;
      }
    }
    
    // Cinco cifras
    if (n >= 10000) {
      if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
        capicua = true;
      }
    }
    
    if (capicua) {
    System.out.println("El número introducido es capicúa.");
    } else {
    System.out.println("El número introducido no es capicúa.");
    }  
  }
}