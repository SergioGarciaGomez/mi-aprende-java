/**
 * Calcula el volumen de un cono a partir de la altura y el radio de la base
 * Ejercicio 9 Tema 3
 * @author Sergio García
 */
public class Ejercicio09 { // Clase principal
  public static void main(String[] args) {
    String linea;
    double pi = Math.PI;
    /* Recoge la altura y el radio del cono */
    System.out.print("Introduce la altura del cono (en metros) : ");
    linea = System.console().readLine();
    double altura = Double.parseDouble(linea);
    System.out.print("Introduce el radio del cono (en metros): ");
    linea = System.console().readLine();
    double radio = Double.parseDouble(linea);
    /* Calcula el volumen del cono y lo muestra por pantalla */
    double volumen = (pi * (radio*radio) * altura) / 3;
    System.out.printf("El volumen del cono es de: %.2f metros cúbicos", volumen);
  }
}
