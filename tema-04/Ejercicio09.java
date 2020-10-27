/**
 * Ejercicio 9 Tema 4
 * Calculadora de ecuaciones de 2º grado (ax2 + bx + c = 0)
 * @author Sergio García
 */
public class Ejercicio09 { // Clase principal
  public static void main(String[] args) {
    double x1, x2;
    System.out.println("Introduzca los valores para calcular una ecuación de segundo grado tipo ax2 + bx + c = 0");
    System.out.print("Valor de a = ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Valor de b = ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("Valor de c = ");
    double c = Double.parseDouble(System.console().readLine());
    
    if ((a != 0) && (b != 0) && (c != 0)) {
      
      double discriminante = b*b - (4 * a * c);
      
      if (discriminante < 0) {
        System.out.println("La ecuación no tiene soluciones reales");
      } else {
        System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(2 * a));
        System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a));
      }
    }
    
    if 
  }
}