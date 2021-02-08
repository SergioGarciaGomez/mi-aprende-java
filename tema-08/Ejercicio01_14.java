package tema08;

public class Ejercicio01_14 {

  ////////////// EJERCICIO 01 /////////

  /**
   * Dice si un número es o no es capicúa.
   * 
   * @param x un número que se quiere saber si es capicúa
   * @return verdadero si es capicúa y falso si no lo es
   */
  public static boolean esCapicua(long x) {
    return x == voltea(x);
  }

  /**
   * Dice si un número es o no es capicúa.
   * 
   * @param x un número que se quiere saber si es capicúa
   * @return verdadero si es capicúa y falso si no lo es
   */
  public static boolean esCapicua(int x) {
    return esCapicua((long) x);
  }

  ////////////// EJERCICIO 02 /////////

  /**
   * Comprueba si un número entero positivo es o no primo.
   * 
   * @param x un número entero positivo
   * @return true si el número es primo o false si el número no es primo
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
   * Comprueba si un número entero positivo es o no primo.
   * 
   * @param x un número entero positivo
   * @return true si el número es primo o false si el número no es primo
   */
  public static boolean esPrimo(int x) {
    return esPrimo((long) x);
  }

  ////////////// EJERCICIO 03 /////////

  /**
   * Devuelve el menor primo mayor al número
   * 
   * @param x un número entero
   * @return el menor primo mayor al número
   */
  public static int siguientePrimo(int x) {
    while (!esPrimo(++x)) {
    }

    return x;
  }

  ////////////// EJERCICIO 04 /////////

  /**
   * Resuelve la potencia de un número.
   * 
   * @param base      base de la potencia
   * @param exponente exponente de la potencia
   * @return número resultante de elevar la base al exponente introducido
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
   * Devuelve el número de dígitos que contiene un número entero.
   * 
   * @param x un número entero
   * @return la cantidad de dígitos que contiene el número
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
   * Devuelve el número de dígitos que contiene un número entero.
   * 
   * @param x un número entero
   * @return la cantidad de dígitos que contiene el número
   */
  public static int digitos(int x) {
    return (int) digitos((long) x);
  }

  ////////////// EJERCICIO 06 /////////

  /**
   * Devuelve un número volteado, al revés.
   * 
   * @param x un número entero
   * @return un número dado la vuelta
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
   * Devuelve un número volteado, al revés.
   * 
   * @param x un número entero
   * @return un número dado la vuelta
   */
  public static int voltea(int x) {
    return (int) voltea((long) x);
  }

  ////////////// EJERCICIO 07 /////////

  /**
   * Devuelve un dígito que está en cierta posición (n) de un número. La posición
   * 0 cuenta como el primer dígito.
   * 
   * @param x un número entero
   * @param n posición dentro de ese número (x)
   * @return dígito que está en cierta posición (n) de un número
   */
  public static int digitoNumero(long x, int n) {
    x = voltea(x);

    while (n-- > 0) {
      x = x / 10;
    }

    return (int) x % 10;
  }

  /**
   * Devuelve un dígito que está en cierta posición (n) de un número. La posición
   * 0 cuenta como el primer dígito.
   * 
   * @param x un número entero
   * @param n posición dentro de ese número (x)
   * @return dígito que está en cierta posición (n) de un número
   */
  public static int digitoNumero(int x, int n) {
    return digitoNumero((long) x, n);
  }

  ////////////// EJERCICIO 08 /////////

  /**
   * Da la posición de un dígito dentro de una cadena de números.
   * 
   * @param x un número entero
   * @param d dígito a buscar dentro del número
   * @return posición de un dígito dentro de una cadena de números
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
   * Da la posición de un dígito dentro de una cadena de números.
   * 
   * @param x un número entero
   * @param d dígito a buscar dentro del número
   * @return posición de un dígito dentro de una cadena de números
   */
  public static int posicionDigito(int x, int d) {
    return posicionDigito((long) x, d);
  }

  ////////////// EJERCICIO 09 /////////

  /**
   * Le quita a un número n dígitos por detrás.
   * 
   * @param x número entero
   * @param n número de dígitos a quitar por la derecha a x
   * @return número inicial con n dígitos menos
   */
  public static long quitaPorDetras(long x, int n) {
    return x / (long) potencia(10, n);
  }

  /**
   * Le quita a un número n dígitos por detrás.
   * 
   * @param x número entero
   * @param n número de dígitos a quitar por la derecha a x
   * @return número x con n dígitos menos
   */
  public static int quitaPorDetras(int x, int n) {
    return (int) quitaPorDetras((long) x, n);
  }

