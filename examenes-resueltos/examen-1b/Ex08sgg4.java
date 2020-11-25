/**
 * Fecha: 25/11/2020
 * Grupo: 1º DAM
 * Examen 1 || Modelo B
 * Ejercicio 4
 * Según un estudio de la prestigiosa Universidad de Chiquitistán, los
 * girasoles que mejor captan la energía del Sol, a los que llaman grandes
 * captadores son aquéllos cuya longitud de tallo en micras sigue las
 * siguientes pautas:
 *  -Contiene más de un ocho.
 *  -Contiene menos de tres sietes.
 * @author Sergio García Gómez
 */
public class Ex08sgg4 { // Clase principal
  public static void main(String[] args) {
    
    System.out.print("Introduzca la longitud del tallo del girasol en milímetros: ");
    long longitudIntroducida = Long.parseLong(System.console().readLine());
    int numeroDeOchos = 0;
    int numeroDeSietes = 0;
    boolean captador;
    
    while (longitudIntroducida > 0) {
      int digito = (int)longitudIntroducida % 10;
      
      switch (digito) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 9:
          break;
        case 7:
          numeroDeSietes++;
          break;
        case 8:
          numeroDeOchos++;
          break;
      } // fin switch digito
      
      longitudIntroducida /= 10;
    } // fin while
    
    if ((numeroDeOchos > 1) && (numeroDeSietes < 3)) {
      captador = true;
      System.out.print("Este girasol es un gran captador.");      
    } else {
      captador = false;
      System.out.print("Este girasol no un gran captador.");
    }
  }
}