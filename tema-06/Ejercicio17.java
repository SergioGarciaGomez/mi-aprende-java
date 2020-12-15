/**
 * Ejercicio 17 Tema 6
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro de
 * la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo.
 * @author Sergio García
 */
public class Ejercicio17 { // Clase principal
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca altura de la pecera (4 como mínimo): ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca anchura de la pecera (4 como mínimo): ");
    int anchura = Integer.parseInt(System.console().readLine());
    
    int posicionPez = (int)(Math.random() * (altura - 2) * (anchura - 2));
    
    int posicion = 0;
    
    /* Línea superior de la pecera */
    
    for (int i = 0; i < anchura; i++) {
      System.out.print("*");
    }
    System.out.println();
    
    /* Líneas medias de la pecera */
    
    for (int i = 2; i < altura; i++) {
      System.out.print("*"); /* Pinta la izquierda */
      for (int h = 2; h < anchura; h++) {
        if (posicion == posicionPez) { /* Determina las posiciones que puede tomar el pez y elige una en función del valor aleatorio */
          System.out.print("&");
        } else {
          System.out.print(" ");
        }
        posicion++;
      }
      System.out.println("*"); /* Pinta la derecha */
    }
    
    /* Línea inferior de la pecera, exactamente igual que la línea superior */
    
    for (int i = 0; i < anchura; i++) {
      System.out.print("*");
    }
  }
}
