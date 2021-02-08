package tema08;

import java.util.Scanner;

public class Prueba01_14 {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int n;

    System.out.print("Introduzca un n�mero entero positivo: ");
    n = Integer.parseInt(s.nextLine());

    if (funciones.Funciones.esPrimo(n)) {
      System.out.println("El n�mero " + n + " es primo");
    } else {
      System.out.println("El n�mero " + n + " no es primo");
    }

    System.out.println("El siguiente primo a " + n + " es: " + funciones.Funciones.siguientePrimo(n));

    if (funciones.Funciones.esCapicua(n)) {
      System.out.println("El n�mero " + n + " es capic�a");
    } else {
      System.out.println("El n�mero " + n + " no es capic�a");
    }

    System.out.println("5^3 es " + funciones.Funciones.potencia(5, 3));
    System.out.println("En el n�mero 66566 hay " + funciones.Funciones.digitos(66566) + " d�gitos");
    System.out.println("En la posici�n 2 del 57964134 est� el " + funciones.Funciones.digitoNumero(57964134, 1));
    System.out.println("En la posici�n 2 del -57964134 est� el " + funciones.Funciones.digitoNumero(-57964134, 1));
    System.out.println("En 532312 el 2 est� en la posici�n " + funciones.Funciones.posicionDigito(533312, 2));
    System.out.println("En 6912 con 10 delante es " + funciones.Funciones.pegaPorDelante(6912, 10));
    System.out.println("En 6912 con 10 detr�s es " + funciones.Funciones.pegaPorDetras(6912, 10));
    System.out.println(
        "En 95123 los n�meros desde la 2� posici�n a la 4� son: " + funciones.Funciones.trozoDeNumero(95123, 1, 3));
    System.out.println("El 992 unido a 812 es: " + funciones.Funciones.juntaNumeros(992, 812));
    System.out.println("El 992 con 1 digito menos por la izquierda es: " + funciones.Funciones.quitaPorDelante(992, 1));
    System.out.println("El 992 con 1 digito menos por la derecha es: " + funciones.Funciones.quitaPorDetras(992, 1));
    System.out.println("El 9456 dado la vuelta es: " + funciones.Funciones.voltea(9456));
  }
}