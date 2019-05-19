package Util;

import Util.Simbolo.Clase_parametro;
import Util.Simbolo.Tipo_variable;

public class ASTNodo {

	// Tipo de nodo 
	TipoNodo tipo;
	
	// Tipo de operador
	TipoOperador typeOp;
	
	// Tipo de variable
	Tipo_variable tipoVar;
	
	// Clase de parametro
	Clase_parametro tipoParametro;
	
	// Nombre
	String nombre;
	
	// Valor
	int	valor;
	
	// Campo de direccion
	int	dir;
	
	// Nivel del nodo
	int nivel;
	
	// Control de negacion 
	boolean	negar_valor;
	
	// Condicion solo para el WHILE y el IF_ELSE 
	ASTNodo	cond;	
	
	// Asignacion izquierda
	ASTNodo	izquierda;

	// Asignacion derecha
	ASTNodo	derecha;
	
	// Siguiente instruccion
	ASTNodo	siguiente;  // Indica la siguiente instruccion
	

	/*
	 * Enum para determinar el tipo de nodo que se ha procesado
	 */
	public enum TipoNodo {
	   DSG , ACC, WHILE, IF, OP, ASG, FUN, RD, WR, VAR, COND, ENTCAR, CARENT, CONST, INVOCACION
	}
	
	/*
	 * Pre: ---
	 * Post: Devuelve el tipo de nodo
	 */
	public TipoNodo getTipo() {
		return tipo;
	}

	
	/*
	 * Pre: ---
	 * Post: Asigna como tipo de nodo el valor <<tipo>>
	 */
	public void setTipo(TipoNodo tipo) {
		this.tipo = tipo;
	}

	
	/*
	 * Pre: ---
	 * Post: Devuelve el tipo de operador
	 */
	public TipoOperador getTypeOp() {
		return typeOp;
	}

	
	/*
	 * Pre: ---
	 * Post: Asigna como operador del nodo el valor <<tipoOp>>
	 */
	public void setTypeOp(TipoOperador tipoOp) {
		this.typeOp = tipoOp;
	}

	
	/*
	 * Pre: ---
	 * Post: Devuelve el tipo de variable
	 */
	public Tipo_variable getTipoVar() {
		return tipoVar;
	}

	
	/*
	 * Pre: ---
	 * Post: Asigna como variable de nodo el valor <<tipoVar>>
	 */
	public void setTipoVar(Tipo_variable tipoVar) {
		this.tipoVar = tipoVar;
	}

	
	/*
	 * Pre: ---
	 * Post: Devuelve el tipo de parametro
	 */
	public Clase_parametro getTipoParametro() {
		return tipoParametro;
	}
	
	
	/*
	 * Pre: ---
	 * Post: Asigna como parametro de nodo el valor <<tipoParametro>>
	 */
	public void setTipoParametro(Clase_parametro tipoParametro) {
		this.tipoParametro = tipoParametro;
	}

	
	/*
	 * Pre: ---
	 * Post: Devuelve el nombre del nodo
	 */
	public String getNombre() {
		return nombre;
	}

	
	/*
	 * Pre: ---
	 * Post: Asigna como nombre de nodo el valor <<nombre>>
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	/*
	 * Pre: ---
	 * Post: Devuelve el valor del nodo
	 */
	public int getValor() {
		return valor;
	}

	
	/*
	 * Pre: ---
	 * Post: Asigna como valor de nodo el valor <<valor>>
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	
	/*
	 * Pre: ---
	 * Post: Devuelve la direccion del nodo
	 */
	public int getDir() {
		return dir;
	}

	
	/*
	 * Pre: ---
	 * Post: Asigna como direccion de nodo el valor <<dir>>
	 */
	public void setDir(int dir) {
		this.dir = dir;
	}

	
	/*
	 * Pre: ---
	 * Post: Devuelve el nivel del nodo
	 */
	public int getNivel() {
		return nivel;
	}

	
	/*
	 * Pre: ---
	 * Post: Asigna como nivel de nodo el valor <<nivel>>
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	
	/*
	 * Pre: ---
	 * Post: Devuelve el valor negado del nodo
	 */
	public boolean isNegar_valor() {
		return negar_valor;
	}

	
	/*
	 * Pre: ---
	 * Post: Asigna como valor negado de nodo el valor <<negar_valor>>
	 */
	public void setNegar_valor(boolean negar_valor) {
		this.negar_valor = negar_valor;
	}

	
	/*
	 * Pre: ---
	 * Post: Devuelve la condicion del nodo
	 */
	public ASTNodo getCond() {
		return cond;
	}

	
	/*
	 * Pre: ---
	 * Post: Asigna como condicion de nodo el valor <<cond>>
	 */
	public void setCond(ASTNodo cond) {
		this.cond = cond;
	}

	
	/*
	 * Pre: ---
	 * Post: Devuelve el nodo hijo izquierdo
	 */
	public ASTNodo getIzquierda() {
		return izquierda;
	}

	
	/*
	 * Pre: ---
	 * Post: Asigna como nodo izquierdo de nodo el valor <<izquierda>>
	 */
	public void setIzquierda(ASTNodo izquierda) {
		this.izquierda = izquierda;
	}

	
	/*
	 * Pre: ---
	 * Post: Devuelve el nodo hijo derecha
	 */
	public ASTNodo getDerecha() {
		return derecha;
	}

	
	/*
	 * Pre: ---
	 * Post: Asigna como nodo derecho de nodo el valor <<derecha>>
	 */
	public void setDerecha(ASTNodo derecha) {
		this.derecha = derecha;
	}

	
	/*
	 * Pre: ---
	 * Post: Devuelve el nodo hijo siguiente
	 */
	public ASTNodo getSiguiente() {
		return siguiente;
	}

	
	/*
	 * Pre: ---
	 * Post: Asigna como nodo siguiente de nodo el valor <<siguiente>>
	 */
	public void setSiguiente(ASTNodo siguiente) {
		this.siguiente = siguiente;
	}
	
	


}
