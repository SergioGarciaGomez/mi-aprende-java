/**
 * Ejercicio 21 Tema 6
 * Realiza un programa que genere una secuencia de cinco monedas de curso
 * legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
 * 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
 * posiciones posibles son cara y cruz.
 * @author Sergio García
 */
public class Ejercicio21 { // Clase principal
  public static void main(String[] args) {
    
    int numMoneda;
    String moneda = "";
    int numPosiciones;
    String posiciones = "";
    
    for (int i = 0; i < 5; i++) {
      numMoneda = (int)(Math.random() * 8);
      
      switch (numMoneda) {
        case 0:
          moneda = "1 céntimo";
          break;
        case 1:
          moneda = "2 céntimos";
          break;
        case 2:
          moneda = "5 céntimos";
          break;
        case 3:
          moneda = "10 céntimos";
          break;
        case 4:
          moneda = "20 céntimos";
          break;
        case 5:
          moneda = "50 céntimos";
          break;
        case 6:
          moneda = "1 euro";
          break;
        case 7:
          moneda = "2 euros";
          break;
        default:
      }
      
      numPosiciones = (int)(Math.random() * 2);
        
      switch (numPosiciones) {
        case 0:
          posiciones = "cara";
          break;
        case 1:
          posiciones = "cruz";
          break;
        default:
      }
      System.out.println(moneda + " - " + posiciones);
    }
  }
}
