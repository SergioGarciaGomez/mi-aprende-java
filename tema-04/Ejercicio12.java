/**
 * Ejercicio 12 Tema 4
 * Cuestionario tipo test
 * @author Sergio García
 */
public class Ejercicio12 { // Clase principal
  public static void main(String[] args) {
    int puntos = 0;
    String respuesta;
    System.out.print("CUESTIONARIO (responder con a, b, c)\n");
    /* Realiza preguntas */
    System.out.print("1.¿Cuál es el lenguaje de programación más usado en 2020?\n");
    System.out.println("\na) C \nb) Java \nc) Python");
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) { 
      puntos = puntos + 2;
      System.out.print("Correcto");
    } else {
      puntos = puntos -1;
      System.out.print("Incorrecto");
    }
    System.out.print(". Tus puntos actuales son " + puntos + "\n\n");
    
    System.out.print("2.¿Java es un lenguaje interpretado o compilado?\n");
    System.out.println("\na) Interpretado \nb) Compilado \nc) Ambos");
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) { 
      puntos = puntos + 2;
      System.out.print("Correcto");
    } else {
      puntos = puntos -1;
      System.out.print("Incorrecto");
    }
    System.out.print(". Tus puntos actuales son " + puntos + "\n\n");
    
    System.out.print("3.¿Que lenguaje se usa para realizar consultas en bases de datos?\n");
    System.out.println("\na) SQL \nb) PHP \nc) C#");
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) { 
      puntos = puntos + 2;
      System.out.print("Correcto");
    } else {
      puntos = puntos -1;
      System.out.print("Incorrecto");
    }
    System.out.print(". Tus puntos actuales son " + puntos + "\n\n");
    
    System.out.print("4.¿Qué etiqueta se usa para resaltar texto en HTML?\n");
    System.out.println("\na) <b> \nb) <strong> \nc) ambos");
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) { 
      puntos = puntos + 2;
      System.out.print("Correcto");
    } else {
      puntos = puntos -1;
      System.out.print("Incorrecto");
    }
    System.out.print(". Tus puntos actuales son " + puntos + "\n\n");
    
    System.out.print("5.¿En Java, para qué sirve System.out.print?\n");
    System.out.println("\na) Salir del sistema \nb) Declarar una variable \nc) Imprimir caracteres por pantalla");
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) { 
      puntos = puntos + 2;
      System.out.print("Correcto");
    } else {
      puntos = puntos -1;
      System.out.print("Incorrecto");
    }
    System.out.print(". Has obtenido " + puntos + " puntos en total.");
    
    if (puntos == 10) {
      System.out.print(" Perfecto!");
    } else if (puntos < 0) {
      System.out.print(" No lo has podido hacer peor, ni un 0 eres capaz de sacar");
    } else if (puntos > 4) {
      System.out.print(" Has aprobado el cuestionario!");
    } else {
      System.out.print(" Estás suspenso");
    }
  }
}