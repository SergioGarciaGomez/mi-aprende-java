/**
 * Ejercicio 11 Tema 5
 * Muestra en 3 columnas, el número, su cuadrado y su cubo
 * Se hace la cuenta con el número introducido y con sus 4 números consecutivos
 * @author Sergio García
 */
public class Ejercicio11 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduzca un número: ");
    int nIntroducido = Integer.parseInt(System.console().readLine());
    
    for (int i = nIntroducido; i < nIntroducido + 5; i++) {
      System.out.printf("| Número -> %6d | Cuadrado -> %8d | Cubo -> %1d|\n", i, i * i, i * i * i); 
    }
  }
}
