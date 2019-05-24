package Exceptions;

import MiniLeng.ParseException;


/*
 * Gestion de errores sintacticos del compilador
 */
public class ErrorSintactico {
	
	// Contador de errores sintacticos
	static int numErroresSintacticos = 0;
	
	/*
	 * Pre: ---
	 * Post: Ha detectado un error sintactico mostrandolo por pantalla 
	 * 		 e incrementando el numero de errores sintacticos
	 */
	public static void deteccionErrorSintactico(ParseException e) {
		
		  // Incremento del numero de errores sintacticos
		  numErroresSintacticos++;
		
		  // Mostrar por pantalla el error sintactico
	      System.out.println(" ERROR SINTACTICO (< " + e.currentToken.beginLine + " , "
	                                                 + e.currentToken.beginColumn + " >): "
	                                                 + " detectado token incorrecto: " + e.currentToken.next + "\n");
	}

	
	/*
	 * Pre: ---
	 * Post: Devuelve el numero de errores sintacticos
	 */
	public static int getNumErroresSintacticos() {
		return numErroresSintacticos;
	}

	
}
