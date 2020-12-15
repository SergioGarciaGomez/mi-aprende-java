/**
 * Ejercicio 20 Tema 6
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 * @author Sergio García
 */
public class Ejercicio20 { // Clase principal
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la capacidad de la cuba en litros (enteros): ");
    int capacidad = Integer.parseInt(System.console().readLine());
    
    int litros = (int)(Math.random() * (capacidad + 1));
    
    for (int i = 0; i < capacidad; i++) {
      if ( i < (capacidad - litros)) {
        System.out.println("#    #");
      } else {
        System.out.println("#====#");
      }
    }
    
    System.out.println("######");
    System.out.print("La cuba tiene una capacidad de " + capacidad);
    System.out.print(" litros y contiene " + litros + " litros de agua.");
  }
}
