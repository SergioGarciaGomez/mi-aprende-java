/**
 * Ejercicio 14 Tema 6
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
 * programa intentará adivinar el número que estás pensando - un número entre 0
 * y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
 * debe preguntar si el número que estás pensando es mayor o menor que el que
 * te acaba de decir.
 * @author Sergio García
 */
public class Ejercicio14 { // Clase principal
  public static void main(String[] args) {
    
    int oportunidades = 5, nPrograma = 0, minimo = 0, maximo = 100;
    boolean acertado = false;
    String respuesta = "", mayorMenor = "";
    
    System.out.println("Piensa un número del 0 al 100 e intentaré adivinarlo con 5 intentos.");
    System.out.println("Pulsa la tecla INTRO para continuar");
    System.console().readLine();
    
    do {
      nPrograma = (int)(Math.random() * (maximo - minimo) + minimo);
      System.out.println("¿Es el " + nPrograma + "?");
      System.out.print("si/no: ");
      respuesta = System.console().readLine();
      oportunidades--;
      
      if (respuesta.equals("si")) {
        acertado = true;
        System.out.print("¡Bien, he acertado tu número!");
        System.exit(0);
      } else if (respuesta.equals("no")) {
        acertado = false;
        System.out.println("¿Tu número es mayor o menor?");
        System.out.print("(mayor/menor): ");
        mayorMenor = System.console().readLine();
      } else { 
        oportunidades ++;
        System.out.print("Introduce una respuesta válida.");
      }
      
      if (mayorMenor.equals("mayor")) {
        minimo = nPrograma + 1;
      } else if (mayorMenor.equals("menor")) {
        maximo = nPrograma - 1;
      } else {
        System.out.print("Introduce una respuesta válida.");
        oportunidades++;
      }
    } while (oportunidades > 0);
    
    if (!acertado) {
      System.out.print("Que pena, no he conseguido acertar tu número.");
    }
  }
}