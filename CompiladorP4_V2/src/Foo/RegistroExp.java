package Foo;

import Foo.Simbolo.Clase_parametro;

public class RegistroExp {
	// Valor entero de la exresion
	int valorEnt;
	
	// Valor booleano de la expresion
	boolean valorBool;
	
	
	// Valor de la cadena de caracteres
	String valorString;
	
	// Tipo de variable de la expresion
	Simbolo.Tipo_variable tipo;
	
	// Tipo de clase de parametro
	Simbolo.Clase_parametro clase;
	
	// Tipo de simbolo
	Simbolo.Tipo_simbolo simbolo;



	public Simbolo.Tipo_simbolo getSimbolo() {
		return simbolo;
	}



	public void setSimbolo(Simbolo.Tipo_simbolo simbolo) {
		this.simbolo = simbolo;
	}



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
	
	
	
	/*
	 * Pre: ---
	 * Post: Ha devuelto la clase del parametro
	 */
	public Simbolo.Clase_parametro getClase() {
		return clase;
	}



	/*
	 * Pre: ---
	 * Post: Ha asignado a <<clase>> es tipo de clase <<clase>>
	 */
	public void setClase(Simbolo.Clase_parametro clase) {
		this.clase = clase;
	}



	@Override
	public String toString() {
		return "RegistroExp [valorEnt=" + valorEnt + ", valorBool=" + valorBool + ", valorString=" + valorString
				+ ", tipo=" + tipo + ", clase=" + clase + "]";
	}

	
}
