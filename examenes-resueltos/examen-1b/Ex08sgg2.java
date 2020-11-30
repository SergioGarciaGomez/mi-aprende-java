/**
 * Fecha: 25/11/2020
 * Grupo: 1º DAM
 * Examen 1 || Modelo B
 * Ejercicio 2
 * Calcula el precio de unas entradas de teatro en función 
 * del número de personas, del día de la semana y de si se tiene 
 * o no la tarjeta Coliseo. El precio base de una entrada son 10 euros. 
 * El miércoles, que es el día del espectador, el precio base es de 8 euros. 
 * Los jueves son el día de la pareja, por lo que dos entradas cuestan 15 euros. 
 * Con la tarjeta Coliseo, se obtiene un 10% de descuento sobre el precio final. 
 * Si un jueves, un grupo de 6 personas compran entradas, el precio total sería 
 * de 45 euros ya que son 3 parejas; pero si es un grupo de 7, 
 * pagarán 3 parejas más 1 individual que son 55 euros (45 + 10). 
 * Mostrar el resultado desglosado y bien formateado.
 * @author Sergio García Gómez
 */
public class Ex08sgg2 { // Clase principal
  public static void main(String[] args) {
    
    System.out.print("Venta de entradas Coliseo\n\n");
    System.out.print("Número de entradas: ");
    int numeroEntradas = Integer.parseInt(System.console().readLine());
    
    System.out.print("Día de la semana: ");
    String dia = System.console().readLine();
    double precioEntrada = 0;
    double precioEntradaPareja = 0;
    int entradasPareja = 0;
    int entradasIndividuales = 0;
    
    switch (dia) {
      case "lunes":
      case "martes":
      case "viernes":
      case "sábado":
      case "sabado":
      case "domingo":
        precioEntrada = 10;
        entradasIndividuales = numeroEntradas;
        break;
      case "miércoles":
      case "miercoles":
        precioEntrada = 8;
        entradasIndividuales = numeroEntradas;
        break;
      case "jueves":
        entradasPareja = numeroEntradas / 2;
        entradasIndividuales = numeroEntradas % 2;
        precioEntrada = 10;
        precioEntradaPareja = 15;
        break;
      default:
        System.out.print("El día introducido es incorrecto");
    } // fin switch dia
    
    System.out.print("¿Tiene tarjeta Coliseo? (s/n): ");
    String tarjeta = System.console().readLine();
    double descuento = 0;
    
    switch (tarjeta) {
      case "s":
        descuento = 10;
        break;
      case "n":
        descuento = 0;
        break;
      default:
        System.out.print("El día introducido es incorrecto.");
    }
    
    double precioSinDescuento = (entradasIndividuales * precioEntrada) + (entradasPareja * precioEntradaPareja);
    double precioFinal = (precioSinDescuento - (precioSinDescuento * descuento / 100));
    
    System.out.println("Aquí tiene sus entradas. Gracias por su compra");
    
    if (entradasPareja > 0) {
      System.out.printf("Entradas pareja:         %d\n", entradasPareja);
      System.out.printf("Precio unitario:        %5.2f €\n", precioEntradaPareja);
    }
    
    if (entradasIndividuales > 0) {
      System.out.printf("Entradas individuales:   %d\n  ", entradasIndividuales);
      System.out.printf("Precio unitario         %5.2f €\n", precioEntrada);
    }
    
    System.out.printf("Total:                  %5.2f €\n", precioSinDescuento);
    System.out.printf("Descuento:              %5.2f €\n", precioSinDescuento - precioFinal);
    System.out.printf("A pagar:                %5.2f €\n", precioFinal);
    
  }
}