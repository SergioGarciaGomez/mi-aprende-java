/**
 * Ejercicio 3 Tema 3
 * Conversor de pesetas a euros
 * @author Sergio García
 */
public class Ejercicio03 { // Clase principal
  public static void main(String[] args) {
    String linea;
    /* Lee el número de pesetas para convertir a euros */
    System.out.print("Introduce el número de pesetas que quieres convertir a euros: ");
    linea = System.console().readLine();
    int pesetas = Integer.parseInt(linea);
    /* Convierte a euros */
    double euros = (pesetas / 166.9);
    System.out.printf("%d pesetas son %.2f euros.", pesetas, euros);
  }
}
