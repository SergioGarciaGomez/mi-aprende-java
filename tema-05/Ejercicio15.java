/**
 * Ejercicio 15 Tema 5
 * Pide 2 números, el primero real, como base
 * el segundo entero, como exponente. Se sacan 
 * por pantalla todas las potencias con el numero base
 * y todas las potencias hasta la potencia introducida
 * @author Sergio García
 */
public class Ejercicio15 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduzca un numero real para usar de base: ");
    int numeroBase = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca un numero entero para usar de exponente: ");
    int exponenteFinal = Integer.parseInt(System.console().readLine());
    double potencia;
    int exponente;

    for (int i = 1; i <= exponenteFinal; i++) {
      potencia = 1;
      exponente = i;
      
      for (int m = 0; m < exponente; m++) {
        potencia *= numeroBase;
      }
    
      System.out.println(numeroBase + "^" + i + " = " + potencia);
    }
  }
}
