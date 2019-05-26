package Exceptions;

/*
 * Gestion de errores semanticos del compilador
 */
public class ErrorSemantico extends Exception {

	// Control del desbordamiento de enteros a caracteres 
	static final int COTA_MINIMA = 0;
	static final int COTA_MAXIMA = 255;
	
	
		
	// Contador de errores semanticos
	static int numErroresSemanticos = 0;
	
	
	/*
	 * Pre: ---
	 * Post: Ha detectado un error semantico mostrandolo por pantalla 
	 * 		 e incrementando el numero de errores semanticos
	 */
	public static void deteccionErrorSemantico(String msg) {
		
		 // Incremento de los errores semanticos
		 numErroresSemanticos++;
		
		 // Mostrar por pantalla el error del mensaje
	     System.out.println("ERROR SEMANTICO : " + msg);
	}

	
	/*
	 * Pre: ---
	 * Post: Ha devuelto <<true>> si y solo contenido de <<valor>>
	 * 		 no esta entre COTA_MINIMA y COTA_MAXIMA
	 */
	public static boolean hayDesbordamientoEntacar(int valor) {
		return valor < COTA_MINIMA || valor > COTA_MAXIMA;
	}
	
	
	/*
	 * Pre: ---
	 * Post: Devuelve el numero de errores semanticos
	 */
	public static int getNumErroresSemanticos() {
		return numErroresSemanticos;
	}


}
