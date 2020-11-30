/**
 * Ejercicio 8 Tema 6
 * Modifica el programa anterior para que la probabilidad de que salga un "1" sea de 1/2,
 * la probabilidad de que salga "x" sea de 1/3 y la probabilidad de que salga "2" sea de 1/6.
 * Nótese que 1/2 = 3/6 y 1/3 = 2/6.
 * @author Sergio García
 */
public class Ejercicio08 { // Clase principal
  public static void main(String[] args) {
    
    int resultadoPartido;
    int columnas = 3;
    
    for (int fila = 1; fila <= 15; fila++) {
      System.out.printf("Partido%4d. |", fila);
    
      if (fila == 16) {
        columnas = 1;
      }
    
      for (int apuesta = 1; apuesta <= columnas; apuesta++) {
        resultadoPartido = (int)(Math.random() * 6) + 1;
        
        switch(resultadoPartido) {
          case 1:
          case 2:
          case 3:
            System.out.print(" 1 |");
            break;
          case 4:
            System.out.print(" 2 |");
            break;
          case 5:
          case 6:
            System.out.print(" X |");
          default:
        } // fin switch resultadoPartido
      }
      
      System.out.println();
    }
  }
}