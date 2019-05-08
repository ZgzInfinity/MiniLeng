package Foo;

public class SimboloRepetidoException extends Exception {

	  // Error de simbolo ya existente en la tabla de simbolos
	  public void simboloRepetidoExcepcion(String imagen) {
	    System.out.println(" ERROR EN LA TABLA DE SIMBOLOS: el simbolo " + imagen + " ya existe ");
	  }
}
