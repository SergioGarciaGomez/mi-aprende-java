/**
 * Ejercicio 17 Tema 5
 * Se introduce un número entero positivo, y se suman los 
 * 100 siguientes a ese número. 
 * Se debe comprobar que los datos son correctos.
 * @author Sergio García
 */
public class Ejercicio17 { // Clase principal
  public static void main(String[] args) {
    int numeroIntroducido = 0;
    int suma = 0;
    do {
      System.out.print("Introduce un número entero y positivo: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido < 0 ) {
        System.out.println("Error. Debe introducir un número positivo.");
      }
    } while (numeroIntroducido < 0);
    
    for (int i = numeroIntroducido; i < numeroIntroducido + 100; i++) {
      suma += i;
    }
    System.out.println("La suma de los 100 números siguientes a " + numeroIntroducido + " es " + suma);
  }
}
