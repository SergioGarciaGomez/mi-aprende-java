/**
 * Recibe una base imponible y se le calcula el IVA para una factura final
 * Ejercicio 7 Tema 3
 * @author Sergio García
 */
public class Ejercicio07 { // Clase principal
  public static void main(String[] args) {
    final int IVA = 21;
    String linea;
    /* Recoge la base imponible */
    System.out.print("Introduce la base imponible: ");
    linea = System.console().readLine();
    double baseImponible = Double.parseDouble(linea);
    /* Calcula el total de la factura y la muestra por pantalla */
    double facTotal = (baseImponible * IVA / 100) + baseImponible;
    System.out.printf("El total sin IVA es: %.2f euros \n", baseImponible);
    System.out.printf("El total con IVA es: %.2f euros ", facTotal);
  }
}
