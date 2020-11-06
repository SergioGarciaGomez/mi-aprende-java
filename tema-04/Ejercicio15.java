/**
 * Ejercicio 15 Tema 4
 * Pinta una pirámide con cualquier carácter de relleno y el vértice apuntando donde quiera
 * @author Sergio García
 */
public class Ejercicio15 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduzca el carácter de relleno: ");
    String r = System.console().readLine();
    System.out.println("Elija hacia donde quiere el vértice (1-4  ): ");
    System.out.println("1. Con el vértice hacia arriba");
    System.out.println("2. Con el vértice hacia abajo");
    System.out.println("3. Con el vértice hacia la izquierda");
    System.out.println("4. Con el vértice hacia la derecha");
    int vertice = Integer.parseInt(System.console().readLine());
  
    switch(vertice) {
      case 1: 
        System.out.println("  " + r);
        System.out.println(" " + r + r + r);
        System.out.println(r + r + r + r + r);
        break;
        
      case 2:
        System.out.println(r + r + r + r + r);
        System.out.println(" " + r + r + r);
        System.out.println("  " + r);
        break;
        
      case 3:
        System.out.println("    " + r);
        System.out.println("  " + r + " " + r);
        System.out.println(r + " " + r + " " + r);
        System.out.println("  " + r + " " + r);
        System.out.println("    " + r);
        break;
        
      case 4:
        System.out.println(r);
        System.out.println(r + " " + r);
        System.out.println(r + " " + r + " " + r);
        System.out.println(r + " " + r);
        System.out.println(r);
        break;
      default:
    } //Fin Switch 
  }
}