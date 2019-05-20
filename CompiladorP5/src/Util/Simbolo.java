package Util;

import java.util.LinkedList;

import CodeGenerator.ASTNodo;
import CodeGenerator.GeneradorCodigo;

// Clase para implmentar el tipo de dato Simbolo
public class Simbolo {
	
	/* ENUMS */
	
	// Representacion del tipo simbolo con enum
	 public enum Tipo_simbolo {
		PROGRAMA {
			@Override
	        public String toString() {
	            return "PROGRAMA";
	        }
		}, 
		VARIABLE {
			@Override
	        public String toString() {
	            return "VARIABLE";
	        }
		}, 
		ACCION {
			@Override
	        public String toString() {
	            return "ACCION";
	        }
		}, 
		PARAMETRO {
			@Override
	        public String toString() {
	            return "PARAMETRO";
	        }
		}, 
		CONST {
			@Override
	        public String toString() {
	            return "CONSTANTE";
	        }
		}
	}
	
	// Representacion del tipo variable con enum
	public enum Tipo_variable {
		DESCONOCIDO {
			@Override
	        public String toString() {
	            return "DESCONOCIDO";
	        }
		}, 
		ENTERO {
			@Override
	        public String toString() {
	            return "ENTERO";
	        }
		}, 
		BOOLEANO {
			@Override
	        public String toString() {
	            return "BOOLEANO";
	        }
		}, 
		CHAR {
			@Override
	        public String toString() {
	            return "CARACTER";
	        }
		},
		CADENA {
			@Override
	        public String toString() {
	            return "CADENA";
	        }
		}
	}
	
	// Representacion de la clase parametro con enum
	public enum Clase_parametro{
		VAL {
			@Override
	        public String toString() {
	            return "VALOR";
	        }
		}, 
		REF {
			@Override
	        public String toString() {
	            return "REFERENCIA";
	        }
		}
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
	private LinkedList<Simbolo> lista_parametros;
	
	// Representacion de la direccion del simbolo
	private long dir;
	
	// Etiqueta del nodo
	String etiqueta;
	


	// CONSTRUCTOR DEL DATO SIMBOLO
	public Simbolo (Tipo_simbolo tipo, Tipo_variable variable, Clase_parametro parametro,
							String nombre, int nivel, long dir) {
			this.tipo = tipo;
			this.variable = variable;
			this.parametro = parametro;
			this.nombre = nombre;
			this.nivel = nivel;
			this.visible = true;
			this.dir = dir;
			this.lista_parametros = new LinkedList<Simbolo>();
	}
	
	
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

	public LinkedList<Simbolo> getLista_parametros() {
		return lista_parametros;
	}

	public void setLista_parametros(LinkedList<Simbolo> lista_parametros) {
		this.lista_parametros = lista_parametros;
	}

	public long getDir() {
		return dir;
	}

	public void setDir(long dir) {
		this.dir = dir;
	}
	
	
	public String getEtiqueta() {
		return etiqueta;
	}


	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	
	
	/* METODOS AUXILIARES PARA SIMBOLOS EN ANALISIS SEMANTICO */
	
	// Comprobar si simbolo es PROGRAMA
	public boolean es_Simbolo_Programa() {
		return tipo.equals(Tipo_simbolo.PROGRAMA);
	}
	
	
	// Comprobar si simbolo es VARIABLE
	public boolean es_Simbolo_Variable() {
		return tipo.equals(Tipo_simbolo.VARIABLE);
	}
	
	
	// Comprobar si simbolo es ACCION
	public boolean es_Simbolo_Accion() {
		return tipo.equals(Tipo_simbolo.ACCION);
	}
	
	
	// Comprobar si simbolo es PARAMETRO
	public boolean es_Simbolo_Parametro() {
		return tipo.equals(Tipo_simbolo.PARAMETRO);
	}
	
	
	/* METODOS AUXILIARES PARA TIPO_VARIABLE EN ANALISIS SINTACTICO */
	
	// Comprobar si variable es DESCONOCIDO
	public boolean es_Variable_Desconocido() {
		return tipo.equals(Tipo_variable.DESCONOCIDO);
	}
	
	
	// Comprobar si variable es ENTERO
	public boolean es_Variable_Entero() {
		return tipo.equals(Tipo_variable.ENTERO);
	}
	
	
	// Comprobar si variable es BOOLEANO
	public boolean es_Variable_Booleano() {
		return tipo.equals(Tipo_variable.BOOLEANO);
	}
	
	
	// Comprobar si variable es CHAR
	public boolean es_Variable_Char() {
		return tipo.equals(Tipo_variable.CHAR);
	}
	
	
	// Comprobar si variable es CADENA
	public boolean es_Variable_Cadena() {
		return tipo.equals(Tipo_variable.CADENA);
	}
	
	
	/* METODOS AUXILIARES PARA CLASE_PARAMETRO EN ANALISIS SINTACTICO */
	
	
	// Comprobar si variable es VAL
	public boolean es_Parametro_Valor() {
		return parametro.equals(Clase_parametro.VAL);
	}
	
	
	// Comprobar si variable es REF
	public boolean es_Parametro_Referencia() {
		return parametro.equals(Clase_parametro.REF);
	}


	@Override
	public String toString() {
		// Mostrar el simbolo por pantalla
		return "Simbolo [nombre=" + nombre + ", nivel=" + nivel + ", tipo=" + tipo + ", variable=" + variable
				+ ", parametro=" + parametro + ", visible=" + visible + ", lista_parametros=" + mostrarParametros()
				+ ", dir=" + dir + "]";
	}
	
	
	/*
	 * Pre: <<listaDeParametros>> es una lista de parametros asociados a una accion
	 * Post: Ha asignado a la lista de parametros de la accion la lista <<listaDeParametros>>
	 */
	public LinkedList<ASTNodo> anyadirParametrosAccion(LinkedList<Simbolo> listaDeParametros, GeneradorCodigo genCod){
		// Calculo del numero de parametros de la accion
		int dimension = listaDeParametros.size();
		Simbolo s;
		
		// Lista de nodos ASTNodo
		LinkedList<ASTNodo> nodosParametros = new LinkedList<ASTNodo>();
		ASTNodo aux = new ASTNodo();
		
		long direccion;
		
		for (int i = 0; i < dimension; i++) {
			// Extraccion del simbolo
			s = listaDeParametros.get(i);
			
			// Crear nuevo ASTNodo a incorporar en la lista
	        aux = new ASTNodo(s.getNombre(),s.getNivel(), s.getVariable());
	        aux.setTipoParametro(s.getParametro());
	        aux.setDir(genCod.dir);
	            	        
	        // Sumo a dir del simbolo para hacer la llamada OSF
			direccion = this.getDir() + ((s.getParametro() == Simbolo.Clase_parametro.REF) ? 1 : 2);
	        this.setDir(direccion);
	        
	        // Anyadir nodoAST parametro a la lista 
	        nodosParametros.add(aux);
	        
			this.lista_parametros.add(s);
		}
		
		// Devolucion de la lista de parametros
		return nodosParametros;
	}
	
	
	/*
	 * Pre: ---
	 * Post Ha mostrado por pantalla los parametros de la accion
	 */
	String mostrarParametros() {
		String resultado = "[";
		int dim = this.lista_parametros.size();
		Simbolo s;
		for (int i = 0; i < dim; i++) {
			s = this.lista_parametros.get(i);
			if ( i != dim - 1) {
				resultado += s.getNombre() + " , ";
			}
			else {
				resultado += s.getNombre();
			}
		}
		resultado += "]";
		return resultado;
	}
	
	
}
