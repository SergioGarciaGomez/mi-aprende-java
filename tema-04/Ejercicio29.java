/**
 * Ejercicio 29 Tema 4
 * Calcula precio de un desayuno. Pregunta primero por palmera, donut o pitufo.
 * Palmera = 1.4€, donut = 1€. En caso de que sea pitufo, preguntar si es con aceite o tortilla.
 * Con aceite 1.2€ y con tortilla 1.6€. Por ultimo zumo o café, 1.5€ y 1.2€ respectivamente.
 * @author Sergio García
 */
public class Ejercicio29 { // Clase principal
  public static void main(String[] args) {
    System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
    String comida = System.console().readLine();
    double precioComida = 0;
    switch(comida) {
      case "palmera":
        precioComida = 1.4;
        break;
      case "donut":
        precioComida = 1;
        break;
      case "pitufo":
        System.out.print("¿Era pitufo con aceite o de tortilla? (aceite/tortilla): ");
        String tipoPitufo = System.console().readLine();
        if (tipoPitufo.equals("aceite")) {
          precioComida = 1.2;
        } else if (tipoPitufo.equals("tortilla")) {
          precioComida = 1.6;
        } else { 
          System.out.print("No tenemos pitufos de " + tipoPitufo + ".");
          System.exit(0);
        }
        break;
      default:
      System.out.print("No tenemos " + comida + " aquí.");
      System.exit(0);
    } // fin switch comida
    
    System.out.print("¿Ha tomado zumo o cafe?: ");
    String bebida = System.console().readLine();
    double precioBebida = 0;
    if (bebida.equals("cafe")) {
          precioBebida = 1.2;
        } else if (bebida.equals("zumo")) {
          precioBebida = 1.5;
        } else { 
          System.out.print("No tenemos " + bebida + ".");
          System.exit(0);
        }
    double total = precioBebida + precioComida;
    System.out.printf(comida + ":  %3.2f €\n", precioComida);
    System.out.printf(bebida + ":    %3.2f €\n", precioBebida);
    System.out.printf("Total:   %3.2f €", total);
  }
}