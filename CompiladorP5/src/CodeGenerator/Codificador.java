package CodeGenerator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import Util.TipoOperador.Tipo_Operador_Aditivo;
import Util.Simbolo;

public class Codificador {

	private int num_etiqueta;
	private PrintWriter writer = null;
	private static final String FILEPATH = "codigo/";
	
	public Codificador(String nombre) throws FileNotFoundException, UnsupportedEncodingException {
		num_etiqueta = 0;
		writer = new PrintWriter(FILEPATH + nombre + ".code", "UTF-8");
	}
	
	public void cerrar() {
		writer.close();
	}
	
	public String nueva_etiqueta() {
		return "L" + ++num_etiqueta;
	}
		
	public void escribir(String msg) {
		writer.println(msg);
	}
	
	public void escribir(ASTNodo tree) {
		ASTNodo instr = tree;
		String label1 = null, label2 = null;
		int f, o;
		while(instr != null) {
			switch (instr.getTipo()) {
			case ASG:
				
				ASTNodo var = instr.getIzquierda();
				f = instr.getNivel() - var.getNivel();
				o = var.getDir();
				writer.println("; Direccion " + var.getNombre());
				writer.println("\tSRF\t" + f + "\t" + o);
				if(var.getTipoParametro() == Simbolo.Clase_parametro.REF) {
					writer.println("\tDRF");
				}
					
				// Lectura operandos notacion polaca inversa
				this.recorrido_profundidad(instr.getDerecha(), instr.getNivel(), false);
				
				writer.println("; Asignacion a " + var.getNombre());
				writer.println("\tASG");
				break;
			case WHILE:
				
				label1 = this.nueva_etiqueta();
				writer.println(label1 + ":");
				writer.println("; MQ");
				writer.println("; Comprobar condicion");
				this.recorrido_profundidad(instr.getCond(), instr.getNivel(), false);
				writer.println("; Salir del bucle si se evalua falso");
				label2 = this.nueva_etiqueta();
				writer.println("\tJMF\t"+ label2);
				writer.println("; Lista de sentencias");
				this.escribir(instr.getDerecha());
				writer.println("; Fin de la iteración. Saltar a la cabecera del bucle.");
				writer.println("; Fin MQ");
				writer.println("\tJMP\t" + label1);
				writer.println(label2 + ":");
				break;
			case IF:
				
				label1 = this.nueva_etiqueta();
				writer.println("; SI");
				writer.println("; Comprobar condicion");
				this.recorrido_profundidad(instr.getCond(), instr.getNivel(), false);
				writer.println("\tJMF\t" + label1);
				writer.println("; Lista de sentencias");
				this.escribir(instr.getIzquierda());
				
				if (instr.getDerecha() == null) {
					writer.println( label1 + ":");
				}
				else {
					// Si hay SI_NO
					label2 = this.nueva_etiqueta();
					writer.println("\tJMP\t" + label2);
					writer.println("; SI_NO");
					writer.println(label1 + ":");
					this.escribir(instr.getDerecha());
					writer.println("; Fin SI");
					writer.println( label2 + ":");
				}
				break;
			case RD:
				/* Pasos:
				 * 			; Leer
				 *			; Dirección de variable x
				 *				SRF	x	y
				 *				RD 0|1		; 0 char - else int
				 */
				writer.println("; Leer");
				// Leer dirección de cada variable
				ASTNodo variable = instr.getDerecha();
				
				while(variable != null) {
					// Operacion RD sobre variable
					String num = (variable.getTipoVar() == Simbolo.Tipo_variable.CADENA 
							|| variable.getTipoVar() == Simbolo.Tipo_variable.CHAR) ? "0" : "1";
					
					f = instr.getNivel() - variable.getNivel();
					o = variable.getDir();
					
					writer.println("; direccion " + variable.getNombre());
					writer.println("\tSRF\t" + f + "\t" + o);
					
					if(variable.getTipoParametro() == Simbolo.Clase_parametro.REF)
						writer.println("\tDRF");
					if(variable.isNegar_valor()) {
						writer.println("\tNGB");
					}
					writer.println("\tRD\t" + num);
					variable = variable.getDerecha();
				}
				break;
			case WR:
				/* Pasos:
				 * 			; Escribir
				 *			; Dirección de variable 
				 *				SRF	x	y
				 *				DRF
				 *				WRT 0|1		; 0 char - else int
				 */
				// Leer dirección de cada variable
				ASTNodo parametro = instr.getDerecha();
				
				while(parametro != null) {
					writer.println("; Escribir " + parametro.getNombre());
					if (parametro.getTipo() == ASTNodo.TipoNodo.CONST) {
						// No escribo los "" del principio y fin
						
						if(parametro.getTipoVar() != Simbolo.Tipo_variable.ENTERO) {
							for(int i=1; i < parametro.getNombre().length()-1 ; ++i) {
								writer.println("\tSTC\t" + (int)parametro.getNombre().charAt(i));
								writer.println("\tWRT\t0");
							}
						}
						else {
							writer.println("\tSTC\t" + parametro.getNombre());
							writer.println("\tWRT\t0");
						}
						
						if(parametro.isNegar_valor()) {
							writer.println("\tNGB");
						}
						
					}
					else if(parametro.getTipo() == ASTNodo.TipoNodo.ENTCAR) {
						// Ejecutar expresion y escribir como tipo char
						this.recorrido_profundidad(parametro.getIzquierda(), parametro.getNivel(), false);
						writer.println("\tWRT\t1");
					}
					else {
						// Si es VAR : "SRF nivel dir" ; "DRF" ; WRT
						String num = (parametro.getTipoVar() == 
								Simbolo.Tipo_variable.CADENA | parametro.getTipoVar() == Simbolo.Tipo_variable.CHAR) ? "0" : "1";
						f = instr.getNivel() - parametro.getNivel();
						o = parametro.getDir();
						writer.println("; direccion " + parametro.getNombre());
						writer.println("\tSRF\t" + f + "\t" + o);
						writer.println("\tDRF");
						if(parametro.isNegar_valor()) {
							writer.println("\tNGB");
						}
						// Valor de un parametro por referencia
						if(parametro.getTipoParametro() == Simbolo.Clase_parametro.REF)
							writer.println("\tDRF");
						writer.println("\tWRT\t" + num);
					}
					parametro = parametro.getDerecha();
				}
				break;	
			case FUN:
				/* Pasos:	
				 * 			; Accion R
				 * 			; Recuperar argumentos R
				 *			R: 
				 *		
				 *			; codigo de R
				 *
				 *				CSF
				 */			
				writer.println("\n; accion " + instr.getNombre() + ".");				
				writer.println(";comienzo accion " + instr.getNombre() + ".");
				this.escribir(instr.getNombre() + ":"); 
				
				// Recuperar argumentos
				ASTNodo param = instr.getIzquierda();

				while(param != null) {
					f = instr.getNivel() - param.getNivel();
					o = param.getDir();
					writer.println("; direccion " + param.getNombre());
					writer.println("\tSRF\t" + 0 + "\t" + o);
					writer.println("\tASGI");
					
					param = param.getIzquierda();
				}
				
				// Codigo de la funcion(bloque_sentencias)
				this.escribir(instr.getDerecha());
				
				
				// Fin de la accion
				writer.println(";Fin de la acción / función\n\tCSF");
				
				break;
			case INVOCACION:
				/* Pasos:	
				 * 			; Apilar variables
				 * 			; Invocar funcion
				 *				OSF	 s l a
				 */	
				ASTNodo accion = instr.getCond();
				f = instr.getNivel() - ((accion == null) ? 0 : accion.getNivel() );
				writer.println("\n; invocacion accion " + instr.getNombre() + ".");
				this.recorrido_profundidad(instr.getIzquierda(), instr.getNivel(), true);
				writer.println("\tOSF " + accion.getValor() + "  "  + f + " "+ accion.getNombre());
				break;
			default:
				break;
			}
			instr = instr.getSiguiente();
		}
	}
	
