package tema08;

/**
 * Ejercicio 16 Tema 8
 * Muestra todos los números capicúas desde el 1 hasta el 99999
 * @author Sergio García
 */
public class Ejercicio16 {

  public static void main(String[] args) {
    
    for (int i = 1; i < 100000; i++) {
      if (funciones.Funciones.esCapicua(i)) {
        System.out.print(i + "  ");
      }
    }
  }
}