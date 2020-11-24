/**
 * Ejercicio 1 Examen 1
 * Mostrar HOLA en mayúsculas hecho con *. Altura del HOLA se le pide al usuario.
 * Debe ser un número impar mayor o igual a 3. Los palos de H y A están a la mitad de la altura.
 * @author Sergio García
 */
public class ej1examen { // Clase principal
  public static void main(String[] args) {
    int altura = 0;
    int espacios = 1;
    while ((altura < 3) || (altura % 2) == 0) {
      System.out.print("Por favor, introduzca la altura: ");
      altura = Integer.parseInt(System.console().readLine());
      if ((altura < 3) || (altura % 2) == 0) {
        System.out.println("Datos incorrectos. La altura debe ser un número impar mayor o igual a 3.");
      }
    }
    
    // Parte superior 
    System.out.print("*    *");
    for (int i = 0; i < 1; i++) {
      System.out.print("  ");
    }
    System.out.print(" **** ");
    for (int i = 0; i < 1; i++) {
      System.out.print("  ");
    }
    System.out.print("*     ");
    for (int i = 0; i < 1; i++) {
      System.out.print("  ");
    }
    System.out.println(" **** ");
    
    // Filas variables hacia arriba
    
    for (int fila = 0; fila < ((altura - 3) / 2); fila++) {
      System.out.print("*    *");
      for (int i = 0; i < 1; i++) {
        System.out.print("  ");
      }
      System.out.print("*    *");
      for (int i = 0; i < 1; i++) {
        System.out.print("  ");
      }
      System.out.print("*     ");
      for (int i = 0; i < 1; i++) {
      System.out.print("  ");
      }
      System.out.println("*    *");
    }
    
    // Parte media que no varia
    
    System.out.print("******");
    for (int i = 0; i < 1; i++) {
      System.out.print("  ");
    }
    System.out.print("*    *");
    for (int i = 0; i < 1; i++) {
      System.out.print("  ");
    }
    System.out.print("*     ");
    for (int i = 0; i < 1; i++) {
      System.out.print("  ");
    }
    System.out.println("******");
    
    // Filas variables hacia abajo
    
    for (int fila = 0; fila < ((altura - 3) / 2); fila++) {
      System.out.print("*    *");
      for (int i = 0; i < 1; i++) {
        System.out.print("  ");
      }
      System.out.print("*    *");
      for (int i = 0; i < 1; i++) {
        System.out.print("  ");
      }
      System.out.print("*     ");
      for (int i = 0; i < 1; i++) {
      System.out.print("  ");
      }
      System.out.println("*    *");
    }
    
    // Parte baja
    
    System.out.print("*    *");
    for (int i = 0; i < 1; i++) {
      System.out.print("  ");
    }
    System.out.print(" **** ");
    for (int i = 0; i < 1; i++) {
      System.out.print("  ");
    }
    System.out.print("******");
    for (int i = 0; i < 1; i++) {
      System.out.print("  ");
    }
    System.out.println("*    *");
  }
}
