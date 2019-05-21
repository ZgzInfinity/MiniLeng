package Util;

public class Etiqueta {

	static int numEtiqueta = -1;
			
	public Etiqueta() {
		numEtiqueta++;
	}
	
	
	public int getNumEtiqueta() {
		return numEtiqueta;
	}

	public void setNumEtiqueta(int numEtiqueta) {
		numEtiqueta = numEtiqueta;
	}
	
	public String getEtiqueta() {
		String cadena = "L" + numEtiqueta;
		return cadena;
	}
	
}
