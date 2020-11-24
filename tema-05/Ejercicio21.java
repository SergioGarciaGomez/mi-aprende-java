/**
 * Ejercicio 21 Tema 5
 * Se van introduciendo números hasta que se introduzca uno negativo.
 * Se indica cuantos números se han introducido sin contar el negativo.
 * Se indica el mayor de los pares y la media de los impares.
 * @author Sergio García
 */
public class Ejercicio21   { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Introduzca números. Cuando quiera parar, inserte nº negativo: ");
    int numeroIntroducido;
    int totalNumeros = 0;
    int parMayor = 0;
    int totalImpares = 0;
    int sumaImpares = 0;
    
    do {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido >= 0) {
        totalNumeros++;
        if ((numeroIntroducido % 2) == 1) {
          sumaImpares += numeroIntroducido;
          totalImpares++;
        } else {
          if (numeroIntroducido > parMayor)
            parMayor = numeroIntroducido;
        }
      }
    } while (numeroIntroducido >= 0);
    
    System.out.println("Ha introducido " + totalNumeros + " números.");
    System.out.println("La media de los impares es " + (sumaImpares/totalImpares) + ".");
    System.out.print("El par más grande es " + parMayor + ".");
  }
}
