/**
 * Ejercicio 8 Tema 4
 * Calcula la media de 3 notas y te dice insuficiente, suficiente, bien, notable o sobresaliente
 * @author Sergio García
 */
public class Ejercicio08 { // Clase principal
  public static void main(String[] args) {
    /* Recibe las respectivas notas */
    System.out.print("Introduzca la nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la nota del segundo examen: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la nota del tercer examen: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    /* Calcula la media de las 3 notas */
    
    if ((nota1 < 0) || (nota1 > 10) || (nota2 < 0) || (nota2 > 10) || (nota3 < 0) || (nota3 > 10)) { 
      System.out.println("Las notas deben de ser entre 0-10");
      System.exit(0);
    } else {
      double media = (nota1 + nota2 + nota3) / 3;
      System.out.printf("La media de las notas %.2f, %.2f y %.2f es = %.2f \n", nota1, nota2, nota3, media);
    }
    
    double media = (nota1 + nota2 + nota3) / 3;
    
    if ((media >= 0) && (media < 5 )) {
      System.out.printf("Como tu media es %.2f tienes un insuficiente, estudia más para la próxima vez.", media);
    } else if ((media >= 5) && (media < 6 )) {
      System.out.printf("Como tu media es %.2f tienes un suficiente, deberías estudiar más.", media);
    } else if ((media >= 6) && (media < 7 )) {
      System.out.printf("Como tu media es %.2f tienes un bien, no te confíes.", media);
    } else if ((media >= 7) && (media < 9 )) {
      System.out.printf("Como tu media es %.2f tienes un notable, ¡sigue así!.", media);
    } else if ((media >= 8) && (media < 10 )) {
      System.out.printf("Como tu media es %.2f tienes un sobresaliente, ¡trimestre casi perfecto!.", media);
    } else if (media == 10 ) {
      System.out.printf("Como tu media es %.2f tienes un sobresaliente, ¡trimestre perfecto, sigue así!.", media);
    }   
  }
}