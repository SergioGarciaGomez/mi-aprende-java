/**
 * Ejercicio 30 Tema 6
 * El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los
 * Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que
 * le hagan compañía al pez. Realiza un programa que pinte por pantalla la pecera
 * con los tres animalitos acuáticos colocados dentro en posiciones aleatorias. Por
 * una cuestión de física elemental, ninguno de los animales puede coincidir
 * en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera,
 * que como mínimo serán de 4 unidades.
 * @author Sergio García
 */
public class Ejercicio30 { // Clase principal
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    int alto = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    int ancho = Integer.parseInt(System.console().readLine());
    
    int posicion = 0;
    int posicionPez;
    int posicionCaballito;
    int posicionCaracola;
    
    do {
      posicionPez = (int) (Math.random() * (alto - 2) * (ancho - 2));
      posicionCaballito = (int) (Math.random() * (alto - 2) * (ancho - 2));
      posicionCaracola = (int) (Math.random() * (alto - 2) * (ancho - 2));
    } while (
      (posicionPez == posicionCaballito) ||
      (posicionPez == posicionCaracola) ||
      (posicionCaballito == posicionCaracola));
      
    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    System.out.println();
    
    for (int i = 2; i < alto; i++) {
      System.out.print("*");
      for (int j = 2; j < ancho; j++) {
        if (posicion == posicionPez) {
          System.out.print("&");
        } else if (posicion == posicionCaracola) {
          System.out.print("@");
        } else if (posicion == posicionCaballito) {
          System.out.print("$");
        } else {
          System.out.print(" ");
        }
        posicion++;
      }
      System.out.println("*");
    }
      
    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    System.out.println();
  }
}