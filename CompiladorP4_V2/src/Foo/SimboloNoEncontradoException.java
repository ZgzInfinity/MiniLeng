package Foo;

/*
 * Excepcion para simbolos no recogidos en la tabla Hash
 */
public class SimboloNoEncontradoException extends Exception {
	public SimboloNoEncontradoException(String msg) {
        super(msg);
    }
	
}
