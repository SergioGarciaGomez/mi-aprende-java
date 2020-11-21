/**
 * Ejercicio 25 Tema 4
 * Presupuesto para una tienda de banderas. El precio es de 1 céntimo de € por cm2.
 * 2.5€ extra si es con escudo bordado. Gastos de envío de 3.25€. IVA incluido en todo.
 * @author Sergio García
 */
public class Ejercicio25 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduzca la altura de la bandera en cm: ");
    int altura = Integer.parseInt(System.console().readLine());
    if (altura <= 0) {
      System.out.print("Esa altura es incorrecta.");
      System.exit(0);
    }
    
    System.out.print("Introduzca la longitud de la bandera en cm: ");
    int anchura = Integer.parseInt(System.console().readLine());
    if (anchura <= 0) {
      System.out.print("Esa anchura es incorrecta.");
      System.exit(0);
    }
    
    System.out.print("Introduzca si quiere el escudo bordado (si/no): ");
    String bordado = System.console().readLine();
    double costeBordado = 0;
    switch(bordado) {
      case "no":
        break;
      case "si":
        costeBordado = 2.5;
        break;
      default:
        System.out.print("Los datos introducidos son incorrectos.");
        System.exit(0);
    }
    
    double gastosEnvio = 3.25;
    int cmDeBandera = altura * anchura;
    double precioPorCm = 0.01;
    double precioBandera = cmDeBandera* precioPorCm;
    double precioFinal = cmDeBandera * precioPorCm + gastosEnvio + costeBordado;
    System.out.printf("Coste de la bandera:  %7.2f€\n", precioBandera);
    System.out.printf("Bordado:              %7.2f€\n", costeBordado);
    System.out.printf("Gastos de envío:      %7.2f€\n", gastosEnvio);
    System.out.printf("Precio final:         %7.2f€\n", precioFinal);
  }
}