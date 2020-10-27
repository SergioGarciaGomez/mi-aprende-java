/**
 * Ejercicio 6 Tema 4
 * Calcula el tiempo que tarda en caer un objeto desde una altura h: t = raiz(2h/g)
 * @author Sergio García
 */
public class Ejercicio06 { // Clase principal
  public static double g = 9.81;
  public static void main(String[] args) {
    System.out.print("Introduzca la altura en metros de donde va a caer el objeto: ");
    double h = Double.parseDouble(System.console().readLine());
    double t = Math.sqrt(2 * h / g);
    System.out.printf("Desde los %.2f metros de altura, el objeto tarda %.2f segundos en llegar al suelo.", h, t);
  }
}
