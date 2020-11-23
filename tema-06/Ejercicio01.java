/**
 * Ejercicio 1 Tema 6
 * 
 * @author Sergio García
 */
public class Ejercicio01 { // Clase principal
  public static void main(String[] args) {
    int tirada;
    int suma = 0;
    for (int i = 0; i < 3; i++) {
      tirada = (int)(Math.random() * 6) + 1;
      System.out.println(tirada + " ");
      suma += tirada;
    }
    System.out.print("La suma de las tiradas es " + suma);
  }
}