/* Generated By:JavaCC: Do not edit this line. Compilador.java */
package Foo;
import Foo.Tabla_Simbolos;
import java.util.LinkedList;
import Foo.Simbolo.Tipo_simbolo;
import Foo.Simbolo.Tipo_variable;
import Foo.Simbolo.Clase_parametro;

import Foo.SimboloNoEncontradoException;

public class Compilador implements CompiladorConstants {

  // IniCio del nivel de declaraciones anidadas
  public static int nivel = 0;

  // Variable de direccion por defecto a 0
  public static long dir = 0;

  public static Tabla_Simbolos tabla;


  public static void main(String args []) throws ParseException
  {
    /* nombre del fichero */

        String nombreArchivo;
        String path = "C:\u005c\u005cUsers\u005c\u005cGord\u005c\u005cDesktop\u005c\u005cprogramas\u005c\u005c";


        if (args[0].equals("-v")) {
                System.out.println("Compilacion en modo verbose");
                nombreArchivo = args[1];
        }
        else {
            System.out.println("Compilacion sin modo verbose");
            nombreArchivo = args[0];
    }

        /* Completar la ruta del path */
        path += nombreArchivo;


    System.out.println("LEYENDO FICHERO " + nombreArchivo + "\u005cn");
    try
    {
      /* Crear el parser con respecto al fichero */
      Compilador parser = new Compilador (new java.io.FileInputStream(path));
      int res = Compilador.programa();
      if (args[0].equals("-v")) {

          // Instancia de la tabla de simbolos
          Tabla_Simbolos tabla = new Tabla_Simbolos();

          // Inicializacion de la tabla de simbolos
          tabla.inicializar_tabla();


      /* Mostrar total de tokens */
          TablaHash.mostrarTokensNormales();

          /* Mostrar total de identificadores */
          TablaHash.mostrarIdentificadores();
          }
          System.out.println("El fichero introducido es correcto");
        }
    catch (Exception e)
    {
       System.out.println("INCORRECTO");
       System.out.println(e.getMessage());
       Compilador.ReInit(System.in);
    }
    catch (Error e)
      {
       // Obtencion del error sintactico 
       int fila = CompiladorTokenManager.input_stream.getBeginLine();
       int columna = CompiladorTokenManager.input_stream.getBeginColumn();
       String tokenMalo = CompiladorTokenManager.input_stream.GetImage();

       ErrorLexico eL = new ErrorLexico(fila, columna, tokenMalo);
    }
  }

/* Construccion del analizador sintactico */

// Regla de programa
  static final public int programa() throws ParseException {
  Token tSim, t;
  Simbolo s;
  Simbolo.Tipo_simbolo tp_Sim;
    try {
      // Lectura del token programa
             tSim = jj_consume_token(tPROGRAMA);
                   // Comprobacion del tipo de tipo de programa
                   if (tSim.kind == tPROGRAMA) {
                      // Es el token correcto
                      tp_Sim = Simbolo.Tipo_simbolo.ACCION;
                      tabla.anyadirBloque(tp_Sim);
                   }
      // Guardado del nombre del programa
             t = jj_consume_token(tIDENTIFICADOR);
         // Insertar en la tabla de simbolos el token del programa
         // no se comprueba porque es el primero
         s = tabla.introducir_programa(t.image, dir);
      jj_consume_token(tPUNTYCOM);
      declaracion_variables();
      declaracion_acciones();
      bloque_sentencias();
      jj_consume_token(0);
         {if (true) return 0;}
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
     {if (true) return 1;}
    }
    throw new Error("Missing return statement in function");
  }

// Regla de bloque_sentencias OK
  static final public void bloque_sentencias() throws ParseException {
    try {
      jj_consume_token(tPRINCIPIO);
      lista_sentencias();
      jj_consume_token(tFIN);
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de lista_sentencias OK EN DUDA
  static final public void lista_sentencias() throws ParseException {
    try {
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tSI:
        case tMQ:
        case tESCRIBIR:
        case tLEER:
        case tIDENTIFICADOR:
          ;
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        sentencia();
      }
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de sentencia OK
  static final public void sentencia() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tLEER:
        leer();
        jj_consume_token(tPUNTYCOM);
        break;
      case tESCRIBIR:
        escribir();
        jj_consume_token(tPUNTYCOM);
        break;
      case tIDENTIFICADOR:
        asig_invoc();
        break;
      case tSI:
        seleccion();
        break;
      case tMQ:
        mientras_que();
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

  static final public void asig_invoc() throws ParseException {
    try {
      jj_consume_token(tIDENTIFICADOR);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tOPAS:
        asignacion();
        break;
      case tPUNTYCOM:
      case tPARENTESIS_IZDA:
        invocacion_accion();
        break;
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de asignacion OK
  static final public void asignacion() throws ParseException {
    try {
      jj_consume_token(tOPAS);
      expresion();
      jj_consume_token(tPUNTYCOM);
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de lista_asignables OK
  static final public void lista_asignables() throws ParseException {
    try {
      identificadores();
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de leer OK
  static final public void leer() throws ParseException {
    try {
      jj_consume_token(tLEER);
      jj_consume_token(tPARENTESIS_IZDA);
      lista_asignables();
      jj_consume_token(tPARENTESIS_DCHA);
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de escribir OK
  static final public void escribir() throws ParseException {
    try {
      jj_consume_token(tESCRIBIR);
      jj_consume_token(tPARENTESIS_IZDA);
      lista_escribibles();
      jj_consume_token(tPARENTESIS_DCHA);
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de lista_escribibles OK
  static final public void lista_escribibles() throws ParseException {
    try {
      escribible();
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tCOMA:
          ;
          break;
        default:
          jj_la1[3] = jj_gen;
          break label_2;
        }
        jj_consume_token(tCOMA);
        escribible();
      }
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de lista_escribibles OK
  static final public void escribible() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tCONSTCHAR:
        jj_consume_token(tCONSTCHAR);
        break;
      case tCONSTCAD:
        jj_consume_token(tCONSTCAD);
        break;
      case tENTACAR:
        jj_consume_token(tENTACAR);
        jj_consume_token(tPARENTESIS_IZDA);
        jj_consume_token(tCONSTANTE_NUMERICA);
        jj_consume_token(tPARENTESIS_DCHA);
        break;
      case tIDENTIFICADOR:
        jj_consume_token(tIDENTIFICADOR);
        break;
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de invocacion accion OK
  static final public void invocacion_accion() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tPARENTESIS_IZDA:
        argumentos();
        break;
      default:
        jj_la1[5] = jj_gen;
        ;
      }
      jj_consume_token(tPUNTYCOM);
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

//Regla de mientras que OK
  static final public void mientras_que() throws ParseException {
    try {
      jj_consume_token(tMQ);
      expresion();
      lista_sentencias();
      jj_consume_token(tFMQ);
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla para los argumentos OK
  static final public void argumentos() throws ParseException {
    try {
      jj_consume_token(tPARENTESIS_IZDA);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tPLUS:
      case tMINUS:
      case tNOT:
      case tTRUE:
      case tFALSE:
      case tENTACAR:
      case tCARAENT:
      case tCONSTCHAR:
      case tCONSTCAD:
      case tCONSTANTE_NUMERICA:
      case tIDENTIFICADOR:
      case tPARENTESIS_IZDA:
        lista_expresiones();
        break;
      default:
        jj_la1[6] = jj_gen;
        ;
      }
      jj_consume_token(tPARENTESIS_DCHA);
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de lista de expresiones
  static final public void lista_expresiones() throws ParseException {
    try {
      expresion();
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tCOMA:
          ;
          break;
        default:
          jj_la1[7] = jj_gen;
          break label_3;
        }
        jj_consume_token(tCOMA);
        expresion();
      }
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de expresion OK
  static final public void expresion() throws ParseException {
    try {
      expresion_simple();
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tMAYOR:
        case tMENOR:
        case tIGUAL:
        case tMAI:
        case tMEI:
        case tNI:
          ;
          break;
        default:
          jj_la1[8] = jj_gen;
          break label_4;
        }
        operador_relacional();
        expresion_simple();
      }
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de operador_relacional OK
  static final public void operador_relacional() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tIGUAL:
        jj_consume_token(tIGUAL);
        break;
      case tMENOR:
        jj_consume_token(tMENOR);
        break;
      case tMEI:
        jj_consume_token(tMEI);
        break;
      case tNI:
        jj_consume_token(tNI);
        break;
      case tMAI:
        jj_consume_token(tMAI);
        break;
      case tMAYOR:
        jj_consume_token(tMAYOR);
        break;
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
    ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla operador aditivo OK
  static final public void operador_aditivo() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tPLUS:
        jj_consume_token(tPLUS);
        break;
      case tMINUS:
        jj_consume_token(tMINUS);
        break;
      case tOR:
        jj_consume_token(tOR);
        break;
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
         ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// regla de expresion simple OK
  static final public void expresion_simple() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tPLUS:
        jj_consume_token(tPLUS);
        break;
      default:
        jj_la1[11] = jj_gen;
        ;
      }
      termino();
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tPLUS:
        case tMINUS:
        case tOR:
          ;
          break;
        default:
          jj_la1[12] = jj_gen;
          break label_5;
        }
        operador_aditivo();
        termino();
      }
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de termino OK
  static final public void termino() throws ParseException {
    try {
      factor();
      label_6:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tMULTIPLY:
        case tDIVIDE:
        case tAND:
        case tMOD:
        case tDIV:
          ;
          break;
        default:
          jj_la1[13] = jj_gen;
          break label_6;
        }
        operador_multiplicativo();
        factor();
      }
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de operador multiplicativo OK
  static final public void operador_multiplicativo() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tMULTIPLY:
        jj_consume_token(tMULTIPLY);
        break;
      case tDIVIDE:
        jj_consume_token(tDIVIDE);
        break;
      case tDIV:
        jj_consume_token(tDIV);
        break;
      case tMOD:
        jj_consume_token(tMOD);
        break;
      case tAND:
        jj_consume_token(tAND);
        break;
      default:
        jj_la1[14] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de factor OK
  static final public void factor() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tMINUS:
        jj_consume_token(tMINUS);
        factor();
        break;
      case tNOT:
        jj_consume_token(tNOT);
        factor();
        break;
      case tPARENTESIS_IZDA:
        jj_consume_token(tPARENTESIS_IZDA);
        expresion();
        jj_consume_token(tPARENTESIS_DCHA);
        break;
      case tENTACAR:
        jj_consume_token(tENTACAR);
        jj_consume_token(tPARENTESIS_IZDA);
        expresion();
        jj_consume_token(tPARENTESIS_DCHA);
        break;
      case tCARAENT:
        jj_consume_token(tCARAENT);
        jj_consume_token(tPARENTESIS_IZDA);
        expresion();
        jj_consume_token(tPARENTESIS_DCHA);
        break;
      case tIDENTIFICADOR:
        jj_consume_token(tIDENTIFICADOR);
        break;
      case tCONSTANTE_NUMERICA:
        jj_consume_token(tCONSTANTE_NUMERICA);
        break;
      case tCONSTCHAR:
        jj_consume_token(tCONSTCHAR);
        break;
      case tCONSTCAD:
        jj_consume_token(tCONSTCAD);
        break;
      case tTRUE:
        jj_consume_token(tTRUE);
        break;
      case tFALSE:
        jj_consume_token(tFALSE);
        break;
      default:
        jj_la1[15] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
         ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de seelccion OK
  static final public void seleccion() throws ParseException {
    try {
      jj_consume_token(tSI);
      expresion();
      jj_consume_token(tENT);
      lista_sentencias();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tSI_NO:
        jj_consume_token(tSI_NO);
        lista_sentencias();
        break;
      default:
        jj_la1[16] = jj_gen;
        ;
      }
      jj_consume_token(tFSI);
    } catch (ParseException e) {
         ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de declaracion_acciones OK
  static final public void declaracion_acciones() throws ParseException {
    try {
      label_7:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tACCION:
          ;
          break;
        default:
          jj_la1[17] = jj_gen;
          break label_7;
        }
        declaracion_accion();
      }
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de declaracion_Accion OK
  static final public void declaracion_accion() throws ParseException {
    try {
      cabecera_accion();
      jj_consume_token(tPUNTYCOM);
      declaracion_variables();
      declaracion_acciones();
      bloque_sentencias();
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de cabecera_accion OK
  static final public void cabecera_accion() throws ParseException {
  Token tSim, tId;
  Simbolo s;
  Simbolo.Tipo_simbolo tp_Sim;
    try {
      // Apilar la nueva definicion de accion si no existe   
               tSim = jj_consume_token(tACCION);
           // Comprobacion del tipo de tipo de accion
           if (tSim.kind == tACCION) {
              // Es el token correcto
              tp_Sim = Simbolo.Tipo_simbolo.ACCION;
              tabla.anyadirBloque(tp_Sim);
           }
      tId = jj_consume_token(tIDENTIFICADOR);
           try {
             // Posible mensaje de excepcion
             // Determinar si existe una accion con ese identificador en la tabla
             if (tabla.buscar_simbolo(tId.image) != null) {
                        // El simbolo no existe en la tabla
                        // Incrementar el nuevo nivel
                        nivel++;
                        // Insertar en la tabla de simbolos el nuevo identificador
                        try {
                                tabla.introducir_accion(tId.image, nivel, dir);
                        }
                        catch(AccionRepetidaException e) {
                            // El simbolo ya existe en la tabla de simbolos
                                e.accionRepetidaExcepcion(tId.image);
                }
             }
           }
           // Salta la excepcion de simbolo encontrado
           catch (SimboloNoEncontradoException e) {
               // Muestra la excepcion por pantalla
               e.simboloNoEncontrado(tId.image);
           }
      parametros_formales();
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de parametros formales OK
  static final public void parametros_formales() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tPARENTESIS_IZDA:
        lista_parametros();
        break;
      default:
        jj_la1[18] = jj_gen;
        ;
      }
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla para lista_parametros OK
  static final public void lista_parametros() throws ParseException {
    try {
      jj_consume_token(tPARENTESIS_IZDA);
      parametros();
      label_8:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tPUNTYCOM:
          ;
          break;
        default:
          jj_la1[19] = jj_gen;
          break label_8;
        }
        jj_consume_token(tPUNTYCOM);
        parametros();
      }
      jj_consume_token(tPARENTESIS_DCHA);
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de parametros OK
  static final public void parametros() throws ParseException {
  // Declaracion de variables

  // Simbolo a guardar en la tabla de simbolos
  Simbolo s;

  // Clase de parametro y tipo de variable del simbolo a introducir
  Simbolo.Clase_parametro cl_Param;
  Simbolo.Tipo_variable tipo_Var;

  // Lista de identificadores leidos a almacenar en la tabla de simbolos
  LinkedList<String> lista;
    try {
      clase_parametros();
      tipos_variables();
      identificadores();
       // Se ha procesado la clase con el tipo de variable y los identificadores
       cl_Param = tabla.getClase_parametro();
       tipo_Var = tabla.getTipo_variable();
       lista = tabla.getListaIdentificadores();

       // Tama�o de la lista de identificadores
       int dimension = lista.size();

           // Identificador del simbolo a procesar
           String identificadorActual;

       // Bucle de recorrido de la lista de identificadores
       for (int i = 0; i < dimension; i++) {
                // Obtener identificador actual
                identificadorActual = lista.get(i);

                        // Comprobar que existe o no simbolo en la tabla
                        try {
                                // Busqueda del simbolo en la tabla de simbolos
                                tabla.buscar_simbolo(identificadorActual);

                                try {
                                        // Insercion del parametro en la tabla de simbolos
                                        tabla.introducir_parametro (identificadorActual, tipo_Var, cl_Param, nivel, dir);
                                }
                                catch (ParametroRepetidoException e) {
                                        // El parametro ya esta repetido 
                                        e.parametroRepetidoExcepcion(identificadorActual);
                                }
                        }
                        catch (SimboloNoEncontradoException e) {
                        // Muestra la excepcion por pantalla
                        e.simboloNoEncontrado(identificadorActual);
                }
       }
    } catch (ParseException e) {
    ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de declaracion variables OK
  static final public void declaracion_variables() throws ParseException {
    try {
      label_9:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tENTERO:
        case tBOOLEANO:
        case tCARACTER:
          ;
          break;
        default:
          jj_la1[20] = jj_gen;
          break label_9;
        }
        declaracion();
        jj_consume_token(tPUNTYCOM);
      }
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla de declaracion OK
  static final public void declaracion() throws ParseException {
  // Declaracion de variables
  Token t;
  Simbolo.Tipo_variable tp_Var;
  LinkedList<String> lista;
    try {
      tipos_variables();
      identificadores();
       // Se ha procesado el tipo de variable y los corresponfientes identificadores
       lista = tabla.getListaIdentificadores();

       // Obtencion del tipo de variable de los simbolos
       tp_Var = tabla.getTipo_variable();

           // Variable para guardar el identificador del simbolo a introducir
           String identificadorActual;

          // Tama�o de la lista de identificadores
          int dimension = lista.size();

           //Bucle de recorrido de insercion de variables
           for (int i = 0; i < dimension; i++) {
                // Obtencion del identificador actual
                        identificadorActual = lista.get(i);

                    try {
                           // Buscar simbolo en la tabla de simbolos
                           tabla.buscar_simbolo(identificadorActual);

                           // Simbolo ya existente en la tabla de simbolos
                           try {
                                // introducir el nuevo simbolo
                                tabla.introducir_variable(identificadorActual, tp_Var, nivel, dir);
                   }
                   catch (VariableRepetidaException e) {
                        // El identificador ya existe en la tabla de simbolos
                        e.variableRepetidaExcepcion(identificadorActual);
                   }
                }
                catch (SimboloNoEncontradoException e) {
                    // El simbolo no existe en la tabla 
                    e.simboloNoEncontrado(identificadorActual);
                }
           }
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla para los identificadores OK
  static final public void identificadores() throws ParseException {
  // Declaracion de una lista auxiliar de identificadores
  Token t;
    try {
      t = jj_consume_token(tIDENTIFICADOR);
       // A�adir el identificador obligatorio
       tabla.anyadirIdentificador(t.image);
      label_10:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tCOMA:
          ;
          break;
        default:
          jj_la1[21] = jj_gen;
          break label_10;
        }
        jj_consume_token(tCOMA);
        t = jj_consume_token(tIDENTIFICADOR);
      }
       // A�adir el resto de identificadores de la lista
       tabla.anyadirIdentificador(t.image);
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla para los tipos de variables OK
  static final public void tipos_variables() throws ParseException {
  // Declaracion de variable
  Token t;
  Tipo_variable tipo_Var;
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tENTERO:
        // Asignacion del token leido
            t = jj_consume_token(tENTERO);
        break;
      case tCARACTER:
        t = jj_consume_token(tCARACTER);
        break;
      case tBOOLEANO:
        t = jj_consume_token(tBOOLEANO);
       // Control del tipo token
       switch (t.image) {
         case "tENTERO":
                // Es token tENTERO
                tipo_Var = Simbolo.Tipo_variable.ENTERO;
                break;
         case "tCARACTER":
                // Es token tCARACTER
                tipo_Var = Simbolo.Tipo_variable.CHAR;
                break;
         case "tCONSTCAD":
                // Es token tCARACTER
                tipo_Var = Simbolo.Tipo_variable.CADENA;
                break;
         case "tBOOLEANO":
                // Es token tBOOLEANO
                tipo_Var = Simbolo.Tipo_variable.BOOLEANO;
                break;
         default:
                // No es niguno de los anteriores es DESCONOCIDO
                tipo_Var = Simbolo.Tipo_variable.DESCONOCIDO;
       }
           // Asignar el valor del tipo de variable leida
           tabla.setTipo_variable(tipo_Var);
        break;
      default:
        jj_la1[22] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

// Regla para las clases de parametros OK
  static final public void clase_parametros() throws ParseException {
  // Declaracion de variables
  Token t;
  Simbolo.Clase_parametro cl_Param;
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tVAL:
        // Asignacion del token hallado
            t = jj_consume_token(tVAL);
        break;
      case tREF:
        t = jj_consume_token(tREF);
      if (t.kind == tVAL) {
        // Es token tVAL
        cl_Param = Simbolo.Clase_parametro.VAL;
      }
      else {
        // Es tokeb tREF
        cl_Param = Simbolo.Clase_parametro.REF;
      }
          // El tipo de clase ha sido procesada
          // Guardado de la clase de parametro leido 
          tabla.setClase_parametro(cl_Param);
        break;
      default:
        jj_la1[23] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
     ErrorSintactico eS = new ErrorSintactico(e);
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public CompiladorTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[24];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x88000000,0x88000000,0x80000,0x0,0x0,0x0,0x400600,0x0,0x7e000,0x7e000,0x200600,0x200,0x200600,0x101800,0x101800,0x400400,0x20000000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x100006,0x100006,0xa00000,0x400000,0x160400,0x800000,0x9e0f00,0x400000,0x0,0x0,0x0,0x0,0x0,0x18,0x18,0x9e0f00,0x0,0x1000,0x800000,0x200000,0xe0,0x400000,0xe0,0x6000,};
   }

  /** Constructor with InputStream. */
  public Compilador(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Compilador(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new CompiladorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Compilador(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new CompiladorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Compilador(CompiladorTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(CompiladorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[57];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 24; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 57; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
