package tema08;

/**
 * Ejercicio 35 Tema 8
 * 
 * Crea una función con la siguiente cabecera: public static String
 * convierteEnPalotes(int n) Esta función convierte el número n al sistema de
 * palotes y lo devuelve en una cadena de caracteres. Por ejemplo, el 470213 en
 * decimal es el | | | | - | | | | | | | - - | | - | - | | | en el sistema de
 * palotes. Utiliza esta función en un programa para comprobar que funciona
 * bien. Desde la función no se debe mostrar nada por pantalla, solo se debe
 * usar print desde el programa principal.
 * 
 * @author Sergio García
 */
public class Ejercicio35 {

  public static void main(String[] args) {
    int[] numeros = { 470213, 24, 12, 27, 0, 29123 };
    for (int numero : numeros) {
      System.out.print("El " + numero + " es el " + funciones.Funciones.convierteEnPalotes(numero));
      System.out.println(" en el sistema de palotes.");
    }
  }
}
