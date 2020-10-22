/**
 * Ejercicio 1 Tema 2
 * Muestra la suma, resta, multiplicación y división de los números 144 y 999
 * @author Sergio García
 */
public class Ejercicio01 { // Clase principal
  public static void main(String[] args) {
    // Define la variable
    int x = 144;
    int y = 999;
    // Calcula y saca por pantalla los resultados
    double division = (double)x / (double)y;
    System.out.println("x = " + x + "  y = "+y);
    System.out.println("x + y = " + (x+y));
    System.out.println("x - y = " + (x-y));
    System.out.println("x * y = " + (x*y));
    System.out.println("x / y = " + division);
  }
}
