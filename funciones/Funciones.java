package funciones;

/**
 * Funciones generales
 * 
 * @author Sergio García
 */
public class Funciones {

  /////////////////////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////
  ////////////////////// FUNCIONES MATEMÁTICAS ////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////

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

  /**
   * Añade un dígito a un número por delante.
   *
   * @param x número entero
   * @param d dígito que se le va a pegar por la izquierda
   * @return número inicial x con el dígito d pegado por la izquierda
   */
  public static long pegaPorDelante(long x, int d) {
    return juntaNumeros(d, x);
  }

  /**
   * Añade un dígito a un número por delante.
   *
   * @param x número entero
   * @param d dígito que se le va a pegar por la izquierda
   * @return número inicial x con el dígito d pegado por la izquierda
   */
  public static int pegaPorDelante(int x, int d) {
    return (int) pegaPorDelante((long) x, d);
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

  /**
   * Pasa un número decimal a binario.
   *
   * @param decimal número entero
   * @return número inicial pasado a binario
   */
  public static long decimalABinario(long n) {

    long binario = 0;

    for (int i = 0; n != 0; i++) {
      binario = binario + (n % 2) * (long) Math.pow(10, i); 
      n /= 2;
    }

    return binario;
  }

  /** Pasa un número binario a decimal.
   *
   * @param binario número entero con 0's y 1's
   * 
   * @return número inicial pasado a decimal
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
   * Transforma un número a palitos. 92 por ejemplo serían 9 palitos, y luego 2
   * separados.
   * 
   * @param n número entero
   * @return número transformado a palotes
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
   * Convierte un array de enteros o un un número entero en código morse
   * 
   * @param n array de enteros o un número entero
   * @return número en código morse
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
   * Transforma un número o un array de números a letras.
   * 85 = Ocho, Cinco.
   * 
   * @param n número entero o array de números
   * @return  número transformado a letras
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
   * Pide un caracter y el número de veces que se va a escribir en esa línea.
   * 
   * @param caracter     un caracter cualquiera (1, *, f,)
   * @param repeticiones un número entero
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
   * Muestra por pantalla todos los elementos de un array de números enteros
   * separados por un espacio.
   * 
   * @param x array de números enteros
   * @return todos los elementos de un array
   */
  public static void muestraArrayInt(int x[]) {
    for (int n : x) {
      System.out.print(n + " ");
    }
    System.out.println();
  }

  /**
   * Toma un array que contiene números. Devuelve una cadena de caracteres con
   * esos números.
   * 
   * @param a array que contiene números
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
   * Genera n números aleatorios entre un máximo y un mínimo.
   * 
   * @param n      número entero
   * @param minimo número mínimo que habrá
   * @param maximo número máximo que habrá
   * @return n números entre el máximo y mínimo dados
   */
  public static int[] generaArrayInt(int n, int minimo, int maximo) {
    int[] x = new int[n];

    for (int i = 0; i < n; i++) {
      x[i] = (int) (Math.random() * (maximo - minimo + 1) + minimo);
    }
    return x;
  }

  /**
   * Devuelve el número más pequeño de un array.
   * 
   * @param x array de números enteros
   * @return número más pequeño encontrado en el array
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
   * Devuelve el número más grande de un array.
   * 
   * @param x array de números enteros
   * @return número más grande encontrado en el array
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
   * Devuelve la media aritmética de un array de números enteros.
   * 
   * @param x array de números enteros
   * @return media de todos esos números enteros
   */
  public static double mediaArrayInt(int[] x) {
    int suma = 0;

    for (int n : x) {
      suma += n;
    }
    return (double) suma / x.length;
  }

  /**
   * Nos dice si un número (n) está o no dentro de un array de números enteros.
   *
   * @param x array de números enteros
   * @param n números entero que se buscará dentro del array
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
   * Devuelve la posición de la primera aparición de un número dentro de un array.
   *
   * @param x array de números enteros
   * @param n números entero que se buscará dentro del array
   * @return posición de la primera aparición del número n dentro del array x o -1
   *         en caso de no encontrarse el número
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
   * @param x array de números enteros
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
   * partir de esa posición.
   *
   * @param x array de números enteros
   * @param n número de movimientos (rotaciones hacia la derecha) a realizar
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
   * array de forma normal desde esa posición hacia la derecha.
   * 
   * @param x array de números enteros
   * @param n número de movimientos (rotaciones hacia la izquierda) a realizar
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
   * Une dos arrays de números enteros.
   * 
   * @param a array con números enteros
   * @param b array con números enteros
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