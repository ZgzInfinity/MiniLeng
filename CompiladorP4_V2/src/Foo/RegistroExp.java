package Foo;


public class RegistroExp {
	// Valor entero de la exresion
	int valorEnt;
	
	// Valor booleano de la expresion
	boolean valorBool;
	
	
	// Valor de la cadena de caracteres
	String valorString;
	
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
	
	
	
	/*
	 * Pre: ---
	 * Post: Ha devuelto el valor valorString
	 */
	public String getValorString() {
		return valorString;
	}



	/*
	 * Pre: ---
	 * Post: Asigna a valorString el contenido de <<valorString>>
	 */
	public void setValorString(String valorString) {
		this.valorString = valorString;
	}

}
