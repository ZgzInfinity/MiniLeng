package Foo;

public class AccionRepetidaException extends Exception {

	  // Error de simbolo ya existente en la tabla de simbolos
	  public void accionRepetidaExcepcion(String imagen) {
	    System.out.println(" ERROR EN LA TABLA DE SIMBOLOS: la accion " + imagen + " ya existe ");
	  }
}
