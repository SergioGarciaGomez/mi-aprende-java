/**
 * Ejercicio 24 Tema 4
 * Genera nómina de un trabajador dependiendo del cargo, estado civil y
 * los días que ha estado de viaje visitando clientes durante el mes.
 * Por cada día de viaje 30 euros extra en concepto de dietas.
 * Según el cargo (1, 2, 3) se pagan 950, 1200, 1600.
 * Al salario bruto hay que restarle el IRPF que será de un 20% en casados y 25% en solteros.
 * @author Sergio García
 */
public class Ejercicio24 { // Clase principal
  public static void main(String[] args) {
    System.out.println("1 - Programador Junior");
    System.out.println("2 - Programador Senior");
    System.out.println("3 - Jefe de Proyecto");
    System.out.print("Introduzca el puesto de trabajo del empleado (1-3): ");
    int puestoTrabajo = Integer.parseInt(System.console().readLine());
    double salario = 0;
    
    switch(puestoTrabajo) {
      case 1:
        salario = 950;
        break;
      case 2:
        salario = 1200;
        break;
      case 3: 
        salario = 1600;
        break;
      default:
        System.out.print("Ese puesto de trabajo es incorrecto");
        System.exit(0);
    }
    
    System.out.print("Introduzca los días que ha estado de viaje visitando clientes: ");
    int diasVisitandoClientes = Integer.parseInt(System.console().readLine());
    
    if ((diasVisitandoClientes < 0) || (diasVisitandoClientes > 31)) {
      System.out.print("Esos días son incorrectos.");
      System.exit(0);
    }
    
    double extraPorViajes = diasVisitandoClientes * 30;
    
    System.out.print("Introduzca su estado civil (1 - soltero, 2 - casado): ");
    int estadoCivil = Integer.parseInt(System.console().readLine());
    int irpf = 0;
    
    switch(estadoCivil) {
      case 1:
       irpf = 25;
       break;
      case 2:
        irpf = 20;
        break;
      default:
        System.out.print("Ese estado civil es incorrecto.");
        System.exit(0);
    }
    
    double salarioBruto = salario + extraPorViajes;
    double retencionIRPF = salarioBruto * irpf / 100;
    double salarioNeto = salarioBruto - retencionIRPF;
    
    System.out.println("--------------------------------");
    System.out.printf("| Salario              %7.2f |\n", salario);
    System.out.printf("| Dietas (%2d viajes)   %7.2f |\n", diasVisitandoClientes, extraPorViajes);
    System.out.println("--------------------------------");
    System.out.printf("| Salario bruto        %7.2f |\n", salarioBruto);
    System.out.printf("| Retención IRPF (%d%%) %7.2f |\n", irpf, retencionIRPF);
    System.out.println("--------------------------------");
    System.out.printf("| Salario neto         %7.2f |\n", salarioNeto);
    System.out.println("--------------------------------");
  }
}