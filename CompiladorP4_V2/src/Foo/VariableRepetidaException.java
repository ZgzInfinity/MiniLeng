package Foo;

public class VariableRepetidaException extends Exception {

	  // Error de simbolo ya existente en la tabla de simbolos
	  public void variableRepetidaExcepcion(String imagen) {
	    System.out.println(" ERROR EN LA TABLA DE SIMBOLOS: la variable " + imagen + " ya existe ");
	  }
}
