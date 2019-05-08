package Foo;

public class TipoOperador {
	/* ENUMS */
	
	// Representacion del tipo simbolo con enum
	 enum Tipo_Operador {
		SUMA, RESTA, MULTIPLICACION, DIVISION, MOD, OR, AND;
	}
	
	 // Almacenammiento del tipo de operador
	 private Tipo_Operador operador;

	 
	 
	/*
	 * Pre: ---
	 * Post: Ha devuelto el tipo de operador 
	 */
	public Tipo_Operador getOperador() {
		return operador;
	}

	
	
	/*
	 * Pre: ---
	 * Post: Ha asignado a <<operador>> el tipo de operador <<operdor>>
	 */
	public void setOperador(Tipo_Operador operador) {
		this.operador = operador;
	} 
	 
}
