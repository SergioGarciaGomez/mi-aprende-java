/**
 * Conversor de Kb a Mb
 * Ejercicio 11 Tema 3
 * @author Sergio García
 */
public class Ejercicio11 { // Clase principal
  public static void main(String[] args) {
    String linea;
    /* Recoge los Kbs para convertir a Mbs */
    System.out.print("Introduce una cantidad de Kbs: ");
    linea = System.console().readLine();
    double kb = Double.parseDouble(linea);
    /* Convierte los Kbs a Mbs */
    double mb = kb / 1000;
    System.out.printf("%.4f kb son %.3f mb", kb, mb);
  }
}
