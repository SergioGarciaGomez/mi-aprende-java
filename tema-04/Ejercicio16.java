/**
 * Ejercicio 16 Tema 4
 * Realiza un test para ver si tu pareja puede que te sea infiel. Cada respuesta verdadera suma +3
 * @author Sergio García
 */
public class Ejercicio16 { // Clase principal
  public static void main(String[] args) {
    String respuesta;
    int puntos = 0;
    System.out.println("Este programa te dirá si hay probabilidad de que tu pareja está siendo infiel.\n");
    System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.\n(v = verdadero y f = falso): ");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    
    System.out.print("2. Ha aumentado sus gastos de vestuario.\n(v = verdadero y f = falso): ");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    
    System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti.\n(v = verdadero y f = falso): ");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }

    System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).\n(v = verdadero y f = falso): ");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    
    System.out.print("5. No te deja que mires la agenda de su teléfono móvil.\n(v = verdadero y f = falso): ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
      }

    System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.\n(v = verdadero y f = falso): ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }

    System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.\n(v = verdadero y f = falso): ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    
    }
    
    System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.\n(v = verdadero y f = falso): ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("9. Has notado que últimamente se perfuma más.\n(v = verdadero y f = falso): ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.\n(v = verdadero y f = falso): ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    } //FIN TEST
    System.out.printf("Tus puntos son %d. ", puntos);
     
    if ( puntos <= 10 ) {
    System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    }
    
    if ( (puntos > 11 ) && (puntos <= 22) ) {
    System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    }
    
    if ( puntos >= 22 ) {
    System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
    }
  }
}