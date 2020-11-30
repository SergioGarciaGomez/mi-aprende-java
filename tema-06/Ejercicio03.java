/**
 * Ejercicio 3 Tema 6
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de
 * 48 cartas: 2, 3, 4, 5, 6, 7, 8, 9, sota, caballo, rey y as.
 * @author Sergio García
 */
public class Ejercicio03 { // Clase principal
  public static void main(String[] args) {
    
    String carta = "";
    String palo = "";

    int numeroCarta = (int)(Math.random() * 12) + 1;
    
    switch (numeroCarta) {
      case 1:
        carta = "As";
        break;
      case 10:
        carta = "Sota";
        break;
      case 11:
        carta = "Caballo";
        break;
      case 12:
        carta = "Rey";
        break;
      default:
        carta = String.valueOf(numeroCarta);
    } // fin switch numeroCarta
    
    int numeroPalo = (int)(Math.random() * 4) + 1;
    
    switch (numeroPalo) {
      case 1:
        palo = "oro";
        break;
      case 2:
        palo = "copas";
        break;
      case 3:
        palo = "espadas";
        break;
      case 4:
        palo = "bastos";
        break;
      default:
    } // fin switch numeroPalo
    
    System.out.print(carta + " de " + palo + ".");
  }
}