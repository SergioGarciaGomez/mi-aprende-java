package tema08;

/**
 * Ejercicio 39 Tema 8
 * 
 * Crea una función con la siguiente cabecera: public String
 * convierteEnPalabras(int n) Esta función convierte los dígitos del número n en
 * las correspondientes palabras y lo devuelve todo en una cadena de caracteres.
 * Por ejemplo, el 470213 convertido a palabras sería: cuatro, siete, cero, dos,
 * uno, tres
 * 
 * @author Sergio García
 */
public class Ejercicio39 {

  public static void main(String[] args) {
    int[] numeros = { 470213, 0000, 101, 99991, 86 };
    
    for (int numero : numeros) {
      System.out.println(numero);
      System.out.println(funciones.Funciones.convierteNumerosEnPalabras(numero) + "\n");
    }
  }
}
