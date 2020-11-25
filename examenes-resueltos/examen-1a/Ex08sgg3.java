/**
 * Ejercicio 3 Examen 1
 * Ampliación del 1. Si alguno de los datos introducidos es incorrecto, 
 * el programa debe seguir preguntando hasta que se introduzca un dato correcto.
 * @author Sergio García
 */
public class Ex08sgg3 { // Clase principal
  public static void main(String[] args) {
    int numeroPaquetes = 0;
    while (numeroPaquetes < 20) {
      System.out.print("Introduzca la cantidad de paquetes que desea: ");
      numeroPaquetes = Integer.parseInt(System.console().readLine());
      if (numeroPaquetes < 20) {
        System.out.println("El pedido mínimo es de 20 paquetes.");
      }
    }
  
    int numeroColores = 0;
    while (numeroColores < 1) {
      System.out.print("Número de colores de la impresión de la taza: ");
      numeroColores = Integer.parseInt(System.console().readLine());
      if (numeroColores < 1) {
        System.out.println("El mínimo de colores es 1.");
      }
    }
    
    int tipoLlavero = 0;
    while ((tipoLlavero < 1) || (tipoLlavero > 2)) {
      System.out.print("1) Llavero de plástico 2) Llavero metálico: ");
      tipoLlavero = Integer.parseInt(System.console().readLine());
      if ((tipoLlavero < 1) || (tipoLlavero > 2)) {
        System.out.println("Sólo tenemos dos tipos de llaveros.");
      }
    }
    
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
