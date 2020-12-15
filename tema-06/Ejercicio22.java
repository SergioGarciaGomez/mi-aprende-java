/**
 * Ejercicio 22 Tema 6
 * Realiza un programa que pinte por pantalla una serpiente con un serpenteo
 * aleatorio. La cabeza se representará con el carácter @ y se debe colocar
 * exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
 * el cuerpo irá serpenteando de la siguiente manera: se generará de forma
 * aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 * coloque una posición a la izquierda del anterior, alineado con el anterior o una
 * posición a la derecha del anterior. La longitud de la serpiente se pedirá por
 * teclado y se supone que el usuario introducirá un dato correcto.
 * @author Sergio García
 */
public class Ejercicio22 { // Clase principal
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la longitud de la serpiente: ");
    int longitud = Integer.parseInt(System.console().readLine());
    
    System.out.println("            @");
    
    int i;
    int x = 13;
    
    while (longitud > 1) {
      
      // suma -1, 0 o 1 a la variable x para determinar si el próximo carácter va a la izquierda, en medio o a la derecha
      x += (int)(Math.random() * 3) - 1;
      
      // pinta x - 1 espacios
      for (i = 1; i < x; i++) {
        System.out.print(" ");
      }
      
      // pinta el cuerpo
      System.out.println("#");
      longitud--;
    }
  }
}
