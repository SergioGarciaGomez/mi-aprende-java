/**
 * Fecha: 25/11/2020
 * Grupo: 1º DAM
 * Examen 1 || Modelo B
 * Ejercicio 1
 * Realiza un programa que pinte una pirámide hueca 
 * con un contorno de doble grosor. Se pide al usuario 
 * la altura y se debe comprobar que sea un número mayor o igual que 4.
 * @author Sergio García Gómez
 */
public class Ex08sgg1 { // Clase principal
  public static void main(String[] args) {
    
    int alturaIntroducida = 0;
    
    while (alturaIntroducida < 4) {
      System.out.print("Por favor, introduzca la altura de la pirámide: ");
      alturaIntroducida = Integer.parseInt(System.console().readLine());
      if (alturaIntroducida < 4) {
        System.out.println("Error. La altura debe ser un número mayor o igual a 4.");
      }
    }
    
    int espaciosVertice = alturaIntroducida;
    int espaciosVariables = alturaIntroducida -1 ;
    int altura = 4;
    int espaciado = altura;
    
    // Vértice
    for (int i = 1; i < espaciosVertice; i++) {
      System.out.print(" ");
    }
    System.out.println("*");
    
    // Parte variable
    while (altura <= alturaIntroducida) {
      for (int i = 1; i < espaciosVariables; i++) {
        System.out.print(" ");
      }
      
      System.out.print("**");
      System.out.println();
      altura++;
      espaciosVariables--;
    }
    
    // Parte inferior
    System.out.print(" ");
    for (int i = 0; i < 2; i++) {
      for (int h = 1; h <= alturaIntroducida * 2; h++) {
      System.out.print("*");
      }
      System.out.println(""); 
    }
  }
}