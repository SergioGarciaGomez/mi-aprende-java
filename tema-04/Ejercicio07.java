/**
 * Ejercicio 7 Tema 4
 * Calcula la media de 3 notas
 * @author Sergio García
 */
public class Ejercicio07 { // Clase principal
  public static void main(String[] args) {
    /* Recibe las respectivas notas */
    System.out.print("Introduzca la nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la nota del segundo examen: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la nota del tercer examen: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    /* Calcula la media de las 3 notas */
    
    if ((nota1 < 0)  || (nota1 > 10) || (nota2 < 0) || (nota2 > 10) || (nota3 < 0) || (nota3 > 10)) { 
      System.out.println("Una nota debe ser entre 0-10");
    } else {
      double media = (nota1 + nota2 + nota3) / 3;
      System.out.printf("La media de las notas %.2f, %.2f y %.2f, es = %.2f ", nota1, nota2, nota3, media);
    }
  }
}
