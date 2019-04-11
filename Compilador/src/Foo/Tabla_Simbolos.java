package Foo;


import java.util.LinkedList;

import Foo.Simbolo.Clase_parametro;
import Foo.Simbolo.Tipo_variable;


public class Tabla_Simbolos {
	
	// Dimension de la tabla hash
	private final int dimension = 13;
	
	// Vector de tablas Hash
	LinkedList<Simbolo> [] tabla;
	
	
	public void inicializar_tabla() {
		tabla[dimension] = new LinkedList<Simbolo>();
	}
	
	
	public Simbolo buscar_simbolo(String nombre) {
		return null;
	}
	
	
	
	public Simbolo introducir_programa(String nombre, long dir) {
		return null;
		
	}
	
	
	public Simbolo introducir_varaible(String nombre, Tipo_variable variable, int nivel, long dir) {
		return null;
		
	}
	
	
	public Simbolo introducir_programa(String nombre, int dir){
		return null;
		
	} 

	public Simbolo introducir_variable(String nombre,  Tipo_variable variable, int nivel, int dir) {
		return null;
		
		
	} 
	
    public Simbolo introducir_accion (String nombre, int nivel, int dir) {
		return null;
    	
    }
	 

	 
	public Simbolo introducir_parametro (String nombre, Tipo_variable variable, 
											Clase_parametro parametro, int nivel, int dir) {
		return null;
		
	}
	 
	public void eliminar_programa() {
		
	} 
	
	public void eliminar_variables(int nivel) {
		 
	} 
	 
	public void ocultar_parametros(int nivel) { 
		
	} 
	
	public void eliminar_parametros_ocultos(int nivel) {
		
	}
	
	 public void eliminar_acciones(int nivel) {
		 
	 } 
}
