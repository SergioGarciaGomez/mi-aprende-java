/**
 * Ejercicio 6 Tema 3
 * Recibe la base y la altura de un triángulo para calcular su área
 * @author Sergio García
 */
public class Ejercicio06 { // Clase principal
  public static void main(String[] args) {
    String linea;
    /* Recoge la altura */
    System.out.print("Introduce la altura del triángulo: ");
    linea = System.console().readLine();
    double altura = Double.parseDouble(linea);
    /* Recoge la base */
    System.out.print("Introduce el ancho del triángulo: ");
    linea = System.console().readLine();
    double base = Double.parseDouble(linea);
    /* Calcula el área y la muestra por pantalla */
    double area = (base * altura) / 2;
    System.out.println("El área del triángulo es: " + area);
  }
}
