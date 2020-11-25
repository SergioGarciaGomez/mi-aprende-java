/**
 * Fecha: 25/11/2020
 * Grupo: 1º DAM
 * Examen 1 || Modelo B
 * Ejercicio 3
 * Realiza un programa que pida un número entero y 
 * que posteriormente calcule la suma de todos sus dígitos.
 * @author Sergio García Gómez
 */
public class Ex08sgg3 { // Clase principal
  public static void main(String[] args) {
    
    System.out.print("Introduzca un número: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    int digito = 0;
    int suma = 0;
    long numeroIntroducidoCopia = numeroIntroducido;
    
    while (numeroIntroducido > 0) {
      digito = (int)numeroIntroducido % 10;
      numeroIntroducido /= 10;
      suma += digito;
    }
    
    System.out.print("La suma de cada dígito de " + numeroIntroducidoCopia + " es " + suma + ".");
    
  }
}