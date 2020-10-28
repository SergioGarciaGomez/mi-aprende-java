/**
 * Ejercicio 11 Tema 4
 * Dice los segundos que faltan para llegar a media noche
 * @author Sergio García
 */
public class Ejercicio11 { // Clase principal
  public static void main(String[] args) {
    /* Pide hora */
    System.out.print("Introduce una hora, primero la hora y luego los minutos.\n");
    System.out.print("Hora (0-23): ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Minutos (0-59): ");
    int minutos = Integer.parseInt(System.console().readLine());
    /* Calcula el tiempo transcurrido en todo el día desde las 00:00 de la noche anterior */
    int segundosTranscurridos = (3600 * hora) + ( 60 * minutos);
    /* Se resta el tiempo transcurrido a los segundos totales de un día */
    int segundosParaMedianoche = (3600 * 24) - segundosTranscurridos;
    
    if ((hora < 0) ||(hora > 23) || (minutos < 0) || (minutos > 59)) {
     System.out.printf("La hora %d:%d no existe", hora, minutos);
    } else {
      System.out.printf("Desde las %d:%d hasta medianoche faltan %d segundos", hora, minutos, segundosParaMedianoche);
    }
  }
}