package tema08;

/**
 * Ejercicio 39 Tema 8
 * 
 * Crea una funci�n con la siguiente cabecera: public String
 * convierteEnPalabras(int n) Esta funci�n convierte los d�gitos del n�mero n en
 * las correspondientes palabras y lo devuelve todo en una cadena de caracteres.
 * Por ejemplo, el 470213 convertido a palabras ser�a: cuatro, siete, cero, dos,
 * uno, tres
 * 
 * @author Sergio Garc�a
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
