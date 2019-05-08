package Foo;


public class RegistroExp {
	// Valor entero de la exresion
	int valorEnt;
	
	// Valor booleano de la expresion
	boolean valorBool;
	
	// Valor caracter de la expresion
	char valorChar;
	
	// Tipo de variable de la expresion
	Simbolo.Tipo_variable tipo;

	/*
	 * Pre: ---
	 * Post: Ha devuelto el valor entero
	 */
	public int getValorEnt() {
		return valorEnt;
	}

	
	
	/*
	 * Pre: ---
	 * Post: Asigna a valorEnt el contenido de <<valorEnt>>
	 */
	public void setValorEnt(int valorEnt) {
		this.valorEnt = valorEnt;
	}

	
	
	/*
	 * Pre: ---
	 * Post: Ha devuelto el valor booleano
	 */
	public boolean isValorBool() {
		return valorBool;
	}

	
	
	/*
	 * Pre: ---
	 * Post: Asigna a valorBool el contenido de <<valorBool>>
	 */
	public void setValorBool(boolean valorBool) {
		this.valorBool = valorBool;
	}

	
	
	/*
	 * Pre: ---
	 * Post: Ha devuelto el valor char
	 */
	public char getValorChar() {
		return valorChar;
	}

	
	
	/*
	 * Pre: ---
	 * Post: Asigna a valorChar el contenido de <<valorChar>>
	 */
	public void setValorChar(char valorChar) {
		this.valorChar = valorChar;
	}
	

	
	/*
	 * Pre: ---
	 * Post: Ha devuelto el valor tipo
	 */
	public Simbolo.Tipo_variable getTipo() {
		return tipo;
	}

	
	
	/*
	 * Pre: ---
	 * Post: Asigna a tipo el contenido de <<tipo>>
	 */
	public void setTipo(Simbolo.Tipo_variable tipo) {
		this.tipo = tipo;
	}
	
}
