/**
 * Conversor de Mb a Kb
 * Ejercicio 10 Tema 3
 * @author Sergio García
 */
public class Ejercicio10 { // Clase principal
  public static void main(String[] args) {
    String linea;
    /* Recoge los Mbs para convertir a Kbs */
    System.out.print("Introduce una cantidad de Mbs: ");
    linea = System.console().readLine();
    double mb = Double.parseDouble(linea);
    /* Convierte los Mbs a Kbs */
    double kb = mb * 1000;
    System.out.printf("%.3f mb son %.2f kb", mb, kb);
  }
}
