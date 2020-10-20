/**
	* Ejercicio 4 Tema 2
	* Conversor de euros a pesetas
	* @author Sergio García
	*/
	
public class Ejercicio4_2 { // Clase principal
	public static void main(String[] args) {
		float euros = 5;
		int pesetas = (int)(euros*166.9);
		System.out.printf("%f euros son %d pesetas.", euros, pesetas);
	}
}