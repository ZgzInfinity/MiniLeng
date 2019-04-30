package Foo;

/*
 * Excepcion para simbolos no recogidos en la tabla Hash
 */
public class SimboloNoEncontradoException extends Exception {
	
	// Error de simbolo no encontrado en la tabla de simbolos
    public void simboloNoEncontrado(String imagen){
	    System.out.println(" ERROR EN LA TABLA DE SIMBOLOS: el simbolo " + imagen + " no existe ");
	}
}
