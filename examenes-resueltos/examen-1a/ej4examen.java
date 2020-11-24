/**
 * Ejercicio 4 Examen 1
 * Codificar cadena de caracteres.
 * El 0 se cambia por la letra O, el 1 por la I, el 2 por la Z, 
 * el 3 por la B, el 4 por la A, el 5 por la S, el 6 por la G, 
 * el 7 por la L, el 8 por la H y el 9 por la N. 
 * @author Sergio García
 */
public class ej4examen { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduzca un número: ");
    // long se puede usar para unir una cadena de números y pasarlos a String
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    
    // Le da la vuelta al número introducido
    long numero = numeroIntroducido;
    long volteado = 0;
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while
    
    do {
      long digito = volteado % 10;
      volteado = volteado / 10;
      
      switch ((int)digito) {
        case 0:
          System.out.print("O");
          break;
        case 1:
          System.out.print("I");
          break;
        case 2:
          System.out.print("Z");
          break;
        case 3:
          System.out.print("B");
          break;
        case 4:
          System.out.print("A");
          break;
        case 5:
          System.out.print("S");
          break;
        case 6:
          System.out.print("G");
          break;
        case 7:
          System.out.print("L");
          break;
        case 8:
          System.out.print("H");
          break;
        case 9:
          System.out.print("N");
          break;
        default:
      }
    } while (volteado > 0);
    System.out.println();
  }
}
