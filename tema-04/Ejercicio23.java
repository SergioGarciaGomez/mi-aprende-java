/**
 * Ejercicio 23 Tema 4
 * Calcula el precio final de un producto según su base imponible (precio antes de impuestos), 
 * el tipo de IVA aplicado (general, reducido o superreducido) y el código promocional. 
 * Los tipos de IVA general, reducido y superreducido son del 21%, 10% y 4% respectivamente. 
 * Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%.
 * @author Sergio García
 */
public class Ejercicio23 { // Clase principal
  public static void main(String[] args) { 
    System.out.print("Introduce la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    
    if (baseImponible < 0) {
      System.out.print("Esa base imponible es errónea");
      System.exit(0);
    }
    
    System.out.print("Introduce el tipo de IVA (general, reducido o superreducido): ");
    String tipoIVA = System.console().readLine();
    int iva = 0;
    
    switch(tipoIVA) {
      case "general":
        iva = 21;
        break;
      case "reducido":
        iva = 10;
        break;
      case "superreducido":
        iva = 4;
        break;
      default:
        System.out.println("El tipo de IVA introducido es erróneo.");
        System.exit(0);
    }
    
    double precioIVA = baseImponible * iva / 100;
    double precioSinDescuento = baseImponible + precioIVA;
    
    System.out.print("Introduce el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codigoPromocional = System.console().readLine();
    
    double descuento = 0;
    
    switch(codigoPromocional) {
      case "nopro":
        break;
      case "mitad":
        descuento = precioSinDescuento / 2;
        break;
      case "meno5":
        descuento = precioSinDescuento - 5;
        break;
      case "5porc":
        descuento = precioSinDescuento * 5 / 100;
        break;
      default:
        System.out.print("El código introducido es erróneo.");
        System.exit(0);
    }    
    
    double precioFinal = precioSinDescuento - descuento;
    
    System.out.printf("Base imponible        %.2f\n", baseImponible);
    System.out.println("Tipo de IVA           " +  tipoIVA);
    System.out.printf("IVA                   %.2f\n", precioIVA);
    System.out.println("Código promocional    " + codigoPromocional);
    System.out.printf("Descuento             %.2f\n", descuento);
    System.out.printf("Precio sin descuento  %.2f\n", precioSinDescuento);
    System.out.printf("Precio final          %.2f\n", precioFinal);

  }
}