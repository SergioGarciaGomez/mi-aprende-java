/**
 * Ejercicio 19 Tema 6
 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
 * el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 * 
 * @author Sergio García
 */
public class Ejercicio19 { // Clase principal
  public static void main(String[] args) {
    
    int n = 0;
    int maximoPar = -100;
    int minimoImpar = 200;
    int suma = 0;
    
    for (int i = 0; i < 50; i++) {
      n = (int)((Math.random() * 301) - 100);
      System.out.print(n + " ");
      suma += n;
      
      if (n % 2 == 0) {
        if (n > maximoPar) {
          maximoPar = n;
        }
      } else {
        if (n < minimoImpar) {
          minimoImpar = n;
        }
      }
    }
    
    System.out.println("\nEl máximo de los pares es: " + maximoPar);
    System.out.println("El mínimo de los impares es: " + minimoImpar);
    System.out.println("La media de todos los números es: " + (suma / 50));
  }
}