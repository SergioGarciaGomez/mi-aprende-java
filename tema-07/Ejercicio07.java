/**
 * Ejercicio 7 Tema 7
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por
 * pantalla separados por espacios. El programa pedirá entonces por teclado dos valores y a
 * continuación cambiará todas las ocurrencias del primer valor por el segundo en la lista
 * generada anteriormente. Los números que se han cambiado deben aparecer entrecomillados.
 * @author Sergio García
 */
public class Ejercicio07 { // Clase principal
  public static void main(String[] args) {
    int[] numero = new int[100];
    int i;
    
    for (i = 0; i < 100; i++) {
      numero[i] = (int)(Math.random() * 21);
      System.out.print(numero[i] + " ");
    }
    
    System.out.print("\nIntroduzca uno de los números que hay: ");
    int respuesta = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el valor por el que quiere sustituir ese número: ");
    int respuesta2 = Integer.parseInt(System.console().readLine());
    
    System.out.println();
    
    for (i = 0; i < 100; i++) {
      if (numero[i] == respuesta) {
        numero[i] = respuesta2;
        System.out.print("\"" + numero[i] + "\" ");
      } else {
        System.out.print(numero[i] + " ");
      }
    }
    
    System.out.println();
    
  }
}
