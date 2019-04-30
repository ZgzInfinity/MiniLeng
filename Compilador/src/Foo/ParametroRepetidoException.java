package Foo;

public class ParametroRepetidoException extends Exception {

	  // Error de simbolo ya existente en la tabla de simbolos
	  public static void parametroRepetidoExcepcion(String imagen) {
	    System.out.println(" ERROR EN LA TABLA DE SIMBOLOS: el parametro " + imagen + " ya existe ");
	  }
}
