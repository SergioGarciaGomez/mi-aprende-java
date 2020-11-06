/**
 * Ejercicio 22 Tema 4
 * Programa que calcula los minutos que faltan para llegar al fin de semana, introduciendo antes un día y una hora
 * Se considera fin de semana el viernes a las 15:00
 * @author Sergio García
 */
public class Ejercicio22 { // Clase principal
  public static void main(String[] args) { 
    System.out.print("Introduzca un día de la semana (de lunes a domingo): ");
    String dia = System.console().readLine();
    int numeroDia = 0;
    
    switch(dia) {
      case "lunes":
        numeroDia = 0;
        break;
        
      case "martes":
        numeroDia = 1;
        break;

      case "miércoles":
      case "miercoles":
        numeroDia = 2;
        break;

      case "jueves":
        numeroDia = 3;
        break;
        
      case "sábado":
      case "sabado":
      case "domingo":
        System.out.print("Ya es fin de semana.");
        System.exit(0);
        break;

      case "viernes":
        numeroDia = 4;
        System.out.println("A continuación introduzca la hora (hora y minutos)");
        System.out.print("Hora: ");
        int horas = Integer.parseInt(System.console().readLine());
        System.out.print("Minutos: ");
        int minutos = Integer.parseInt(System.console().readLine());
        
        if (((horas < 0) || (horas >= 24) || (minutos < 0) || (minutos > 59))) {
          System.out.print("Esos datos son incorrectos.");
          System.exit(0);
        }
        
        if (horas >= 15) {
          System.out.print("Ya es fin de semana.");
          System.exit(0);
        } else {
          int minutosSiEsViernes;
          minutosSiEsViernes = (15 * 60) - (horas * 60) - minutos;
          System.out.print("Faltan " + minutosSiEsViernes + " minutos para llegar al fin de semana.");
          System.exit(0);
        }
        
      default:
        System.out.print("El día introducido no es correcto.");
        System.exit(0);
    }// FIN SWITCH
    
    System.out.println("A continuación introduzca la hora (hora y minutos)");
    System.out.print("Hora: ");
    int horas = Integer.parseInt(System.console().readLine());
    System.out.print("Minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    if (((horas < 0) || (horas >= 24)) || ((minutos < 0) || (minutos > 59))) {
      System.out.print("Esa hora no es correcta.");
      System.exit(0);
    }
    
    int minutosTotales = (4 * 24 * 60) + (15 * 60);
    int minutosActuales = (numeroDia * 24 * 60) + (horas * 60) + minutos;
    System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
  }
}