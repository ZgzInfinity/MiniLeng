package Warnings;

public class DesbordamientoEnteros {

	// Control del desbordamiento de enteros a caracteres 
	static final int COTA_MINIMA_ENTERO = -32678;
	static final int COTA_MAXIMA_ENTERO = 32678;
	
	
	/*
	 * Pre: ---
	 * Post: Ha devuelto <<true>> si y solo el contenido de <<valor>>
	 * 		 no esta entre COTA_MINIMA_ENTERO y COTA_MAXIMA_ENTERO
	 */
	public static boolean hayDesbordamientoEntero(int valor) {
		return valor < COTA_MINIMA_ENTERO || valor > COTA_MAXIMA_ENTERO;
	}
}
