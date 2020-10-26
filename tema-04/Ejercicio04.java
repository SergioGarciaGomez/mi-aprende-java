/**
 * Ejercicio 4 Tema 4
 * Salario semanal con horas extras
 * @author Sergio García
 */
public class Ejercicio04 { // Clase principal
  public static void main(String[] args) {
    final int eurosHora = 12;
    final int eurosHorasExtra = 16;
    int sueldoTotal;
    int horasExtra;
    /* Recoge las horas trabajadas */
    System.out.print("Introduce las horas trabajadas: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    /* Calcula el sueldo total, mirando antes si hay horas extras o no */
    
    if (horasTrabajadas <= 40) {
      sueldoTotal = horasTrabajadas * eurosHora;
      System.out.printf("El sueldo para %d horas de trabajo es de %d euros", horasTrabajadas, sueldoTotal);
    }
    else if (horasTrabajadas > 40) {
      horasExtra = horasTrabajadas - 40;
      sueldoTotal = (40 * eurosHora) + (horasExtra * eurosHorasExtra);
      System.out.printf("El sueldo para %d horas de trabajo es de %d euros", horasTrabajadas, sueldoTotal);
    }
  }
}