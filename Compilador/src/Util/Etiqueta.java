/*
 ******************************************************
 *** Proyecto: 		Compilador de lenguaje MiniLeng
 *** Asignatura:	Procesadores de lenguajes
 *** Autor:			Rubén Rodríguez (ZgzInfinity)
 *** NIP:			737215
 *** Fecha:			3-6-2019
 ****************************************************** 
 */

package Util;

/*
 * Gestion de las etiquetas en ensamblador
 */

public class Etiqueta {
	
	 // Numero de etiqueta
	 static int numEtiqueta = -1;
	 
	 /*
	  * Pre: ---
	  * Post: Ha creado una nueva etiqueta con el tipo LN
	  */
	 public String nueva_etiqueta() {
		 	++numEtiqueta;
			return "L" + numEtiqueta;
	}
}
