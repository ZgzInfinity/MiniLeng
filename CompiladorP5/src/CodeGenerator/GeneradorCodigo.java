package CodeGenerator;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class GeneradorCodigo {
	
		// Inicio de direccion de pila
		static final int INICIAL = 3;
	
		// Nombre del programa
		public String nombre_prog;
		
		// Nivel actual de pila
		public int nivel;
		
		// Direccion
		public int dir;
		
		// Nipa
		public int OSF_s;
		
		// Numero de errores semanticos
		public int erroresSem;
		
		// Numero de errores sintacticos
		public int erroresSint;
		
		// Numero de errores lexicos
		public int erroresLex;
		
		// Generador de codigo
		public Codificador codigo;

		/*
		 * Pre: ---
		 * Post: Devuelve el nombre del programa
		 */
		public String getNombre_prog() {
			return nombre_prog;
		}

		/*
		 * Pre: --- 
		 * Post: Asigna como nombre de programa a <<nombre_prog>>
		 */
		public void setNombre_prog(String nombre_prog) {
			this.nombre_prog = nombre_prog;
		}

		
		/*
		 * Pre: ---
		 * Post: Devuelve el nivel actual 
		 */
		public int getNivel() {
			return nivel;
		}

		
		/*
		 * Pre: ---
		 * Post: Devuelve el nivel actual
		 */
		public void setNivel(int nivel) {
			this.nivel = nivel;
		}

		
		/*
		 * Pre: ---
		 * Post: Devuelve la dirrecion 
		 */
		public int getDir() {
			return dir;
		}

		
		/*
		 * Pre: ---
		 * Post: Asigna a dir el valor de <<dir>>
		 */
		public void setDir(int dir) {
			this.dir = dir;
		}

		public int getOSF_s() {
			return OSF_s;
		}

		public void setOSF_s(int oSF_s) {
			OSF_s = oSF_s;
		}

		
		/*
		 * Pre: ---
		 * Post: Devuelve el numero de errores semanticos
		 */
		public int getErroresSem() {
			return erroresSem;
		}

		
		/*
		 * Pre: ---
		 * Post: Ha asignado el numero de errores semanticos
		 */
		public void setErroresSem(int erroresSem) {
			this.erroresSem = erroresSem;
		}

		/*
		 * Pre: ---
		 * Post: Devuelve el numero de errores sintacticos
		 */
		public int getErroresSint() {
			return erroresSint;
		}

		
		/*
		 * Pre: ---
		 * Post: Ha asignado el numero de errores sintacticos
		 */
		public void setErroresSint(int erroresSint) {
			this.erroresSint = erroresSint;
		}

		
		/*
		 * Pre: ---
		 * Post: Devuelve el numero de errores lexicos
		 */
		public int getErroresLex() {
			return erroresLex;
		}

		
		/*
		 * Pre: ---
		 * Post: Ha asignado el numero de errores lexicos
		 */
		public void setErroresLex(int erroresLex) {
			this.erroresLex = erroresLex;
		}

		
		/*
		 * Pre: ---
		 * Post: Ha devuelto el fragmento de codigo generado
		 */
		public Codificador getCodigo() {
			return codigo;
		}

		
		/*
		 * Pre: ---
		 * Post: Ha asignado el fragmento de codigo generado
		 */
		public void setCodigo(Codificador codigo) {
			this.codigo = codigo;
		}
		
		
		/*
		 * Pre: ---
		 * Post: Inicializar la direccion de la pila con valor 3
		 */
		public void setDireccionInicial(){
			this.dir = INICIAL;
		}
		
		
		/*
		 * Pre:
		 * Post: Crea un fichero de texto de nombre <<nombre.vscode>>
		 */
		public void generarCodigoPrograma(String name) throws FileNotFoundException, UnsupportedEncodingException {
			codigo = new Codificador(name);
		}
		
}
