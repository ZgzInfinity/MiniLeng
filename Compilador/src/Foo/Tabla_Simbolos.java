package Foo;


import java.util.ArrayList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Foo.Simbolo.Clase_parametro;
import Foo.Simbolo.Tipo_variable;
import Foo.Simbolo.Tipo_simbolo;
import Foo.SimboloNoEncontradoException;

public class Tabla_Simbolos {
	
	// Dimension de la tabla hash
	private final int DIMENSION_TABLA = 10;
	private int T[];
	
	// Vector de tablas Hash
	static ArrayList<LinkedList<Simbolo>> tabla;
	
	
	// Variable estatica que almacena el tipo de dato
	static Tipo_variable tipoVariable = null;
	
	// Variable estatica que almacena el tipo de dato
	static Clase_parametro tipoParametro = null; 
	
	// Declaracion de una lista estatica de identificadores
	static LinkedList<String> listaIdentificadores = new LinkedList<String>();
	
	// Declaracion de una lista estatica de identificadores
	static LinkedList<Tipo_simbolo> listaBloques = new LinkedList<Tipo_simbolo>();
	

	/*
	 * Pre: ---
	 * Post: Asigna el tipo de variable que se ha leido 
	 * 		 DESCONOCIDO, ENTERO, BOOLEANO, CHAR, CADENA
	 */
	public void setTipo_variable(Tipo_variable tp_V) {
		Tabla_Simbolos.tipoVariable = tp_V;
	}
	
	
	
	/*
	 * Pre: ---
	 * Post: Asigna la clase de parametro que se ha leido
	 * 		 DESCONOCIDO, ENTERO, BOOLEANO, CHAR, CADENA
	 */
	public void setClase_parametro(Clase_parametro tp_Par) {
		Tabla_Simbolos.tipoParametro = tp_Par;
	}
	
	
	/*
	 * Pre ---
	 * Post: Ha asignado la lista <<lista>> a la lista de identificadores
	 */
	public void setListaIdentificadores(LinkedList<String> lista) {
		Tabla_Simbolos.listaIdentificadores = lista;
	}
	
	
	/*
	 * Pre: ---
	 * Post: Ha incorporado el identificador <<i>> en la ultima posicion de la lista
	 */
	public void anyadirIdentificador(String i) {
		Tabla_Simbolos.listaIdentificadores.add(i);
	}
	
	
	/*
	 * Pre ---
	 * Post: Ha asignado la lista <<lista>> a la lista de identificadores
	 */
	public void anyadirBloque(Tipo_simbolo tp_Sim) {
		// Añade nuevo bloque en la ultima posicion
		Tabla_Simbolos.listaBloques.add(tp_Sim);
	}
	
	
	/*
	 * Pre ---
	 * Post: Ha asignado la lista <<lista>> a la lista de identificadores
	 */
	public void eliminarBloque(Tipo_simbolo tp_Sim) {
		// Borra el ultimo bloque añadido
		Tabla_Simbolos.listaBloques.removeLast();
	}
	
	
	
	/*
	 * Pre: ---
	 * Post: Ha devuelto el tipo de variable leida
	 */
	public Tipo_variable getTipo_variable() {
		return Tabla_Simbolos.tipoVariable;
	}
	
	
	/*
	 * Pre: ---
	 * Post: Ha devuelto el tipo de clase de parametro leido
	 */
	public Clase_parametro getClase_parametro() {
		return Tabla_Simbolos.tipoParametro;
	}
	
	
	
	/*
	 * Pre: ---
	 * Post: Ha devuelto la lista de identificadores leidos
	 */
	public LinkedList<String> getListaIdentificadores() {
		return Tabla_Simbolos.listaIdentificadores;
	}
	
	/*
	 * Pre: ---
	 * Post: Ha eliminado el contenido de la lista de identificadores leidos
	 */
	public void limpiarListaIdentificadores() {
		Tabla_Simbolos.listaIdentificadores.clear();
	}
	
	
	
	/*
	 * Pre: ---
	 * Post: Devuelve <<true>> si y solo si la lista de indice <<i>>
	 * 		 esta vacia. En caso contrario devuelve <<false>>
	 */
	private boolean esEntradaVacia(int i) {
		return tabla.get(i).isEmpty();
	}
	
	
	
	/* 
	 * Funcion de hash de Pearson que emplea una tabla auxiliar con los
	 * indices ordenados de modo aleatorio 
	 */
	private int hash_function(String s) {
		int h = 0;
		for (int i = 0; i < s.length() ; i++) {
			h = T[(h ^ s.charAt(i)) % DIMENSION_TABLA];
		}
		return h;
	}
	
	
	
