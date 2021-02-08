package tema08;

public class Ejercicio20_28 {

  ////////////// EJERCICIO 20 /////////

  /**
   * Genera n n�meros aleatorios entre un m�ximo y un m�nimo.
   * 
   * @param n      n�mero entero
   * @param minimo n�mero m�nimo que habr�
   * @param maximo n�mero m�ximo que habr�
   * @return n n�meros entre el m�ximo y m�nimo dados
   */
  public static int[] generaArrayInt(int n, int minimo, int maximo) {
    int[] x = new int[n];

    for (int i = 0; i < n; i++) {
      x[i] = (int) (Math.random() * (maximo - minimo + 1) + minimo);
    }
    return x;
  }

  ////////////// EJERCICIO 21 /////////

  /**
   * Devuelve el n�mero m�s peque�o de un array.
   * 
   * @param x array de n�meros enteros
   * @return n�mero m�s peque�o encontrado en el array
   */
  public static int minimoArrayInt(int[] x) {
    int minimo = Integer.MAX_VALUE;

    for (int n : x) {
      if (n < minimo) {
        minimo = n;
      }
    }
    return minimo;
  }

  ////////////// EJERCICIO 22 /////////

  /**
   * Devuelve el n�mero m�s grande de un array.
   * 
   * @param x array de n�meros enteros
   * @return n�mero m�s grande encontrado en el array
   */
  public static int maximoArrayInt(int[] x) {
    int maximo = Integer.MIN_VALUE;

    for (int n : x) {
      if (n > maximo) {
        maximo = n;
      }
    }
    return maximo;
  }

  ////////////// EJERCICIO 23 /////////

  /**
   * Devuelve la media aritm�tica de un array de n�meros enteros.
   * 
   * @param x array de n�meros enteros
   * @return media de todos esos n�meros enteros
   */
  public static double mediaArrayInt(int[] x) {
    int suma = 0;

    for (int n : x) {
      suma += n;
    }
    return (double) suma / x.length;
  }

  ////////////// EJERCICIO 24 /////////

  /**
   * Nos dice si un n�mero (n) est� o no dentro de un array de n�meros enteros.
   *
   * @param x array de n�meros enteros
   * @param n n�meros entero que se buscar� dentro del array
   * @return verdadero si n se encuentra en el array, falso en caso contrario.
   */
  public static boolean estaEnArrayInt(int[] x, int n) {
    for (int numero : x) {
      if (numero == n) {
        return true;
      }
    }
    return false;
  }

  ////////////// EJERCICIO 25 /////////

  /**
   * Devuelve la posici�n de la primera aparici�n de un n�mero dentro de un array.
   *
   * @param x array de n�meros enteros
   * @param n n�meros entero que se buscar� dentro del array
   * @return posici�n de la primera aparici�n del n�mero n dentro del array x o -1
   *         en caso de no encontrarse el n�mero
   */
  public static int posicionEnArrayInt(int[] x, int n) {
    for (int i = 0; i < x.length; i++) {
      if (x[i] == n) {
        return i;
      }
    }
    return -1;
  }

  ////////////// EJERCICIO 26 /////////

  /**
   * Le da la vuelta a un array.
   *
   * @param x array de n�meros enteros
   * @return array volteado
   */
  public static int[] volteaArrayInt(int[] x) {
    int[] a = new int[x.length];
    for (int i = 0; i < x.length; i++) {
      a[x.length - i - 1] = x[i];
    }
    return a;
  }

  ////////////// EJERCICIO 27 /////////

  /**
   * Cuenta n posiciones hacia la izquierda desde el fin del array y
   * lo muestra a partir de esa posici�n.
   *
   * @param x array de n�meros enteros
   * @param n n�mero de movimientos (rotaciones hacia la derecha) a realizar
   * @return array rotada n posiciones a la derecha
   */
  public static int[] rotaDerechaArrayInt(int[] x, int n) {
    int[] a = x.clone(); // clona en a el contenido de x
    int i;
    int aux;
    
    while (n-- > 0) {
      aux = a[a.length - 1];
      for (i = a.length - 1; i > 0; i--) {
        a[i] = a[i - 1];
      }
      a[0] = aux;
    }
    return a;
  }

  ////////////// EJERCICIO 28 /////////

  /**
   * Cuenta n posiciones hacia la derecha desde el inicio del array. 
   * Muestra el array de forma normal desde esa posici�n hacia la derecha.
   * 
   * @param x array de n�meros enteros
   * @param n n�mero de movimientos (rotaciones hacia la izquierda) a realizar
   * @return array rotada n posiciones a la izquierda
   */
  public static int[] rotaIzquierdaArrayInt(int[] x, int n) {
    int[] a = x.clone(); // clona en a el contenido de x
    int i;
    int aux;

    while (n-- > 0) {
      aux = a[0];
      for (i = 0; i < a.length - 1; i++) {
        a[i] = a[i + 1];
      }
      a[a.length - 1] = aux;
    }
    return a;
  }
}
