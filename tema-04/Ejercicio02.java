/**
 * Ejercicio 2 Tema 4
 * Pide hora y te habla de una forma u otra dependiendo de la hora
 * @author Sergio García
 */
public class Ejercicio02 { // Clase principal
  public static void main(String[] args) {
    /* Recoge la hora del día */
    System.out.print("Introduce una hora (formato 24h):");
    int hora = Integer.parseInt(System.console().readLine());
    /* Busca qué decir según la hora que sea */
    
    if ((hora >= 6) && (hora <= 12)) {
      System.out.print("Buenos días.");
    }
    
    if ((hora >= 13) && (hora <= 20)) {
      System.out.print("Buenas tardes.");
    }
    
    if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
      System.out.println("Buenas noches.");
    }
    
    if ((hora < 0) || (hora >= 24)) {
      System.out.print("La hora introducida no es correcta.");
    }
  }
}