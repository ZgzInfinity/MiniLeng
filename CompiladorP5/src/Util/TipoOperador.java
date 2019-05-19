package Util;

public class TipoOperador {
	/* ENUMS */
	
	// Representacion del operador aditivo
	public enum Tipo_Operador_Aditivo {
		SUMA {
			@Override
	        public String toString() {
	            return "+";
	        }
		}, 
		RESTA {
			@Override
	        public String toString() {
	            return "-";
	        }
		}, 
		OR {
			@Override
	        public String toString() {
	            return "OR";
	        }
		};
	}
	 
	 
	// Representacion de operador multiplicativos
	public enum Tipo_Operador_Multiplicativo {
		MULTIPLICACION {
			@Override
	        public String toString() {
	            return "*";
	        }
		}, 
		DIVISION {
			@Override
	        public String toString() {
	            return "/";
	        }
		}, 
		MOD {
			@Override
	        public String toString() {
	            return "MOD";
	        }
		}, 
		AND {
			@Override
	        public String toString() {
	            return "AND";
	        }
		};
	}
	
	
	// Representacion de operador multiplicativos
	public enum Tipo_Operador_Relacional {
		 IGUAL {
			 @Override
		     public String toString() {
		        return "=";
		     }
		 }, 
		 MENOR {
			 @Override
		     public String toString() {
		        return "<";
		     }
		 }, 
		 MENOR_IGUAL {
			 @Override
		     public String toString() {
		        return "<=";
		     }
		 }, 
		 NO_IGUAL {
			 @Override
		     public String toString() {
		        return "<>";
		     }
		 }, 
		 MAYOR_IGUAL {
			 @Override
		     public String toString() {
		        return ">=";
		     }	 
		 },
		 MAYOR {
			 @Override
		     public String toString() {
		        return ">";
		     }
		 };
	}
	
	
	 // Almacenammiento del tipo de operador aditivo
	 private Tipo_Operador_Aditivo operadorAd;

	 // Almacenamiento del tipo de operador multiplicativo
	 private Tipo_Operador_Multiplicativo operadorMul;
	 
	// Almacenamiento del tipo de operador relacional
	private Tipo_Operador_Relacional operadorRel;
		 
	 

	/*
	 * Pre: ---
	 * Post: Ha devuelto el tipo de operador aditivo
	 */
	public Tipo_Operador_Aditivo getOperadorAditivo() {
		return operadorAd;
	}

	
	
	/*
	 * Pre: ---
	 * Post: Ha asignado a <<operador>> el tipo de operador aditivo <<operdorAd>>
	 */
	public void setOperadorAditivo(Tipo_Operador_Aditivo operadorAd) {
		this.operadorAd = operadorAd;
	} 
	
	
	/*
	 * Pre: ---
	 * Post: Ha devuelto el tipo de operador multiplicativo 
	 */
	public Tipo_Operador_Multiplicativo getOperadorMultiplicativo() {
		return operadorMul;
	}

	
	
	/*
	 * Pre: ---
	 * Post: Ha asignado a <<operadorul>> el tipo de operador multiplicaitvo <<operadorMul>>
	 */
	public void setOperadorMultiplicativo(Tipo_Operador_Multiplicativo operadorMul) {
		this.operadorMul = operadorMul;
	} 
	
	
	/*
	 * Pre: ---
	 * Post: Ha devuelto el tipo de operador relacional
	 */
	public Tipo_Operador_Relacional getOperadorRelacional() {
		return operadorRel;
	}


	/*
	 * Pre: ---
	 * Post: Ha asignado a <<operadorRel>> el tipo de operador relacional <<operdorRel>>
	 */
	public void setOperadorRelacional(Tipo_Operador_Relacional operadorRel) {
		this.operadorRel = operadorRel;
	}

	 
}
