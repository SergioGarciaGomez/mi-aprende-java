/**
 * Ejercicio 5 Tema 3
 * Recibe el ancho y la altura de un rectángulo para calcular su área
 * @author Sergio García
 */
public class Ejercicio05 { // Clase principal
  public static void main(String[] args) {
    String linea;
    /* Recoge la altura */
    System.out.print("Introduce la altura del rectángulo: ");
    linea = System.console().readLine();
    double altura = Double.parseDouble(linea);
    /* Recoge el ancho */
    System.out.print("Introduce el ancho del rectángulo: ");
    linea = System.console().readLine();
    double anchura = Double.parseDouble(linea);
    /* Calcula el área y la muestra por pantalla */
    double area = anchura * altura;
    System.out.println("El área del rectángulo es: " + area);
  }
}