  ////////////// EJERCICIO 10 /////////

  /**
   * Le quita a un número n dígitos por delante.
   *
   * @param x número entero
   * @param n número de dígitos que se le van a quitar
   * @return número inicial x con n dígitos menos quitados de la izquierda
   */
  public static long quitaPorDelante(long x, int n) {
    x = pegaPorDetras(x, 1); // "cierra" el número por si acaso termina en 0
    x = voltea(quitaPorDetras(voltea(x), n));
    x = quitaPorDetras(x, 1);
    return x;
  }

  /**
   * Le quita a un número n dígitos por delante.
   *
   * @param x número entero
   * @param n número de dígitos que se le van a quitar
   * @return número inicial x con n dígitos menos quitados de la izquierda
   */
  public static int quitaPorDelante(int x, int n) {
    return (int) quitaPorDelante((long) x, n);
  }

  ////////////// EJERCICIO 11 /////////

  /**
   * Añade un dígito a un número por detrás.
   *
   * @param x número entero
   * @param d dígito que se le va a pegar por la derecha
   * @return número inicial x con el dígito d pegado por la derecha
   */
  public static long pegaPorDetras(long x, int d) {
    return juntaNumeros(x, d);
  }

  /**
   * Añade un dígito a un número por detrás.
   *
   * @param x número entero
   * @param d dígito que se le va a pegar por la derecha
   * @return número inicial x con el dígito d pegado por la derecha
   */
  public static int pegaPorDetras(int x, int d) {
    return (int) pegaPorDetras((long) x, d);
  }

  ////////////// EJERCICIO 12 /////////

  /**
   * Añade un dígito a un número por delante (por la izquierda).
   *
   * @param x número entero
   * @param d dígito que se le va a pegar por la izquierda
   * @return número inicial <code>x</code> con el dígito <code>d</code> pegado por
   *         la izquierda
   */
  public static long pegaPorDelante(long x, int d) {
    return juntaNumeros(d, x);
  }

  /**
   * Añade un dígito a un número por delante (por la izquierda).
   *
   * @param x número entero
   * @param d dígito que se le va a pegar por la izquierda
   * @return número inicial <code>x</code> con el dígito <code>d</code> pegado por
   *         la izquierda
   */
  public static int pegaPorDelante(int x, int d) {
    return (int) pegaPorDelante((long) x, d);
  }

  ////////////// EJERCICIO 13 /////////

  /**
   * Toma como parámetros las posiciones inicial y final dentro de un número y
   * devuelve el trozo correspondiente.
   * 
   * Las posiciones se cuentan de izquierda a derecha comenzando por el cero.
   *
   * @param x      número entero
   * @param inicio posición inicial
   * @param fin    posición final
   * @return trozo de número compuesto por todos los dígitos que van desde la
   *         posición inicial a la posición final incluyendo ambos
   */
  public static long trozoDeNumero(long x, int inicio, int fin) {
    int longitud = digitos(x);
    x = quitaPorDelante(x, inicio);
    x = quitaPorDetras(x, longitud - fin - 1);
    return x;
  }

  /**
   * Toma como parámetros las posiciones inicial y final dentro de un número y
   * devuelve el trozo correspondiente.
   * 
   * Las posiciones se cuentan de izquierda a derecha comenzando por el cero.
   *
   * @param x      número entero
   * @param inicio posición inicial
   * @param fin    posición final
   * @return trozo de número compuesto por todos los dígitos que van desde la
   *         posición inicial a la posición final incluyendo ambos
   */
  public static int trozoDeNumero(int x, int inicio, int fin) {
    return (int) trozoDeNumero((long) x, inicio, fin);
  }

  ////////////// EJERCICIO 14 /////////

  /**
   * Pega dos números para formar uno solo.
   * 
   * @param x trozo que se pegará por la izquierda
   * @param y trozo que se pegará por la derecha
   * @return número compuesto de x + y
   */
  public static long juntaNumeros(long x, long y) {
    return (long) (x * potencia(10, digitos(y))) + y;
  }

  /**
   * Pega dos números para formar uno solo.
   * 
   * @param x trozo que se pegará por la izquierda
   * @param y trozo que se pegará por la derecha
   * @return número compuesto de x + y
   */
  public static int juntaNumeros(int x, int y) {
    return (int) (juntaNumeros((long) x, (long) y));
  }
}
