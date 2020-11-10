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
    
    if (exponente == 0) {
      potencia = 1;
    }
    
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    }
    
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia *= base;
      }
      potencia = 1 / potencia;
    }
    System.out.print( base + "^" + exponente + " = " + potencia);
  }
}
