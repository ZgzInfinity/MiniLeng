package Foo;

public class ErrorSintactico {
	// Error sintactico personalizado para el compilador
	public ErrorSintactico(ParseException e) {
	      System.out.println(" ERROR SINTACTICO (< " + e.currentToken.beginLine + " , "
	                                                  + e.currentToken.beginColumn + " >): "
	                                                  + " detectado token incorrecto: " + e.currentToken.next + "\n");
	} 
}
