/**
 * Ejercicio 5 Tema 2
 * Conversor de euros a pesetas
 * @author Sergio García
 */
	
public class Ejercicio5_2 { // Clase principal
	public static void main(String[] args) {
		int pesetas = 1000000;
		double euros = (pesetas*0.0069);
		System.out.printf("%d pesetas son %.2f euros.", pesetas, euros);
	}
}
