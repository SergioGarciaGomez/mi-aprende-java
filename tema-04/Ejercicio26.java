/**
 * Ejercicio 26 Tema 4
 * Calcula precio para entradas de cine en función del número de personas y el día.
 * El precio de una entrada es 8€. Si es miércoles el precio es de 5€.
 * Si es jueves la entrada para 2 cuesta 11€.
 * Con la tarjeta CineCampa se obtiene un 10% de descuento.
 * @author Sergio García
 */
public class Ejercicio26 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Número de entradas: ");
    int numeroEntradas = Integer.parseInt(System.console().readLine());
    
    if (numeroEntradas < 1) {
      System.out.print("El número introducido es incorrecto.");
      System.exit(0);
    }
    
    System.out.print("Día: ");
    String dia = System.console().readLine();
    double precioEntrada = 0;
    double precioEntradaPareja = 0;
    int entradasPareja = 0;
    int entradasIndividuales = 0;
    switch(dia) {
      case "lunes":
      case "martes":
      case "viernes":
      case "sabado":
      case "domingo":
        precioEntrada = 8;
        entradasIndividuales = numeroEntradas;
        break;
      case "miercoles":
        precioEntrada = 5;
        entradasIndividuales = numeroEntradas;
        break;
      case "jueves":
        entradasPareja = numeroEntradas / 2;
        entradasIndividuales = numeroEntradas % 2;
        precioEntrada = 8;
        precioEntradaPareja = 11;
        break;
      default:
        System.out.print("El día introducido es incorrecto.");
        System.exit(0);
    } // fin switch del día
    
    System.out.print("¿Tiene tarjeta de CineCampa?(si/no): ");
    String tarjeta = System.console().readLine();
    double descuento = 0;
    switch(tarjeta) {
      case "si":
        descuento = 10;
        break;
      case "no":
        break;
      default:
        System.out.print("El dato introducido es incorrecto.");
        System.exit(0);
    }
    double precioSinDescuento = (entradasIndividuales * precioEntrada) + (entradasPareja * precioEntradaPareja);
    double precioFinal = precioSinDescuento -  precioSinDescuento * descuento / 100;
    if (entradasPareja > 0) {
      System.out.printf("Entradas de pareja               %2d\n", entradasPareja);
      System.out.printf("Precio por entrada de pareja   %7.2f €\n", 11.0);
    }
    
    if (entradasIndividuales > 0) {
      System.out.printf("Entradas individuales            %2d\n", entradasIndividuales);
      System.out.printf("Precio por entrada individual  %7.2f €\n", precioEntrada);
    } 
    
    System.out.printf("Total sin descuento            %7.2f €\n", precioSinDescuento);
    System.out.printf("Descuento                      %7.2f €\n", precioSinDescuento -  precioFinal);
    System.out.printf("Total                          %7.2f €", precioFinal);
  }
}