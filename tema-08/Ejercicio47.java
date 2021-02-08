/**
 * Ejercicio 47 Tema 8
 * Define la funci�n convierteArrayEnString con la siguiente cabecera:
 * public static String convierteArrayEnString(int[] a)
 * Esta funci�n toma como par�metro un array que contiene n�meros y devuelve
 * una cadena de caracteres con esos n�meros. Por ejemplo, si a = { }, convierteArrayEnString(
 * a) devuelve ��; si a = { 8 }, convierteArrayEnString(a)
 * devuelve �8�; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
 * �62501�.
 * @author Sergio Garc�a
 */
public class Ejercicio47 {
	
	public static void main(String[] args) {
		
		int[] a = {};
		System.out.println("a: " + Ejercicio47.convierteArrayEnString(a));
		int[] b = {8};
		System.out.println("b: " + Ejercicio47.convierteArrayEnString(b));
		int[] c = {6, 2, 5, 0, 1};
		System.out.println("c: " + Ejercicio47.convierteArrayEnString(c));
		int[] d = {1, 10, 22, 31, 4};
		System.out.println("d: " + Ejercicio47.convierteArrayEnString(d));
		
	}
	
	/**
	 * Toma un array que contiene n�meros.
	 * Devuelve una cadena de caracteres con esos n�meros.
	 * 
	 * @param a array que contiene n�meros
	 * @return  cadena de caracteres
	 */
	public static String convierteArrayEnString(int[] a) {
			
		String resultado = "";
			
		for (int digito : a) {
			resultado += digito;
		}
			
		return resultado;
	}
}

