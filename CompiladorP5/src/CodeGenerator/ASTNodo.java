package CodeGenerator;

import Util.Simbolo.Clase_parametro;
import Util.Simbolo.Tipo_variable;
import Util.TipoOperador;

public class ASTNodo {

	// Tipo de nodo 
	TipoNodo tipo;
	
	// Tipo de operador
	TipoOperador tipoOp;
	
	// Tipo de variable
	Tipo_variable tipoVar;
	
	// Clase de parametro
	Clase_parametro tipoParametro;
	
	// Nombre
	String nombre;
	
	// Valor
	int	valor;
	
	// Campo de direccion
	long dir;
	
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

	
	public ASTNodo(String nombre, int nivel, TipoNodo tipo) {
		super();
		this.nivel = nivel;
		this.tipo = tipo;
		this.nombre = nombre;
	}
	
	public ASTNodo(int valor, int nivel, TipoNodo tipo) {
		super();
		this.nivel = nivel;
		this.tipo = tipo;
		this.valor = valor;
	}
	public ASTNodo(TipoNodo tipo) {
		super();
		this.tipo = tipo;
	}
	public ASTNodo(String nombre, int nivel, Tipo_variable tipoVar) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
		this.tipo = TipoNodo.VAR;
		this.tipoVar = tipoVar;
	}
	public ASTNodo(String nombre, int valor) {
		super();
		this.nombre = nombre;
		this.valor = valor;
	}
	public ASTNodo(String nombre, int nivel, long dir) {
		super();
		this.nivel = nivel;
		this.nombre = nombre;
		this.dir = dir;
	}

	
	public ASTNodo() {
		this.tipo = null;
		this.tipoOp = null;
		this.nombre = "";
		this.valor = 0;
		this.cond = null;
		this.izquierda = null;
		this.derecha = null;	
		this.siguiente = null;
		this.negar_valor = false;
		this.dir = 0;
		this.nivel = 0;
		this.tipoVar = null;
		this.tipoParametro = null;
	}
	

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
	public TipoOperador getTipoOp() {
		return tipoOp;
	}

	
	/*
	 * Pre: ---
	 * Post: Asigna como operador del nodo el valor <<tipoOp>>
	 */
	public void setTipoOp(TipoOperador tipoOp) {
		this.tipoOp = tipoOp;
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
	 * Post: Asigna como parametro de nodo el valor <<tipoParametroetro>>
	 */
	public void setTipoParametro(Clase_parametro tipoParametroetro) {
		this.tipoParametro = tipoParametroetro;
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
	public long getDir() {
		return dir;
	}

	
	/*
	 * Pre: ---
	 * Post: Asigna como direccion de nodo el valor <<dir>>
	 */
	public void setDir(long dir) {
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
