/**
 * Ejercicio 1 Tema 4
 * Pide un día de la semana y te dice la asignatura a primera hora
 * @author Sergio García
 */
public class Ejercicio01 { // Clase principal
  public static void main(String[] args) {
    String dia;
    /* Recoge el día de la semana */
    System.out.print("Introduce un día de la semana:");
    dia = System.console().readLine().toLowerCase();
    /* Busca asignatura según el día */
    switch (dia) {
      case "lunes":
        System.out.print("El lunes a primera hora hay Entornos de Desarrollo");
        break;
      case "martes":
        System.out.print("El martes a primera hora hay Programación");
        break;
      case "miércoles":
        System.out.print("El miércoles a primera hora hay Programación");
        break;
      case "jueves":
        System.out.print("El jueves a primera hora hay Programación");
        break;
      case "viernes":
        System.out.print("El viernes a primera hora hay Formación y Orientación Laboral");
        break;
      case "sabado":
        System.out.print("El sábado no hay clases");
        break;
      case "domingo":
        System.out.print("El domingo no hay clases");
        break;
      default:
        System.out.print("No existe ese día en la semana");
    }
  }
}