/**
 * Ejercicio 26 Tema 6
 * Realiza un programa que pinte una tableta de turrón con un bocado realizado de
 * forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
 * da alrededor del turrón, obviamente no se puede dar un bocado por en medio
 * de la tableta.
 * @author Sergio García
 */
public class Ejercicio26 { // Clase principal
  public static void main(String[] args) {
    
    System.out.print("Introduzca la anchura del turrón en onzas: ");
    int anchura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca la altura del turrón en onzas: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int posicionMordisco = (int)(Math.random() * (anchura * 2 + (altura - 2) * 2));
    int posicion = 0;
    
    for (int i = 0; i < altura; i++) {
      
      for (int h = 0; h < anchura; h++) {
        
        boolean onzaBorde = (i == 0) || (i == altura - 1) || (h == 0) || (h == anchura - 1);
        
        if ((posicion == posicionMordisco) && onzaBorde) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
        if (onzaBorde) {
          posicion++;
        }
      }
      System.out.println();
    }
  }
}