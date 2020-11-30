/**
 * Ejercicio 6 Tema 6
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
 * adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido, el
 * programa dirá cuántas oportunidades quedan y si el número introducido es menor o
 * mayor que el que ha pensado.
 * @author Sergio García
 */
public class Ejercicio06 { // Clase principal
  public static void main(String[] args) {
    
    int oportunidades = 5;
    int numeroIntroducido = 0;
    boolean acierto = false;
    int numeroX = (int)(Math.random() * 101);
    
    System.out.print("He pensado un número del 0 al 100, intenta adivinarlo. Tienes 5 oportunidades para ello.");
    
    do {
      System.out.print("Introduce el número que piensas: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      oportunidades--;
      
      if (numeroIntroducido == numeroX) {
        acierto = true;
        System.out.print("¡Enhorabuena, has acertado!\nEl número que pensaba era " + numeroX);
      }
      
      if (numeroIntroducido < numeroX) {
        System.out.println("El número que he pensado es más grande que " + numeroIntroducido);
        System.out.println("Te quedan "+ oportunidades + " oportunidades");
      }
        
      if (numeroIntroducido > numeroX) {
        System.out.println("El número que he pensado es más pequeño que " + numeroIntroducido);
        System.out.println("Te quedan " + oportunidades + " oportunidades");
      }
    } while (!acierto && oportunidades > 0);
    
    if (!acierto) {
      System.out.println("Lo siento, no has acertado. El número que he pensado era " + numeroX + ".");
    }
  }
}