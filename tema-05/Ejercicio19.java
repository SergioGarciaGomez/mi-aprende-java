/**
 * Ejercicio 19 Tema 5
 * Pinta pirámide con altura y carácter elegidos por teclado.
 * @author Sergio García
 */
public class Ejercicio19 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    int planta = 1;
    int longitudDeLinea = 1;
    int espacios = alturaIntroducida - 1;
    while (planta <= alturaIntroducida) {
      
      // Vértice
      for (int i = 1; i < espacios; i++) {
        System.out.print(" ");
      }
      System.out.println("*");
      
      // inserta espacios
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      // pinta la línea
      for (int i = 1; i <= espacios; i++) {
        System.out.print("*");
      }
      System.out.println();
      planta++;
      espacios--;
      longitudDeLinea += 2;
    }
  }
}
