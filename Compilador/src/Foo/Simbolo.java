package Foo;

import java.util.LinkedList;

// Clase para implmentar el tipo de dato Simbolo
public class Simbolo {
	
	/* ENUMS */
	
	// Representacion del tipo simbolo con enum
	private enum Tipo_simbolo {
		PROGRAMA, VARIABLE, ACCION, PARAMETRO
	}
	
	// Representacion del tipo variable con enum
	private enum Tipo_variable {
		DESCONOCIDO, ENTERO, BOOLEANO, CHAR, CADENA 
	}
	
	// Representacion de la clase parametro con enum
	private enum Clase_parametro{
		VAL, REF 
	}
	
	/* ATRIBUTOS */
	
	// Representacion del nombre
	private String nombre;
	
	// Representacion del bloque de declaracion del simbolo
	private int nivel;
	
	// Representacion del tipo de simbolo
	private Tipo_simbolo tipo;
	
	// Representacion del tipo variable
	private Tipo_variable variable;
	
	// Representacion de la clase parametro
	private Clase_parametro parametro;
	
	// booleano para indicar si el simbolo es o no visible
	private boolean visible;
	
	// Lista de simbolos que representa los parametros de un simbolo
	private LinkedList<Tipo_simbolo> lista_parametros;
	
	// Representacion de la direccion del simbolo
	private long dir;
	
	
	/* GETTERS AND SETTERS */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public Tipo_simbolo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo_simbolo tipo) {
		this.tipo = tipo;
	}

	public Tipo_variable getVariable() {
		return variable;
	}

	public void setVariable(Tipo_variable variable) {
		this.variable = variable;
	}

	public Clase_parametro getParametro() {
		return parametro;
	}

	public void setParametro(Clase_parametro parametro) {
		this.parametro = parametro;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public LinkedList<Tipo_simbolo> getLista_parametros() {
		return lista_parametros;
	}

	public void setLista_parametros(LinkedList<Tipo_simbolo> lista_parametros) {
		this.lista_parametros = lista_parametros;
	}

	public long getDir() {
		return dir;
	}

	public void setDir(long dir) {
		this.dir = dir;
	}
	
	
	/* METODOS AUXILIARES PARA SIMBOLOS EN ANALISIS SEMANTICO */
	
	// Comprobar si simbolo es PROGRAMA
	boolean es_Simbolo_Programa(Tipo_simbolo tipo) {
		return tipo.equals(Tipo_simbolo.PROGRAMA);
	}
	
	
	// Comprobar si simbolo es VARIABLE
	boolean es_Simbolo_Variable(Tipo_simbolo tipo) {
		return tipo.equals(Tipo_simbolo.VARIABLE);
	}
	
	
	// Comprobar si simbolo es ACCION
	boolean es_Simbolo_Accion(Tipo_simbolo tipo) {
		return tipo.equals(Tipo_simbolo.ACCION);
	}
	
	
	// Comprobar si simbolo es PARAMETRO
	boolean es_Simbolo_Parametro(Tipo_simbolo tipo) {
		return tipo.equals(Tipo_simbolo.PARAMETRO);
	}
	
	
	/* METODOS AUXILIARES PARA TIPO_VARIABLE EN ANALISIS SINTACTICO */
	
	// Comprobar si variable es DESCONOCIDO
	boolean es_Variable_Desconocido(Tipo_variable tipo) {
		return tipo.equals(Tipo_variable.DESCONOCIDO);
	}
	
	
	// Comprobar si variable es ENTERO
	boolean es_Variable_Entero(Tipo_variable tipo) {
		return tipo.equals(Tipo_variable.ENTERO);
	}
	
	
	// Comprobar si variable es BOOLEANO
	boolean es_Variable_Booleano(Tipo_variable tipo) {
		return tipo.equals(Tipo_variable.BOOLEANO);
	}
	
	
	// Comprobar si variable es CHAR
	boolean es_Variable_Char(Tipo_variable tipo) {
		return tipo.equals(Tipo_variable.CHAR);
	}
	
	
	// Comprobar si variable es CADENA
	boolean es_Variable_Cadena(Tipo_variable tipo) {
		return tipo.equals(Tipo_variable.CADENA);
	}
	
	
	/* METODOS AUXILIARES PARA CLASE_PARAMETRO EN ANALISIS SINTACTICO */
	
	
	// Comprobar si variable es VAL
	boolean es_Parametro_Valor(Clase_parametro parametro) {
		return parametro.equals(Clase_parametro.VAL);
	}
	
	
	// Comprobar si variable es REF
	boolean es_Parametro_Referencia(Clase_parametro parametro) {
		return parametro.equals(Clase_parametro.REF);
	}
	
}
