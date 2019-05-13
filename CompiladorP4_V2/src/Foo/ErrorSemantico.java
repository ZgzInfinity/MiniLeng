package Foo;

public class ErrorSemantico extends Exception {

	// Control del desbordamiento de enteros 
	static final int COTA_MINIMA = 0;
	static final int COTA_MAXIMA = 255;
	
	// Error semantico personalizado del compilador
	public ErrorSemantico() {
		     
	}
	
	// Error semantico personalizado del compilador
	public ErrorSemantico(String msg) {
	     System.out.println(" ERROR SEMANTICO : " + msg);
	}

	
	/*
	 * Pre: ---
	 * Post: Ha devuelto <<true>> si y solo contenido de <<valor>>
	 * 		 no esta entre COTA_MINIMA y COTA_MAXIMA
	 */
	static boolean hayDesbordamiento(int valor) {
		return valor < COTA_MINIMA || valor > COTA_MAXIMA;
	}
}
