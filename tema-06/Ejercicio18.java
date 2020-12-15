/**
 * Ejercicio 18 Tema 6
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 * sustituir el color blanco por colores más alegres. Realiza un programa que
 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 * cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
 * debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
 * naranja.
 * 
 * @author Sergio García
 */
public class Ejercicio18 { // Clase principal
  public static void main(String[] args) {
    
    int color1, color2, color3;
    
    do {
      color1 = (int)(Math.random() * 6);
      color2 = (int)(Math.random() * 6);
      color3 = (int)(Math.random() * 6);
    } while ((color1 == color2) || (color1 == color3) || (color2 == color3));
    
    String colorHab1 = "";
    
    switch (color1) {
      case 0:
        colorHab1 = "rojo";
        break;
      case 1:
          colorHab1 = "azul";
        break;
      case 2:
        colorHab1 = "verde";
        break;
      case 3:
        colorHab1 = "amarillo";
        break;
      case 4:
        colorHab1 = "violeta";
        break;
      case 5:
        colorHab1 = "naranja";
        break;
      default:
    }
    
    String colorHab2 = "";
    
    switch (color2) {
      case 0:
        colorHab2 = "rojo";
        break;
      case 1:
        colorHab2 = "azul";
        break;
      case 2:
        colorHab2 = "verde";
        break;
      case 3:
        colorHab2 = "amarillo";
        break;
      case 4:
        colorHab2 = "violeta";
        break;
      case 5:
        colorHab2 = "naranja";
        break;
      default:
    }
    
    String colorHab3 = "";
    
    switch (color3) {
      case 0:
        colorHab3 = "rojo";
        break;
      case 1:
        colorHab3 = "azul";
        break;
      case 2:
        colorHab3 = "verde";
        break;
      case 3:
        colorHab3 = "amarillo";
        break;
      case 4:
        colorHab3 = "violeta";
        break;
      case 5:
        colorHab3 = "naranja";
        break;
      default:
    }
    
    System.out.println("1ª Habitación: " + colorHab1);
    System.out.println("2ª Habitación: " + colorHab2);
    System.out.println("3ª Habitación: " + colorHab3);
  }
}