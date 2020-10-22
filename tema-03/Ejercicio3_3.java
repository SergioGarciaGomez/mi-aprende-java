/**
 * Ejercicio 3 Tema 3
 * Conversor de pesetas a euros
 * @author Sergio García
 */
	
public class Ejercicio3_3 { // Clase principal
	public static void main(String[] args) {
		String linea;
		/* Lee el número de pesetas para convertir a euros */
		System.out.print("Introduce el número de euros que quieres convertir a pesetas: ");
		linea = System.console().readLine();
		double euros = Double.parseDouble(linea);
		/* Convierte a pesetas */
    int pesetas = (int)(euros*166.9);
    System.out.printf("%.2f euros son %d pesetas.", euros, pesetas);
	}
}
