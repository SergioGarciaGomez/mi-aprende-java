/**
 * Recibe la nota del primer examen y la nota deseada en el trimestre y 
 * calcula la nota necesaria en el siguiente examen
 * Ejercicio 11 Tema 3
 * @author Sergio García
 */
public class Ejercicio12 { // Clase principal
  public static void main(String[] args) {
    String linea;
    /* Recoge la nota del primer examen la cual es de un 40% en la nota final */
    System.out.print("Introduce la nota del primer examen: ");
    linea = System.console().readLine();
    double nota1 = Double.parseDouble(linea);
    /* Recoge la nota que se quiere conseguir en el trimestre */
    System.out.print("Introduce la nota deseada en el trimestre: ");
    linea = System.console().readLine();
    double notaDeseada = Double.parseDouble(linea);
    /* Calcula la nota necesaria en el segundo examen el cual vale un 60% en la nota final */
    double notaNecesaria = ((notaDeseada - (0.4 * nota1)) / 0.6);
    System.out.printf("Para sacar un %.2f necesitas sacar un %.2f en el segundo examen", notaDeseada, notaNecesaria);
  }
}