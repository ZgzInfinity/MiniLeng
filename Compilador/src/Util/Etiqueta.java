package Util;

public class Etiqueta {
	
	 static int numEtiqueta = -1;
	 
	 public String nueva_etiqueta() {
		 	++numEtiqueta;
			return "L" + numEtiqueta;
	}
}
