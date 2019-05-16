package Exceptions;

public class ErrorLexico {
	// Error sintactico personalizado para el compilador
	public ErrorLexico(int fila, int columna, String tokenMalo) {
	    System.out.println(" ERROR LEXICO <(" + fila + " , " + columna + " >):" + " simbolo no reconocido " + tokenMalo);
	}
}
