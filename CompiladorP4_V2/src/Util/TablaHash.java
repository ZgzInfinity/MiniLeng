/*
 * Implementacion de la tabla Hash 
 */

package Util;

import java.util.Enumeration;

public class TablaHash {
	
	/* Tablas Hash de los tokens y de los identificadores */
	static java.util.Hashtable<String, Integer> tokensNormales = new java.util.Hashtable<String, Integer>();
	static java.util.Hashtable<String, Integer> identificadores = new java.util.Hashtable<String, Integer>();
	
	/*
	 * Añadir token a la tabla
	 */
	public static void anyadirHashTokens(String tok) {
		if(tokensNormales.containsKey(tok)) {
			/* no esxiste el token */
			int valor;
			valor = tokensNormales.get(tok);
			tokensNormales.put(tok, valor + 1);
		}
		else {
			tokensNormales.put(tok, 1);
		}
	}
	
	
	/*
	 * Añadir identificador a la tabla
	 */
	public static void anyadirHashIdentificadores(String ident) {
		if(identificadores.containsKey(ident)) {
			/* no esxiste el token */
			int valor;
			valor = identificadores.get(ident);
			identificadores.put(ident, valor + 1);
		}
		else {
			identificadores.put(ident, 1);
		}
	}
	
	
	public static void mostrarTokensNormales() {
		System.out.println("Total de apariciones de tokens");
		System.out.println("--------------------------------");
		Enumeration<String> e = tokensNormales.keys();
		String clave;
		Integer valor;
		while(e.hasMoreElements()){
		  clave = e.nextElement();
		  valor = tokensNormales.get(clave);
		  System.out.println( "Clave : " + clave + " Apariciones : " + valor );
		}
		System.out.print("\n");
	}
	
	
	public static void mostrarIdentificadores() {
		System.out.println("Total de apariciones de identificadores");
		System.out.println("---------------------------------------");
		identificadores.keys();
		Enumeration<String> e = identificadores.keys();
		String clave;
		Integer valor;
		while(e.hasMoreElements()){
		  clave = e.nextElement();
		  valor = identificadores.get(clave);
		  System.out.println( "Clave : " + clave + " Apariciones : " + valor );
		}
		System.out.print("\n");
	}
	
}