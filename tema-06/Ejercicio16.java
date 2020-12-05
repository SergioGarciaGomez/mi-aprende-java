/**
 * Ejercicio 16 Tema 6
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje "Lo siento, ha
 * perdido".
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje "Bien,
 * ha recuperado su moneda".
 * d) Si las tres figuras son iguales se debe mostrar "Enhorabuena, ha ganado
 * 10 monedas.
 * @author Sergio García
 */
public class Ejercicio16 { // Clase principal
  public static void main(String[] args) {
    String figura = "", figura1 = "", figura2 = "", figura3 = "";
    int numeroFigura = 0, monedas = 10;
    System.out.println("|||| CASINO LAS VEGAS |||||\n");
    System.out.println("Tendrás 10 monedas para empezar y cada tirada costará una moneda.");
    System.out.println("Si sacas 3 iguales ganas 10 monedas, y con dos iguales, 1 moneda.\n");
    System.out.println("Cuando quiera dejar de jugar, introduzca 0");
    String respuesta = "";
    int tiradas = 0;
    System.out.println("\nPulse INTRO para jugar.\n");
    
    do {
      
      respuesta = System.console().readLine();
      monedas--;
      tiradas++;

      if (respuesta.equals("0")) {
        System.exit(0);
      }
      
      System.out.println("||||| TIRADA Nº " + tiradas + " |||||\n");
        
      for (int i = 0; i < 3; i++) {
          
        numeroFigura = (int)(Math.random() * 5);
          
        switch (numeroFigura) {
          case 0:
            figura = "corazón";
            break;
          case 1:
            figura = "diamante";
            break;
          case 2:
            figura = "herradura";
            break;
          case 3:
            figura = "campana";
            break;
          case 4:
            figura = "limón";
            break;
          default:
        } // fin switch numeroFigura
        System.out.print(figura + " ");
          
        if (i == 0) {
            figura1 = figura;
        } else if (i == 1) {
            figura2 = figura;
        } else if (i == 2) {
            figura3 = figura;
        }
      } // fin for
        
      System.out.println();
        
      if ((figura1 == figura2) && (figura1 == figura3)) {
            monedas += 5;
            System.out.println("\n¡Triple! Ha ganado 5 monedas.");
        } else if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {
            System.out.println("\nLo siento, ha perdido.");
        } else {
            System.out.println("\nBien, ha recuperado su moneda.");
            monedas++;
        }
        
      System.out.println();
      System.out.println("Le quedan " + monedas + " monedas");
        
    } while (monedas > 0);
  }
}