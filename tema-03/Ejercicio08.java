/**
 * Calcula el salario semanal de un empleado a 12 euros la hora
 * Ejercicio 8 Tema 3
 * @author Sergio García
 */
public class Ejercicio08 { // Clase principal
  public static void main(String[] args) {
    int eurosHora = 12;
    String linea;
    /* Recoge las horas trabajadas */
    System.out.print("Introduce las horas trabajadas esta semana: ");
    linea = System.console().readLine();
    double horasTrabajadas = Double.parseDouble(linea);
    /* Calcula el total de la factura y la muestra por pantalla */
    double sueldo = (eurosHora * horasTrabajadas);
    System.out.printf("Tu sueldo semanal es de: %.2f euros", sueldo);
  }
}
