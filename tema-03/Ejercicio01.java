/**
 * Ejercicio 1 Tema 3
 * Pide 2 números y realiza multiplicación
 * @author Sergio García
 */
	
public class Ejercicio01 { // Clase principal
  public static void main(String[] args) {
    String linea;
    /* Lee el primer número que insertes */
    System.out.print("Introduce un número: ");
    linea = System.console().readLine();
    int numero1 = Integer.parseInt(linea);
    /* Lee el segundo número que insertes */
    System.out.print("Introduce otro número: ");
    linea = System.console().readLine();
    int numero2 = Integer.parseInt(linea);
    /* Calcula el resultado final */
    int resultado = numero1 * numero2;
    System.out.println("El resultado de la multiplicación es: " + resultado);
  }
}
