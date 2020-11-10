/**
 * Ejercicio 14 Tema 5
 * Pide una base y un exponente positivo entero y calcula la potencia
 * @author Sergio García
 */
public class Ejercicio14 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduzca un número para elevarlo a una potencia: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el exponente (positivo y entero): ");
    int exponente = Integer.parseInt(System.console().readLine());
    double potencia = 1;
    
    
    System.out.printf("%d^%d = %d", base, exponente, potencia);
  }
}