	/* 
	 * Funcion para poder mezclar un vector de manera 
	 * totalmente aleatoria 
	 */
	private static void mezclar(int[] vector){
	    Random rnd = ThreadLocalRandom.current();
	    for (int i = vector.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      int a = vector[index];
	      vector[index] = vector[i];
	      vector[i] = a;
	    }
	 }
	
	
	private void anyadir(String nombre, Simbolo s) {
		int h = hash_function(nombre);
		LinkedList<Simbolo> lista = tabla.get(h);
		if (lista == null) {
			lista = new LinkedList<Simbolo>();
		}
		else {
			lista.add(s);
			tabla.add(h, lista);
		}
	}
	
	
	/*
	 * Crea una tabla de símbolos vacía.Este procedimiento 
	 * debe invocarse antes de hacer ninguna operación con la tabla de símbolos. 
	 */
	public void inicializar_tabla() {
		tabla = new ArrayList<LinkedList<Simbolo>>(DIMENSION_TABLA);
		this.T = new int[DIMENSION_TABLA];
		for (int i = 0; i < DIMENSION_TABLA; i++) {
			tabla.add(new LinkedList<Simbolo>());
			T[i] = i;
		}
		mezclar(T);
	}
	
	
	/*
	 * Busca en la tabla el símbolo de mayor nivel cuyo nombre coincida con el 
	 * del parametro (se distinguen minúsculas y mayúsculas). Si existe, devuelve un 
	 * puntero como resultado, de lo contrario lanza una excepción
	 */
	public Simbolo buscar_simbolo(String nombre) throws SimboloNoEncontradoException { 
		Simbolo ret = null;
		int h = hash_function(nombre);
		if(tabla.get(h) != null) {
			int max_nivel = -1;
			// Busco en la lista enlazada el simbolo de mayor nivel 
			for (Simbolo s : tabla.get(h)) {
				if (s.getNombre().equals(nombre) && s.getNivel() > max_nivel) {
					max_nivel = s.getNivel();
					ret = s;
				}
			}
		}
		if (ret == null) {
			throw new SimboloNoEncontradoException();
		}
		return ret;
	}
	
	
	
	/*
	 * Introduce en la tabla un simbolo PROGRAMA,  con el nombre del parametro, de nivel 0, 
	 * con la direccion del parametro. Dado que debe ser el primer simbolo a introducir no se verfica 
	 * que el simbolo exista. 
	 */
	public Simbolo introducir_programa(String nombre, long dir) {
		Simbolo s = new Simbolo(Tipo_simbolo.PROGRAMA, null, null, nombre, 0, dir);
		anyadir(nombre, s);
		System.out.println(s.toString());
		return s;
	}
	
	
	
	
	/*
	 * Si existe un símbolo en la tabla del mismo nivel y con el mismo nombre, devuelve NULL 
	 * De lo contrario, introduce un símbolo VARIABLE (simple) con los datos de los argumentos. 
	 */
	public Simbolo introducir_variable(String nombre, Tipo_variable variable, int nivel, long dir) throws VariableRepetidaException {
		try {
			Simbolo esta = buscar_simbolo(nombre);
			if (esta.getNivel() == nivel) {
				// Hay un simbolo accion con el mismo nivel y el mismo nombre en la tabla
				throw new VariableRepetidaException();
			}
			else {
				// Hay un simbolo variable en la lista pero con distinto nivel
				Simbolo s = new Simbolo(Tipo_simbolo.VARIABLE, variable, null, nombre, nivel, dir);	
				anyadir(nombre, s);
				System.out.println(s.toString());
				return s;
			}
		}
		catch (SimboloNoEncontradoException e) {
			// No hay ningun simbolo variable en la tabla
			Simbolo s = new Simbolo(Tipo_simbolo.VARIABLE, variable, null, nombre, nivel, dir);
			anyadir(nombre, s);
			System.out.println(s.toString());
			return s;
		}
	}
	
	
	
	/*
	 * Si existe un símbolo en la tabla del mismo nivel y con el mismo nombre, devuelve NULL. 
	 *  De lo contrario, introduce un símbolo ACCION con los datos de los argumentos. 
	 */
    public Simbolo introducir_accion(String nombre, int nivel, long dir) throws AccionRepetidaException {
    	try {
    		Simbolo esta = buscar_simbolo(nombre);
    		if (esta.getNivel() == nivel) {
				// Hay un simbolo accion con el mismo nivel y el mismo nombre en la tabla
				throw new AccionRepetidaException();
			}
			// Hay un simbolo accion con el mismo nombre pero distinto nivel
			Simbolo s = new Simbolo(Tipo_simbolo.ACCION, null, null, nombre, nivel, dir	);	
			anyadir(nombre, s);
			System.out.println(s.toString());
			return s;
		}	
    	catch (SimboloNoEncontradoException e) {
    		// No hay ningun simbolo accion en la tabla
    		Simbolo s = new Simbolo(Tipo_simbolo.ACCION, null, null, nombre, nivel, dir	);	
   			anyadir(nombre, s);
   			System.out.println(s.toString());
    		return s;
		}
    }
	 

