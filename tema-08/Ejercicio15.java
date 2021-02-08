package tema08;

/**
 * Ejercicio 15 Tema 8
 * Muestra todos los primos desde el 1 hasta el 1000
 * @author Sergio García
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    
    for (int i = 1; i < 1001; i++) {
      if (funciones.Funciones.esPrimo(i)) {
        System.out.print(i + "  ");
      }
    }
  }
}
