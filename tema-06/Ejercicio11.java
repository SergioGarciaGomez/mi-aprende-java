/**
 * Ejercicio 11 Tema 6
 * Escribe un programa que muestre 20 notas generadas al azar. 
 * Las notas deben aparecer de la forma: suspenso, suficiente, 
 * bien, notable o sobresaliente. Al final aparecerá el número de
 * suspensos, el número de suficientes, el número de bienes, etc.
 * @author Sergio García
 */
public class Ejercicio11 { // Clase principal
  public static void main(String[] args) {
  
    String nota = "";
    int sufis = 0, notables = 0, sobresalientes = 0, bienes = 0, suspensos = 0;
    
    for (int i = 0; i < 20; i++) {
      int numeroNota = (int)(Math.random() * 5);
      
      switch (numeroNota) {
        case 0:
          nota = "Suficiente";
          sufis++;
          break;
        case 1:
          nota = "Notable";
          notables++;
          break;
        case 2:
         nota = "Sobresaliente";
         sobresalientes++;
         break;
        case 3:
          nota = "Bien";
          bienes++;
          break;
        case 4:
          nota = "Suspenso";
          suspensos++;
        default:
      } // fin switch numeroNota
      System.out.println(nota);
    }
    
    System.out.printf("El total de sobresalientes son:%2d\n", sobresalientes);
    System.out.printf("El total de notables son:      %2d\n", notables);
    System.out.printf("El total de bienes son:        %2d\n", bienes);
    System.out.printf("El total de suficientes son:   %2d\n", sufis);
    System.out.printf("El total de suspensos son:     %2d\n", suspensos);
  }
}