/**
 * Ejercicio 28 Tema 4
 * Piedra papel o tijera, primero se introduce una jugada, y luego la siguiente.
 * @author Sergio García
 */
public class Ejercicio28 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Jugador 1: Introduzca piedra, papel o tijera: ");
    String primerTurno = System.console().readLine();
    System.out.print("Jugador 2: Introduzca piedra, papel o tijera: ");
    String segundoTurno = System.console().readLine();
    int ganador =0;
    
    if (primerTurno.equals(segundoTurno)) {
      System.out.print(primerTurno +" vs " + segundoTurno + " = empate");
    } else {
      ganador = 2;
      switch(primerTurno) {
        case "piedra":
          if (segundoTurno.equals("tijera")) {
            ganador = 1;
          }
          break;
        case "papel":
          if (segundoTurno.equals("piedra")) {
            ganador = 1;
          }
          break;
        case "tijera":
          if (segundoTurno.equals ("papel")) {
            ganador = 1;
          }
          break;
        default:
          System.out.print("Datos incorrectos");
          System.exit(0);
      }
      System.out.print("Gana el jugador " + ganador);
    }
  }   
}