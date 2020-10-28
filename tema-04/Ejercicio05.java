/**
 * Ejercicio 5 Tema 4
 * Calculadora de ecuación de 1er grado tipo ax + b = 0
 * @author Sergio García
 */
public class Ejercicio05 { // Clase principal
  public static void main(String[] args) {
    /* Recoge la primera variable "a" */
    System.out.print("Introduce la primera variable: ");
    double a = Double.parseDouble(System.console().readLine());
    /* Recoge la segunda variable "b" */
    System.out.print("Introduce la segunda variable: ");
    double b = Double.parseDouble(System.console().readLine());
    /* Calcula x */
    
    if (a == 0) {
      System.out.print("No tiene solución.");
    } else {
      System.out.print("x = " + (-b / a));
    }
  }
}
