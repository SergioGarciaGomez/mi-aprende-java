/**
 * Ejercicio 7 Tema 6
 * Escribe un programa que muestre tres apuestas de la quiniela en
 * tres columnas para los partidos y el pleno al quince (15 filas).
 * @author Sergio García
 */
public class Ejercicio07 { // Clase principal
  public static void main(String[] args) {
    
    int resultadoPartido;
    int columnas = 3;
    
    for (int fila = 1; fila <= 15; fila++) {
      System.out.printf("Partido%4d. |", fila);
    
      if (fila == 16) {
        columnas = 1;
      }
    
      for (int apuesta = 1; apuesta <= columnas; apuesta++) {
        resultadoPartido = (int)(Math.random() * 3) + 1;
        
        switch(resultadoPartido) {
          case 1:
            System.out.print(" 1 |");
            break;
          case 2:
            System.out.print(" 2 |");
            break;
          case 3:
            System.out.print(" X |");
          default:
        } // fin switch resultadoPartido
      }
      
      System.out.println();
    }
  }
}