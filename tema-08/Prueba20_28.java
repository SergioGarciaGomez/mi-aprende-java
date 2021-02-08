package tema08;

/**
 * Prueba Ejercicios 20-28 Tema 8
 * 
 * @author Sergio García
 */

public class Prueba20_28 {

  public static void main(String[] args) {
    
    int[] a = funciones.Funciones.generaArrayInt(50, 0, 50);
    System.out.println("Array normal: ");
    funciones.Funciones.muestraArrayInt(a);
    System.out.println("\nMínimo: " + funciones.Funciones.minimoArrayInt(a));
    System.out.println("Máximo: " + funciones.Funciones.maximoArrayInt(a));
    System.out.println("Media: " + funciones.Funciones.mediaArrayInt(a));
    
    if (funciones.Funciones.estaEnArrayInt(a, 6)) {
      System.out.println("\nEl 6 está en el array.");
      } else {
      System.out.println("\nEl 6 no está en el array.");
      }

    System.out.println("\nEl 24 está en la posición " + funciones.Funciones.posicionEnArrayInt(a, 24));
    
    System.out.println("\nArray al revés: ");
    funciones.Funciones.muestraArrayInt(funciones.Funciones.volteaArrayInt(a));
    
    System.out.println("\nArray rotado 2 pasos a la derecha: ");
    funciones.Funciones.muestraArrayInt(funciones.Funciones.rotaDerechaArrayInt(a, 2));
    
    System.out.println("\nArray rotado 6 pasos a la izquierda: ");
    funciones.Funciones.muestraArrayInt(funciones.Funciones.rotaIzquierdaArrayInt(a, 6));
  }
}
