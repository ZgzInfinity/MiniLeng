package Exceptions;

public class ErrorSemantico extends Exception {

	// Control del desbordamiento de enteros a caracteres 
	static final int COTA_MINIMA = 0;
	static final int COTA_MAXIMA = 255;
	
	// Control del desbordamiento de enteros a caracteres 
	static final int COTA_MINIMA_ENTERO = -32678;
	static final int COTA_MAXIMA_ENTERO = 32678;
		
	
	
	// Error semantico personalizado del compilador
	public ErrorSemantico() {
		     
	}
	
	// Error semantico personalizado del compilador
	public ErrorSemantico(String msg) {
	     System.out.println("ERROR SEMANTICO : " + msg);
	}

	
	/*
	 * Pre: ---
	 * Post: Ha devuelto <<true>> si y solo contenido de <<valor>>
	 * 		 no esta entre COTA_MINIMA y COTA_MAXIMA
	 */
	public static boolean hayDesbordamientoEntacar(int valor) {
		return valor < COTA_MINIMA_ENTERO || valor > COTA_MAXIMA_ENTERO;
	}
	
	
	/*
	 * Pre: ---
	 * Post: Ha devuelto <<true>> si y solo el contenido de <<valor>>
	 * 		 no esta entre COTA_MINIMA_ENTERO y COTA_MAXIMA_ENTERO
	 */
	public static boolean hayDesbordamientoEntero(int valor) {
		return valor < -32678 || valor > 32768;
	}
}