    /*
     * Si existe un símbolo en la tabla del mismo nivel y con el mismo nombre, devuelve NULL. 
     *  De lo contrario, introduce un símbolo PARAMETRO con los datos de los argumentos. 
     */
	public Simbolo introducir_parametro (String nombre, Tipo_variable variable, 
											Clase_parametro parametro, int nivel, long dir) throws ParametroRepetidoException {
		try {
			Simbolo esta = buscar_simbolo(nombre);
			if (esta.getNivel() == nivel) {
				// Hay un simbolo parametro con el mismo nivel y el mismo nombre en la tabla
				throw new ParametroRepetidoException();
			}
			else {
				// Hay un simbolo identico en nombre pero con distinto nivel
				Simbolo s = new Simbolo(Tipo_simbolo.PARAMETRO, variable, parametro, nombre, nivel,	dir	);
				anyadir(nombre, s);
				System.out.println(s.toString());
				return s;
		    }
		}
		catch (SimboloNoEncontradoException e) {
			// No ha encontrado ningun simbolo parametro identico 
			Simbolo s = new Simbolo(Tipo_simbolo.PARAMETRO, variable, parametro, nombre, nivel,	dir	);
			anyadir(nombre, s);
			System.out.println(s.toString());
			return s;
		}
	}
	 
	
	
	
	/*
	 * Elimina de la tabla todos los símbolos PROGRAMA de nivel 0
	 */
	public void eliminar_programa() {
		for (LinkedList<Simbolo> ls : tabla) {
			for (Simbolo s : ls) {
				if(s.es_Simbolo_Programa() && s.getNivel() == 0) {
					ls.remove(s);
				}	
			}
		}
	} 
	
	
	
	
	/*
	 * Elimina de la tabla todas las variables que sean del nivel del argumento
	 * No elimina los parametros
	 */
	public void eliminar_variables(int nivel) {
		Iterator<LinkedList<Simbolo>> i = tabla.iterator();
		while (i.hasNext()) {
			LinkedList<Simbolo> l = i.next();
			Iterator<Simbolo> simb = l.iterator();
			while (simb.hasNext()) {
				Simbolo s = simb.next();
				if(s.es_Simbolo_Variable() && s.getNivel() == nivel) {
					simb.remove();
				}
			}

		}
	} 
	
	
	
	/*
	 * Marca todos los parametros de un nivel como ocultos para 
	 * que no puedan ser encontrados, pero se mantenga la definicion 
	 * completa de la accion donde están declarados para verificacion 
	 * de invocaciones a la accion. 
	 */
	public void ocultar_parametros(int nivel) { 
		for (LinkedList<Simbolo> ls : tabla) {
			for ( Simbolo s : ls) {
				if(s.es_Simbolo_Parametro() && s.getNivel() == nivel) {
					s.setVisible(false);
				}	
			}
		}
	 } 
	
	
	
	/*
	 * Elimina de la tabla todas los parámetros que hayan sido ocultados previamente.  
	 * Los procedimientos y funciones donde estaban declarados deben ser eliminados
	 * tambien para mantener la coherencia de la tala
	 */
	public void eliminar_parametros_ocultos(int nivel) {
		Iterator<LinkedList<Simbolo>> i = tabla.iterator();
		while (i.hasNext()) {
			LinkedList<Simbolo> l = i.next();
			Iterator<Simbolo> simb = l.iterator();
			while (simb.hasNext()) {
				Simbolo s = simb.next();
				if(s.es_Simbolo_Parametro() && s.getNivel() == nivel && !s.isVisible()) {
					simb.remove();
				}
			}
		}
	 }
	
	
	
	 /*
	  * Elimina de la tabla todas los procedimientos de un nivel.
	  * Los procedimientos y funciones donde estaban declarados deben ser eliminados
	  * tambien para mantener la coherencia de la tala
	  */
	 public void eliminar_acciones(int nivel) {
		 Iterator<LinkedList<Simbolo>> i = tabla.iterator();
			while (i.hasNext()) {
				LinkedList<Simbolo> l = i.next();
				Iterator<Simbolo> simb = l.iterator();
				while (simb.hasNext()) {
					Simbolo s = simb.next();
					if(s.es_Simbolo_Accion() && s.getNivel() == nivel) {
						simb.remove();
					}
				}
			}
	 }
	 
	 
	 
	 
	 /*
	  * Pre: ----
	  * Post: Muestra por pantalla el contenido actual de la tabla de simbolos
	  */
	 public void mostrarTabla_Simbolos(){
		// Recorrido de las entradas de la tabla por filas
		 for (int i = 0; i < tabla.size(); i++) {
			 // Coge la i-ésima lista de simbolos
			 
			 LinkedList<Simbolo> listaAuxiliar = tabla.get(i);
			 
			 // Si la lista no esta vacia
				 // Recorrido por columnas de las listas asociadas
				 for (int j = 0; j < listaAuxiliar.size(); j++) {
					 // Coge el simbolo j-ésimo de la lista iésima
					 Simbolo s = listaAuxiliar.get(j);
					 
					 // Generar cadena con el simbolo
					 String cadena = s.toString();
					 
					 // Muestreo por pantalla del simbolo
					 System.out.println("Fila: " + i + " Columna: " + j + "\n" +
							 			"Simbolo: " + cadena + "\n");
				 }
			 
		 }
	 }
}
