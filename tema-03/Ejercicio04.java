/**
 * Ejercicio 4 Tema 3
 * Suma, resta, multiplica y divide 2 números introducidos
 * @author Sergio García
 */
public class Ejercicio04 { // Clase principal
  public static void main(String[] args) {
    String linea;
    /* Recoge el primer número */
    System.out.print("Introduce un número: ");
    linea = System.console().readLine();
    double numero1 = Double.parseDouble(linea);
    /* Recoge el segundo número */
    System.out.print("Introduce otro número: ");
    linea = System.console().readLine();
    double numero2 = Double.parseDouble(linea);
    /* Calcula todos los resultados y los muestra por pantalla */
    System.out.println( numero1 + " + " + numero2 + " = " + (numero1 + numero2));
    System.out.println( numero1 + " - " + numero2 + " = " + (numero1 - numero2));
    System.out.println( numero1 + " * " + numero2 + " = " + (numero1 * numero2));
    System.out.println( numero1 + " / " + numero2 + " = " + (numero1 / numero2));
  }
}
