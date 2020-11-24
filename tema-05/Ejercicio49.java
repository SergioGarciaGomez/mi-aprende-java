/**
 * Ejercicio 49 Tema 5
 * Realiza un programa que calcule el máximo, el mínimo y la media de una serie
 * de números enteros positivos introducidos por teclado. El programa terminará
 * cuando el usuario introduzca un número primo. Este último número no se
 * tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
 * números ha introducido el usuario (sin contar el primo que sirve para salir).
 * @author Sergio García
 */
public class Ejercicio49 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Introduzca numeros positivos.");
    System.out.println("Para terminar el programa inserte un numero primo.");
    int numero;
    int suma = 0;
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;
    boolean esPrimo;
    int totalNumeros = 0;
    
    do {
      numero = Integer.parseInt(System.console().readLine());
      esPrimo = true;
      for (int i = 2; i < numero; i++) {
        if ((numero % i) == 0) {
          esPrimo = false;
        }
      }
      if (!esPrimo) {
        suma += numero;
        totalNumeros++;
        maximo = numero > maximo ? numero : maximo;
        minimo = numero < minimo ? numero : minimo;
      } 
    } while (!esPrimo);
      
    System.out.println("Ha introducido " + totalNumeros + " números no primos.");
    System.out.println("Máximo: " + maximo);
    System.out.println("Mínimo: " + minimo);
    System.out.println("Media: " + (suma / totalNumeros));
  }
}