	private void recorrido_profundidad(ASTNodo node, int nivel, boolean inv_func) {
		if (node != null) {
			String msg = new String();
			this.recorrido_profundidad(node.getIzquierda(), nivel, inv_func);
			this.recorrido_profundidad(node.getDerecha(), nivel, inv_func);
			switch (node.getTipo()) {
			case CONST:
				// Si es CONST puede ser 
				//    ENTERO          -  atributo name valdra "" y value contendrá el valor
				//    CADENA/CHAR     -  atributo name contendrá el valor de la cadena
				//    BOOLEANO
				msg = (node.getTipoVar() == Simbolo.Tipo_variable.CHAR) ? node.getNombre() : Integer.toString(node.getValor()) ;
				//msg = (node.name != "") ? Integer.toString(node.getValor()) : node.getNombre();
				writer.println("\tSTC\t" + msg);
				if(node.isNegar_valor()) {
					writer.println("\tNGB");
				}
				break;
			case VAR:
				// Si es VAR : "SRF nivel dir" y "DRF"
				// inv_func indica que es llamada a funcion, en caso de ser True se mira el tipo del parámetro
				int f = nivel - node.getNivel();
				int o = node.getDir();
				writer.println("; direccion " + node.getNombre());
				writer.println("\tSRF\t" + f + "\t" + o);
				if (!inv_func) {
					writer.println("\tDRF");		
					// Valor de un parametro por referencia
					if(node.getTipoParametro() == Simbolo.Clase_parametro.REF)
						writer.println("\tDRF");
					if(node.isNegar_valor()) {
						writer.println("\tNGB");
					}
				}
				else {
					if (node.getTipoParametro() == Simbolo.Clase_parametro.VAL) {
						writer.println("\tDRF");
						if(node.isNegar_valor()) {
							writer.println("\tNGB");
						}
					}
				}
				break;
			case OP:
				// Si es un operador escribimos su nemotecnico
				// writer.println("; operador");
				this.escribir_operador_aditivo(node);
				break;
			case COND:
				// Si es una condicion escribimos su nemotecnico
				writer.println("; condicion");
				this.escribir_operador_relacional(node);
				break;
			default:
				break;
			}
		}
	}
	
	
	private void escribir_operador_aditivo(ASTNodo node) {
		switch (node.getTipoOp().getOperadorAditivo()) {
		case SUMA:
			writer.println("\tPLUS");
			break;
		case RESTA:
			writer.println("\tSBT");
			break;
		case OR:
			writer.println("\tOR");
			break;
		default:
			break;
		}
	}
	
	
	private void escribir_operador_multiplicativo(ASTNodo node) {
		switch (node.getTipoOp().getOperadorMultiplicativo()) {
		case MULTIPLICACION:
			writer.println("\tMUL");
			break;
		case DIVISION:
			writer.println("\tDIV");
			break;
		case MOD:
			writer.println("\tMOD");
			break;
		case AND:
			writer.println("\tAND");
			break;
		default:
			break;
		}
	}
	
	
	private void escribir_operador_relacional(ASTNodo node) {
		switch (node.getTipoOp().getOperadorRelacional()) {
		case IGUAL:
			writer.println("\tEQ");
			break;
		case MAYOR:
			writer.println("\tGT");
			break;
		case MAYOR_IGUAL:
			writer.println("\tGE");
			break;
		case NO_IGUAL:
			writer.println("\tNEQ");
			break;
		case MENOR_IGUAL:
			writer.println("\tLE");
			break;
		case MENOR:
			writer.println("\tLT");
			break;
		default:
			break;
		}
	}
	
}
