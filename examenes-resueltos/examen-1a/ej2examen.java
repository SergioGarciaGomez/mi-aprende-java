/**
 * Ejercicio 2 Examen 1
 * Presupuesto para paquetes compuestos por tazas y llaveros. Pedido mínimo de 20 paquetes.
 * Al precio final se le suma 21% de IVA. El precio de cada taza es de 4.90€ para pedidos entre 20 y 39 paquetes.
 * 3.90€ para pedidos entre 40 y 99 paquetes. 3.20€ para pedidos de 100 o más paquetes.
 * Estos precios son si 1, 2 o 3 colores. Si lleva más, cuestan un 20% más.
 * Cada llavero de plástico cuesta 2€ en menos de 50 unidades y 1.50€ para pedidos de 50 o más unidades.
 * Cada llavero metálico cuesta 3€ en menos de 50 unidades y 2.50€ para pedidos de 50 o más unidades.
 * Suponemos que el usuario introduce los datos correctamente.
 * @author Sergio García
 */
public class ej2examen { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduzca la cantidad de paquetes que desea: ");
    int numeroPaquetes = Integer.parseInt(System.console().readLine());
    System.out.print("Número de colores de la impresión de la taza: ");
    int numeroColores = Integer.parseInt(System.console().readLine());
    System.out.print("1) Llaveros de plástico 2) Llaveros metálicos: ");
    int tipoLlavero = Integer.parseInt(System.console().readLine());
    
    System.out.print("PROMOCIONES COMERCIALES - PRESUPUESTO\n\n");
    double precioTaza = 0;
    double precioLlavero = 0;
    
    if (numeroPaquetes >= 20 && numeroPaquetes < 40) {
      precioTaza = 4.9;
    } else if (numeroPaquetes >= 40 && numeroPaquetes < 100) {
      precioTaza = 3.9;
    } else if (numeroPaquetes >= 100) {
      precioTaza = 3.2;
    }
    
    if (numeroColores > 0 && numeroColores <= 3) {
      System.out.printf("Taza (%d colores)  %5d unid.\n", numeroColores, numeroPaquetes);
      System.out.printf("Precio unitario     %7.2f €\n", precioTaza);
      System.out.printf("Total tazas         %7.2f €\n", precioTaza * numeroPaquetes);
    } else if (numeroColores > 3) {
      precioTaza = precioTaza + (precioTaza * 0.2);
      System.out.printf("Taza (%d colores)  %5d unid.\n", numeroColores, numeroPaquetes);
      System.out.printf("Precio unitario     %7.2f €\n", precioTaza);
      System.out.printf("Total tazas         %7.2f €\n", precioTaza * numeroPaquetes);
    }
    
    if (tipoLlavero == 1) {
      if (numeroPaquetes >= 20 && numeroPaquetes < 50) {
      precioLlavero = 2;
      System.out.printf("Llaveros (c.u)      %7.2f €\n", precioLlavero);
      System.out.printf("Total llaveros      %7.2f €\n", precioLlavero * numeroPaquetes);
      System.out.printf("Tazas + llaveros    %7.2f €\n", precioLlavero * numeroPaquetes + precioTaza * numeroPaquetes);
      System.out.printf("IVA                 %7.2f €\n", (precioLlavero * numeroPaquetes + precioTaza * numeroPaquetes) * 0.21);
      System.out.printf("Total               %7.2f €\n", (precioLlavero * numeroPaquetes + precioTaza * numeroPaquetes) * 1.21);
      } else if (numeroPaquetes >= 50) {
      precioLlavero = 1.5;
      System.out.printf("Llaveros (c.u)      %7.2f €\n", precioLlavero);
      System.out.printf("Total llaveros      %7.2f €\n", precioLlavero * numeroPaquetes);
      System.out.printf("Tazas + llaveros    %7.2f €\n", precioLlavero * numeroPaquetes + precioTaza * numeroPaquetes);
      System.out.printf("IVA                 %7.2f €\n", (precioLlavero * numeroPaquetes + precioTaza * numeroPaquetes) * 0.21);
      System.out.printf("Total               %7.2f €\n", (precioLlavero * numeroPaquetes + precioTaza * numeroPaquetes) * 1.21);
      } 
    } else if (tipoLlavero == 2) {
      if (numeroPaquetes >= 20 && numeroPaquetes < 50) {
      precioLlavero = 3;
      System.out.printf("Llaveros (c.u)      %7.2f €\n", precioLlavero);
      System.out.printf("Total llaveros      %7.2f €\n", precioLlavero * numeroPaquetes);
      System.out.printf("Tazas + llaveros    %7.2f €\n", precioLlavero * numeroPaquetes + precioTaza * numeroPaquetes);
      System.out.printf("IVA                 %7.2f €\n", (precioLlavero * numeroPaquetes + precioTaza * numeroPaquetes) * 0.21);
      System.out.printf("Total               %7.2f €\n", (precioLlavero * numeroPaquetes + precioTaza * numeroPaquetes) * 1.21);
      } else if (numeroPaquetes >= 50) {
      precioLlavero = 2.5;
      System.out.printf("Llaveros (c.u)      %7.2f €\n", precioLlavero);
      System.out.printf("Total llaveros      %7.2f €\n", precioLlavero * numeroPaquetes);
      System.out.printf("Tazas + llaveros    %7.2f €\n", precioLlavero * numeroPaquetes + precioTaza * numeroPaquetes);
      System.out.printf("IVA                 %7.2f €\n", (precioLlavero * numeroPaquetes + precioTaza * numeroPaquetes) * 0.21);
      System.out.printf("Total               %7.2f €\n", (precioLlavero * numeroPaquetes + precioTaza * numeroPaquetes) * 1.21);
      }
    }
  }
}
