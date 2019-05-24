package Exceptions;

/*
 * Gestion de errores lexicos del compilador
 */
public class ErrorLexico {
	
	//Contador de erroes lexicos
	static int numErroresLexicos = 0;
	
	/*
	 * Pre: ---
	 * Post: Ha detectado un error lexico mostrandolo por pantalla 
	 * 		 e incrementando el numero de errores lexicos
	 */
	public static void deteccionErrorLexico(int fila, int columna, String tokenMalo) {
		
		// Incrementar el numero de fallos lexicos
		numErroresLexicos++;
		
		// Mostrar pon pantalla el error lexico
		System.out.println(" ERROR LEXICO <(" + fila + " , " + columna + " >):" + " simbolo no reconocido " + tokenMalo);
	}

	
	/*
	 * Pre: ---
	 * Post: Devuelve el numero de errores lexicos
	 */
	public static int getNumErroresLexicos() {
		return numErroresLexicos;
	}


}
