/**
 * Ejercicio 21 Tema 4
 * Calcula la nota trimestral, hay 2 exámenes. Si la media es > o = a 5 está aprobado.
 * Si no está aprobado, el alumno tiene que hacer una recuperación con apto o no apto.
 * Si es apto, está aprobado con un 5, si es un no apto se mantiene su media anterior.
 * @author Sergio García
 */
public class Ejercicio21 { // Clase principal
  public static void main(String[] args) { 
    System.out.print("Nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Nota del segundo examen: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    if ((nota1 > 10 || nota1 < 0) || (nota2 > 10 || nota2 < 0)){
      System.out.print("Esas notas no son correctas");
      System.exit(0);
    }
    
    double media = (nota1 + nota2) / 2;
    if (media < 5) {
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
      String recuperacion = System.console().readLine();
      if (recuperacion.equals("apto")) {
        media = 5;
      }
    }
    System.out.printf("Tu nota de Programación es %.2f", media );
  }
}