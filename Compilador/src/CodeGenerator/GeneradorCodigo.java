package CodeGenerator;

public class GeneradorCodigo {
	
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
		public GeneradorCodigo codigo;

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
		public GeneradorCodigo getCodigo() {
			return codigo;
		}

		
		/*
		 * Pre: ---
		 * Post: Ha asignado el fragmento de codigo generado
		 */
		public void setCodigo(GeneradorCodigo codigo) {
			this.codigo = codigo;
		}
		
		
}
