package funciones;

/**
 * Funciones generales
 * 
 * @author Sergio Garc�a
 */
public class Funciones {

  /////////////////////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////
  ////////////////////// FUNCIONES MATEM�TICAS ////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////

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

  /**
   * A�ade un d�gito a un n�mero por delante.
   *
   * @param x n�mero entero
   * @param d d�gito que se le va a pegar por la izquierda
   * @return n�mero inicial x con el d�gito d pegado por la izquierda
   */
  public static long pegaPorDelante(long x, int d) {
    return juntaNumeros(d, x);
  }

  /**
   * A�ade un d�gito a un n�mero por delante.
   *
   * @param x n�mero entero
   * @param d d�gito que se le va a pegar por la izquierda
   * @return n�mero inicial x con el d�gito d pegado por la izquierda
   */
  public static int pegaPorDelante(int x, int d) {
    return (int) pegaPorDelante((long) x, d);
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

  /**
   * Pasa un n�mero decimal a binario.
   *
   * @param decimal n�mero entero
   * @return n�mero inicial pasado a binario
   */
  public static long decimalABinario(long n) {

    long binario = 0;

    for (int i = 0; n != 0; i++) {
      binario = binario + (n % 2) * (long) Math.pow(10, i); 
      n /= 2;
    }

    return binario;
  }

  /** Pasa un n�mero binario a decimal.
   *
   * @param binario n�mero entero con 0's y 1's
   * 
   * @return n�mero inicial pasado a decimal
   */
  public static long binarioADecimal(long binario) {

    if (binario == 0) {
      return 0;
    }

    long decimal = 0;

    int bits = digitos(binario);

    for (int i = 0; i < bits; i++) {
      decimal += digitoNumero(binario, bits - i - 1) * potencia(2, i);
    }

    return decimal;
  }

  /**
   * Transforma un n�mero a palitos. 92 por ejemplo ser�an 9 palitos, y luego 2
   * separados.
   * 
   * @param n n�mero entero
   * @return n�mero transformado a palotes
   */
  public static String convierteEnPalotes(int n) {
    String resultado = "";
    for (int i = 0; i < digitos(n); i++) {
      for (int j = 0; j < digitoNumero(n, i); j++) {
        resultado += "|";
      }
      if (i < digitos(n) - 1) {
        resultado += "-";
      }
    }
    return resultado;
  }

  /**
   * Convierte un array de enteros o un un n�mero entero en c�digo morse
   * 
   * @param n array de enteros o un n�mero entero
   * @return n�mero en c�digo morse
   */
  public static String convierteEnMorse(int n) {
    String[] morse = { "_ _ _ _ _", ". _ _ _ _", ". . _ _ _", ". . . _ _", ". . . . _", ". . . . .", "_ . . . .",
        "_ _ . . .", "_ _ _ . .", "_ _ _ _ ." };
    String resultado = "";
    for (int i = 0; i < digitos(n); i++) {
      resultado += morse[digitoNumero(n, i)];
    }
    return resultado;
  }

  /**
   * Transforma un n�mero o un array de n�meros a letras.
   * 85 = Ocho, Cinco.
   * 
   * @param n n�mero entero o array de n�meros
   * @return  n�mero transformado a letras
   */
  public static String convierteNumerosEnPalabras(int n) {
    String[] digitos = { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
    String resultado = "";
    int i;
    
    for (i = 0; i < digitos(n) - 1; i++) {
      resultado += digitos[digitoNumero(n, i)] + ", ";
    }
    
    resultado += digitos[digitoNumero(n, i)];
    return resultado;
  }

  /**
   * Pide un caracter y el n�mero de veces que se va a escribir en esa l�nea.
   * 
   * @param caracter     un caracter cualquiera (1, *, f,)
   * @param repeticiones un n�mero entero
   * @return             un caracter concreto escrito x veces (repeticiones)
   */
  public static String linea(char caracter, int repeticiones) {
    String resultado = "";
    
    for (int i = 0; i < repeticiones; i++) {
    resultado += caracter;
    }
    
    return resultado;
  }

  /////////////////////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////
  ////////////////////// FUNCIONES PARA ARRAYS ////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////

  /**
   * Muestra por pantalla todos los elementos de un array de n�meros enteros
   * separados por un espacio.
   * 
   * @param x array de n�meros enteros
   * @return todos los elementos de un array
   */
  public static void muestraArrayInt(int x[]) {
    for (int n : x) {
      System.out.print(n + " ");
    }
    System.out.println();
  }

  /**
   * Toma un array que contiene n�meros. Devuelve una cadena de caracteres con
   * esos n�meros.
   * 
   * @param a array que contiene n�meros
   * @return cadena de caracteres
   */
  public static String convierteArrayEnString(int[] a) {
    String resultado = "";

    for (int digito : a) {
      resultado += digito;
    }
    return resultado;
  }

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

  /**
   * Nos dice si un n�mero (n) est� o no dentro de un array de n�meros enteros.
   *
   * @param x array de n�meros enteros
   * @param n n�meros entero que se buscar� dentro del array
   * @return verdadero si n se encuentra en el array x en caso contrario.
   */
  public static boolean estaEnArrayInt(int[] x, int n) {
    for (int numero : x) {
      if (numero == n) {
        return true;
      }
    }
    return false;
  }

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

  /**
   * Cuenta n posiciones hacia la izquierda desde el fin del array y lo muestra a
   * partir de esa posici�n.
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

  /**
   * Cuenta n posiciones hacia la derecha desde el inicio del array. Muestra el
   * array de forma normal desde esa posici�n hacia la derecha.
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

  /**
   * Une dos arrays de n�meros enteros.
   * 
   * @param a array con n�meros enteros
   * @param b array con n�meros enteros
   * @return  array a y b unidos
   */
  public static int[] concatenaArrays(int[] a, int[] b) {
    int[] resultado = new int[a.length + b.length];
    
    for (int i = 0; i < a.length; i++) {
      resultado[i] = a[i];
    }
    
    for (int i = 0; i < b.length; i++) {
      resultado[i + a.length] = b[i];
    }
    
    return resultado;
  }
  
}