/**
 * Ejercicio 10 Tema 6
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
 * El carácter con el que se pinta cada línea se elige de forma aleatoria entre
 * uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
 * aleatoria entre 1 y 40 caracteres.
 * @author Sergio García
 */
public class Ejercicio10 { // Clase principal
  public static void main(String[] args) {
    
    int lineas = 10;
    int longitudLinea;
    int caracter;
    String relleno = "";
    
    for (int i = 0; i < lineas; i++) {
      longitudLinea = (int)(Math.random() * 40) + 1;
      caracter = (int)(Math.random() * 6) + 1;
      System.out.printf("%2d caracteres ", longitudLinea);
      
      switch (caracter) {
        case 1:
          relleno = "*";
          break;
        case 2:
          relleno = "-";
          break;
        case 3:
          relleno = ".";
          break;
        case 4:
          relleno = "=";
          break;
        case 5:
          relleno = "|";
          break;
        case 6:
          relleno = "@";
          break;
        default:
      } // fin switch caracter
      
      for (int h = 0; h < longitudLinea; h++) {
        System.out.print(relleno);
      }
      
      System.out.println();
    }
  }
}