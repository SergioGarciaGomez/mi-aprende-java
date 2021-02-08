package tema08;

public class Ejercicio01_14 {

  ////////////// EJERCICIO 01 /////////

  /**
   * Dice si un n�mero es o no es capic�a.
   * 
   * @param x un n�mero que se quiere saber si es capic�a
   * @return verdadero si es capic�a y falso si no lo es
   */
  public static boolean esCapicua(long x) {
    return x == voltea(x);
  }

  /**
   * Dice si un n�mero es o no es capic�a.
   * 
   * @param x un n�mero que se quiere saber si es capic�a
   * @return verdadero si es capic�a y falso si no lo es
   */
  public static boolean esCapicua(int x) {
    return esCapicua((long) x);
  }

  ////////////// EJERCICIO 02 /////////

  /**
   * Comprueba si un n�mero entero positivo es o no primo.
   * 
   * @param x un n�mero entero positivo
   * @return true si el n�mero es primo o false si el n�mero no es primo
   */
  public static boolean esPrimo(long x) {

    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }

    return true;
  }

  /**
   * Comprueba si un n�mero entero positivo es o no primo.
   * 
   * @param x un n�mero entero positivo
   * @return true si el n�mero es primo o false si el n�mero no es primo
   */
  public static boolean esPrimo(int x) {
    return esPrimo((long) x);
  }

  ////////////// EJERCICIO 03 /////////

  /**
   * Devuelve el menor primo mayor al n�mero
   * 
   * @param x un n�mero entero
   * @return el menor primo mayor al n�mero
   */
  public static int siguientePrimo(int x) {
    while (!esPrimo(++x)) {
    }

    return x;
  }

  ////////////// EJERCICIO 04 /////////

  /**
   * Resuelve la potencia de un n�mero.
   * 
   * @param base      base de la potencia
   * @param exponente exponente de la potencia
   * @return n�mero resultante de elevar la base al exponente introducido
   */
  public static double potencia(int base, int exponente) {

    if (exponente == 0) {
      return 1;
    }

    if (exponente < 0) {
      return 1 / potencia(base, -exponente);
    }

    int n = 1;

    for (int i = 0; i < Math.abs(exponente); i++) {
      n = n * base;
    }

    return n;
  }

  ////////////// EJERCICIO 05 /////////

  /**
   * Devuelve el n�mero de d�gitos que contiene un n�mero entero.
   * 
   * @param x un n�mero entero
   * @return la cantidad de d�gitos que contiene el n�mero
   */
  public static int digitos(long x) {

    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
      }
      return n;
    }
  }

  /**
   * Devuelve el n�mero de d�gitos que contiene un n�mero entero.
   * 
   * @param x un n�mero entero
   * @return la cantidad de d�gitos que contiene el n�mero
   */
  public static int digitos(int x) {
    return (int) digitos((long) x);
  }

  ////////////// EJERCICIO 06 /////////

  /**
   * Devuelve un n�mero volteado, al rev�s.
   * 
   * @param x un n�mero entero
   * @return un n�mero dado la vuelta
   */
  public static long voltea(long x) {

    if (x < 0) {
      return -voltea(-x);
    }
    long volteado = 0;

    while (x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }

    return volteado;
  }

  /**
   * Devuelve un n�mero volteado, al rev�s.
   * 
   * @param x un n�mero entero
   * @return un n�mero dado la vuelta
   */
  public static int voltea(int x) {
    return (int) voltea((long) x);
  }

  ////////////// EJERCICIO 07 /////////

  /**
   * Devuelve un d�gito que est� en cierta posici�n (n) de un n�mero. La posici�n
   * 0 cuenta como el primer d�gito.
   * 
   * @param x un n�mero entero
   * @param n posici�n dentro de ese n�mero (x)
   * @return d�gito que est� en cierta posici�n (n) de un n�mero
   */
  public static int digitoNumero(long x, int n) {
    x = voltea(x);

    while (n-- > 0) {
      x = x / 10;
    }

    return (int) x % 10;
  }

  /**
   * Devuelve un d�gito que est� en cierta posici�n (n) de un n�mero. La posici�n
   * 0 cuenta como el primer d�gito.
   * 
   * @param x un n�mero entero
   * @param n posici�n dentro de ese n�mero (x)
   * @return d�gito que est� en cierta posici�n (n) de un n�mero
   */
  public static int digitoNumero(int x, int n) {
    return digitoNumero((long) x, n);
  }

  ////////////// EJERCICIO 08 /////////

  /**
   * Da la posici�n de un d�gito dentro de una cadena de n�meros.
   * 
   * @param x un n�mero entero
   * @param d d�gito a buscar dentro del n�mero
   * @return posici�n de un d�gito dentro de una cadena de n�meros
   */
  public static int posicionDigito(long x, int d) {
    int i;

    for (i = 0; (i < digitos(x)) && (digitoNumero(x, i) != d); i++) {
    }

    if (i == digitos(x)) {
      return -1;
    } else {
      return i + 1;
    }
  }

  /**
   * Da la posici�n de un d�gito dentro de una cadena de n�meros.
   * 
   * @param x un n�mero entero
   * @param d d�gito a buscar dentro del n�mero
   * @return posici�n de un d�gito dentro de una cadena de n�meros
   */
  public static int posicionDigito(int x, int d) {
    return posicionDigito((long) x, d);
  }

  ////////////// EJERCICIO 09 /////////

  /**
   * Le quita a un n�mero n d�gitos por detr�s.
   * 
   * @param x n�mero entero
   * @param n n�mero de d�gitos a quitar por la derecha a x
   * @return n�mero inicial con n d�gitos menos
   */
  public static long quitaPorDetras(long x, int n) {
    return x / (long) potencia(10, n);
  }

  /**
   * Le quita a un n�mero n d�gitos por detr�s.
   * 
   * @param x n�mero entero
   * @param n n�mero de d�gitos a quitar por la derecha a x
   * @return n�mero x con n d�gitos menos
   */
  public static int quitaPorDetras(int x, int n) {
    return (int) quitaPorDetras((long) x, n);
  }

  ////////////// EJERCICIO 10 /////////

  /**
   * Le quita a un n�mero n d�gitos por delante.
   *
   * @param x n�mero entero
   * @param n n�mero de d�gitos que se le van a quitar
   * @return n�mero inicial x con n d�gitos menos quitados de la izquierda
   */
  public static long quitaPorDelante(long x, int n) {
    x = pegaPorDetras(x, 1); // "cierra" el n�mero por si acaso termina en 0
    x = voltea(quitaPorDetras(voltea(x), n));
    x = quitaPorDetras(x, 1);
    return x;
  }

  /**
   * Le quita a un n�mero n d�gitos por delante.
   *
   * @param x n�mero entero
   * @param n n�mero de d�gitos que se le van a quitar
   * @return n�mero inicial x con n d�gitos menos quitados de la izquierda
   */
  public static int quitaPorDelante(int x, int n) {
    return (int) quitaPorDelante((long) x, n);
  }

  ////////////// EJERCICIO 11 /////////

  /**
   * A�ade un d�gito a un n�mero por detr�s.
   *
   * @param x n�mero entero
   * @param d d�gito que se le va a pegar por la derecha
   * @return n�mero inicial x con el d�gito d pegado por la derecha
   */
  public static long pegaPorDetras(long x, int d) {
    return juntaNumeros(x, d);
  }

  /**
   * A�ade un d�gito a un n�mero por detr�s.
   *
   * @param x n�mero entero
   * @param d d�gito que se le va a pegar por la derecha
   * @return n�mero inicial x con el d�gito d pegado por la derecha
   */
  public static int pegaPorDetras(int x, int d) {
    return (int) pegaPorDetras((long) x, d);
  }

  ////////////// EJERCICIO 12 /////////

  /**
   * A�ade un d�gito a un n�mero por delante (por la izquierda).
   *
   * @param x n�mero entero
   * @param d d�gito que se le va a pegar por la izquierda
   * @return n�mero inicial <code>x</code> con el d�gito <code>d</code> pegado por
   *         la izquierda
   */
  public static long pegaPorDelante(long x, int d) {
    return juntaNumeros(d, x);
  }

  /**
   * A�ade un d�gito a un n�mero por delante (por la izquierda).
   *
   * @param x n�mero entero
   * @param d d�gito que se le va a pegar por la izquierda
   * @return n�mero inicial <code>x</code> con el d�gito <code>d</code> pegado por
   *         la izquierda
   */
  public static int pegaPorDelante(int x, int d) {
    return (int) pegaPorDelante((long) x, d);
  }

  ////////////// EJERCICIO 13 /////////

  /**
   * Toma como par�metros las posiciones inicial y final dentro de un n�mero y
   * devuelve el trozo correspondiente.
   * 
   * Las posiciones se cuentan de izquierda a derecha comenzando por el cero.
   *
   * @param x      n�mero entero
   * @param inicio posici�n inicial
   * @param fin    posici�n final
   * @return trozo de n�mero compuesto por todos los d�gitos que van desde la
   *         posici�n inicial a la posici�n final incluyendo ambos
   */
  public static long trozoDeNumero(long x, int inicio, int fin) {
    int longitud = digitos(x);
    x = quitaPorDelante(x, inicio);
    x = quitaPorDetras(x, longitud - fin - 1);
    return x;
  }

  /**
   * Toma como par�metros las posiciones inicial y final dentro de un n�mero y
   * devuelve el trozo correspondiente.
   * 
   * Las posiciones se cuentan de izquierda a derecha comenzando por el cero.
   *
   * @param x      n�mero entero
   * @param inicio posici�n inicial
   * @param fin    posici�n final
   * @return trozo de n�mero compuesto por todos los d�gitos que van desde la
   *         posici�n inicial a la posici�n final incluyendo ambos
   */
  public static int trozoDeNumero(int x, int inicio, int fin) {
    return (int) trozoDeNumero((long) x, inicio, fin);
  }

  ////////////// EJERCICIO 14 /////////

  /**
   * Pega dos n�meros para formar uno solo.
   * 
   * @param x trozo que se pegar� por la izquierda
   * @param y trozo que se pegar� por la derecha
   * @return n�mero compuesto de x + y
   */
  public static long juntaNumeros(long x, long y) {
    return (long) (x * potencia(10, digitos(y))) + y;
  }

  /**
   * Pega dos n�meros para formar uno solo.
   * 
   * @param x trozo que se pegar� por la izquierda
   * @param y trozo que se pegar� por la derecha
   * @return n�mero compuesto de x + y
   */
  public static int juntaNumeros(int x, int y) {
    return (int) (juntaNumeros((long) x, (long) y));
  }
}
