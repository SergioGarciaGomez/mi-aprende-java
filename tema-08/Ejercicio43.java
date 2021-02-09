package tema08;

import java.util.Scanner;

public class Ejercicio43 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(s.nextLine());
    
    for (int i = 0; i < altura; i++) {
      System.out.print(funciones.Funciones.linea(' ', i));
      System.out.println(funciones.Funciones.linea('*', altura - i));
    }
  }
}
