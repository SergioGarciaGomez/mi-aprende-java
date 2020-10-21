/**
 * Ejercicio 6 Tema 2
 * Calcula una factura a partir de la base imponible (precio sin IVA)
 * @author Sergio García
 */
	
public class Ejercicio6_2 { // Clase principal
	public static void main(String[] args) {
		double baseImponible = 50;
		double IVA = 21;
		double totalFactura = (baseImponible + (baseImponible * IVA / 100));
		System.out.printf("La base imponible de la factura es de " + baseImponible + "€ \n");
		System.out.println("Si aplicamos el IVA que es de un 21% de la base imponible");
		System.out.printf("La factura en total sería de " + totalFactura + "€");
	}
}
