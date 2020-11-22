/**
 * Ejercicio 27 Tema 4
 * Presupuesto para una pastelería. 3 sabores: Manzana 18€, fresa 16€.
 * Si elige chocolate, tiene que dar a elegir entre blanco o negro, blanco 15€ y negro 14€.
 * Por último si se añade nata y se personaliza con un nombre. La nata son 2.5€ y la escritura 2.75€.
 * @author Sergio García
 */
public class Ejercicio27 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Elige el sabor de la tarta (manzana, fresa, chocolate): ");
    String sabor = System.console().readLine();
    double precioSabor = 0;
    int tipoChocolate = 0;
    switch(sabor) {
      case "manzana":
      case "Manzana":
      case "MANZANA":
        precioSabor = 18;
        break;
      case "fresa":
      case "Fresa":
      case "FRESA":
        precioSabor = 16;
        break;
      case "chocolate":
      case "Chocolate":
      case "CHOCOLATE":
        System.out.println("¿De qué chocolate lo quiere?");
        System.out.print("1 - Chocolate negro, 2 - Chocolate blanco: ");
        tipoChocolate = Integer.parseInt(System.console().readLine());
        if (tipoChocolate == 1) {
          precioSabor = 14;
        } else if (tipoChocolate == 2) {
          precioSabor = 15;
        } else {
          System.out.print("Los datos introducidos son incorrectos.");
          System.exit(0);
        }
        break;
      default:
        System.out.print("Los datos introducidos son incorrectos");
        System.exit(0);
    } // fin switch sabor
    
    System.out.print("¿Quiere añadir nata por 2.5€? (si/no): ");
    String nata = System.console().readLine();
    double precioNata = 0;
    switch(nata) {
      case "Si":
      case "si":
      case "SI":
        precioNata = 2.5;
        break;
      case "No":
      case "no":
      case "NO":
        precioNata = 0;
        break;
      default:
        System.out.print("Los datos introducidos son incorrectos");
        System.exit(0);
    } // fin switch nata
    
    System.out.print("¿Quiere añadir nata por 2.5€? (si/no): ");
    String escritura = System.console().readLine();
    double precioEscritura = 0;
    switch(escritura) {
      case "Si":
      case "si":
      case "SI":
        precioEscritura = 2.75;
        break;
      case "No":
      case "no":
      case "NO":
        precioEscritura = 0;
        break;
      default:
        System.out.print("Los datos introducidos son incorrectos");
        System.exit(0);
    } // fin switch escritura
    double total = precioSabor + precioNata + precioEscritura;
    System.out.println("Sabor de tarta:       " + sabor);
    System.out.printf("Precio por sabor:     %3.2f €\n", precioSabor);
    System.out.printf("Precio por nata:       %3.2f €\n", precioNata);
    System.out.printf("Precio por escritura:  %3.2f €\n", precioEscritura);
    System.out.printf("Total:                %3.2f €\n", total);
  }   
}