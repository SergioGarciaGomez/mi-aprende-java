/**
 * Ejercicio 4 Examen 1
 * Codificar cadena de caracteres.
 * El 0 se cambia por la letra O, el 1 por la I, el 2 por la Z, 
 * el 3 por la B, el 4 por la A, el 5 por la S, el 6 por la G, 
 * el 7 por la L, el 8 por la H y el 9 por la N. 
 * @author Sergio García
 */
public class Ex08sgg4 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduzca un número de la longitud que quiera: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    int digito = 0;
    String numeroCodificado = "";
    
    while (numeroIntroducido > 0) {
      digito = numeroIntroducido % 10;
      numeroIntroducido /= 10;
      
      switch (digito) {
        case 0:
          numeroCodificado = "O" + numeroCodificado;
          break;
        case 1:
          numeroCodificado = "I" + numeroCodificado;
          break;
        case 2:
          numeroCodificado = "Z" + numeroCodificado;
          break;
        case 3:
          numeroCodificado = "B" + numeroCodificado;
          break;
        case 4:
          numeroCodificado = "A" + numeroCodificado;
          break;
        case 5:
          numeroCodificado = "S" + numeroCodificado;
          break;
        case 6:
          numeroCodificado = "G" + numeroCodificado;
          break;
        case 7:
          numeroCodificado = "L" + numeroCodificado;
          break;
        case 8:
          numeroCodificado = "H" + numeroCodificado;
          break;
        case 9:
          numeroCodificado = "N" + numeroCodificado;
          break;
        default:
      }
    }
    
    System.out.println("El número codificado es " + numeroCodificado + ".");
  }
}
