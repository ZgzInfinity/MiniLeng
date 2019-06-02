# Compilador del lenguaje MiniLeng
# Proyecto de Procesadores de lenguajes

## Descripcion

En este proyecto se ha procedido a desarrollar un compilador para un lenguaje customizado utilizando el entorno de programación eclipse y el metacompilador javacc. 

## Diseño

Para elaborar el compilador se han tenido que programar los diferentes componentes que lo conforman, así como la interacción
entre dichos módulos para lograr su correcta operatividad. Finalmente se ha procedido a crear una batería de pruebas para poder 
confirmar que su funcionamiento es correcto. Seguidamente se va a describir la secuencia de pasos que se ha seguido para poder 
implementarlo correctamente.

### Analizador léxico

Inicialmente se ha procedido a realizar el analizador léxico del lenguaje con el objetivo de que reconozca las palabras
reservadas, identificadores, valores constantes (cadenas, caracteres, booleanos y números) e identificadores del lenguaje 
MiniLeng.

El analizador léxico de MiniLeng está constituido por los siguientes tokens:

Comentarios: comienzan con el símbolo % y llegan hasta el final de la línea. Opcionalmente, puedes considerar los comentarios 
multilínea, que comenzarían con %% y terminarían de nuevo con %%.

Operadores aritméticos: +, -, *, /

Separador de sentencias y variables: ; , (  )

Palabras reservadas y token asociados que debéis generar:

tPROGRAMA -> programa 
tVAR -> var 
tAND -> and 
tOR -> or 
tNOT -> not 
tPRINCIPIO -> principio 
tFIN -> fin 
tSI -> si 
tENT -> ent 
tSI_NO -> si_no
tFSI -> fsi
tMQ -> mq
tFMQ -> fmq
tESCRIBIR -> escribir
tLEER -> leer
tMOD -> mod
tDIV -> div (es equivalente al símbolo /)
tENTERO -> entero
tBOOLEANO -> booleano
tCARACTER -> caracter
tTRUE -> true
tFALSE -> false
tENTACAR -> entacar
tCARAENT -> caraent
tACCION -> accion
tVAL -> val
tREF -> ref
tMAYOR -> >
tMENOR -> <
tIGUAL -> =
tMAI -> >=
tMEI -> <=
tNI -> <>
tOPAS -> :=

Además, se han considerado los identificadores, las constantes numéricas, los caracteres y las cadenas (ambos delimitados entre
comillas dobles).

Posteriormente se han creado dos tablas Hash haciendo uso del tipo de dato predefinido HashTable de las librerías de Java para 
poder almcenar el número de veces que ha aparecido cada palabra reservada del lenguaje, así como el número  de  identificadores,
de constantes enteras, de booleanos, etc si y solo si el programa es invocado con el flag de ejecución -v (modo verbose) y
finalmente se muestra una tabla con toda la información anteriormente comentada. 

Para poder detectar errores léxicos en programas se ha implementado un analizador de errores léxicos, de tal forma que si ha
habido un error en un fichero, muestra la línea y columna, junto con el error léxico localizado tal y como se muestra a 
continuación.

"ERROR LÉXICO (<línea, columna>): símbolo no reconocido: <símbolo>"

Seguidamente se muestra una imagen del contenido mostrado en la tabla cuando se ejecuta un programa con el flag -v 
(modo verbose). En la imagen aparece el contenido de dos tablas Hash, una para contar la frecuencia de cada palabra reservadas o
token y otra para contar la frecuencia de aparación de cada identificador.

### Analizador sintáctico

Posteriormente se ha procedido a construir el analizador sintáctico del compilador del lenguaje MiniLeng, encargado de procesar
las secuencias de tokens reconocidas por el analizador léxico, implementado y verificado en el apartado anterior, empleando la
notación BNF de javacc. Mediante la construcción del analizador sintáctico se ha logrado definir el conjunto de reglas de 
producción de la grámatica del lenguaje de MiniLeng. Seguidamente se muestran las reglas que componen dicha gramática.

Programa ::= <tPROGRAMA> <tIDENTIFICADOR> ";"
declaracion_variables declaracion_acciones bloque_sentencias
declaracion_variables ::= ( declaracion ";" )* 
declaracion ::= tipo_variables identificadores 
tipo_variables ::= <tENTERO> | <tCARACTER> | <tBOOLEANO>  
identificadores ::= <tIDENTIFICADOR> ( "," <tIDENTIFICADOR> )* 
declaracion_acciones ::= ( declaracion_accion )* 
declaracion_accion ::= cabecera_accion ";" declaracion_variables declaracion_acciones bloque_sentencias
cabecera_accion ::= <tACCION> <tIDENTIFICADOR> parametros_formales 
parametros_formales ::= (lista_parametros)?
lista_parametros::= "(" ( parametros ";" (parametros)* ")" | ")" )
parametros ::= clase_parametros tipo_variables identificadores 
clase_parametros ::= <tVAL> | <tREF> 
bloque_sentencias ::= <tPRINCIPIO> lista_sentencias <tFIN>
lista_sentencias::= (sentencia)+
sentencia ::= leer ";"| escribir ";" | asignacion |invocacion_accion |seleccion | mientras_que
leer ::= <tLEER> "(" lista_asignables ")"
lista_asignables ::= identificadores
escribir ::= <tESCRIBIR> "(" lista_escribibles ")"
lista_escribibles  ::= (escribible)+
escribible ::=  <tCONSTCHAR> 
              | <tCONSTCAD>
              | <tIDENTIFICADOR> 
              | <tENTACAR> <tPARENTESIS_IZDA> expresion <tPARENTESIS_DCHA>
asig_invoc ::= <tIDENTIFICADOR> (invocacion_accion | asignacion)
asignacion ::= <tOPAS> expresion ";" 
invocacion_accion ::= argumentos ";" 
mientras_que ::= <tMQ> expresion lista_sentencias <tFMQ> 
seleccion ::= <tSI> expresion <tENT> lista_sentencias (<tSI_NO> lista_sentencias)? <tFSI>
argumentos ::= "(" ( lista_expresiones )? ")" 
lista_expresiones ::= expresion ("," expresion)*
expresion ::= expresion_simple (operador_relacional expresion_simple)*
operador_relacional ::= <tIGUAL> | <tMENOR> | <tMEI> | <tNI> | <tMAI> | <tMAYOR>
expresion_simple ::= termino (operador_aditivo termino)* 
operador_aditivo::= <tPLUS> | <tMINUS> | <tOR>
termino::= factor (operador_multiplicativo factor)*
operador_multiplicativo::= <tMULTPIPLY> | <tDIVIDE> | <tDIV> | <tMOD> | <tAND>
factor::= "-" factor
          | <tNOT> factor 
          | "(" expresion ")" 
          | <tENTACAR> "(" expresion ")" 
          | <tCARAENT> "(" expresion")"
          |<tIDENTIFICADOR>
          |<tCONSTENTERA>
          |<tCONSTCHAR>
          |<tCONSTCAD>
          |<tTRUE>
          |<tFALSE>
  
Algunas de las reglas de las anteriores se han tenido que crear para poder eliminar problemas de recursión por la izquierda o
de factorización, como es el caso de la producción asig_invoc.

Seguidamente se ha implementado un manejador de errores sintácticos mediante el uso de excepciones. De este modo cuando en un
fichero hay un error sintáctico, éste se captura que y se muestra por terminal el tipo de error en cuestión, igual que
con el manejador de errores léxico con la diferencia de que el manejador de errores sintácticos no detiene la compilación y el
manejador de errores léxico sí lo hace.

### Analizador semántico (parte 1)

Posteriormente se ha procedido a desarrollar la primera parte del analizador semántico del compilador de MiniLeng. Para ello, se
ha creado una tabla de simbolos, utilizada por el compilador para almacenar información (atributos) asociada a los símbolos 
declarados en el programa en tiempo de compilación. Seguidamente se ha implementado una verificación semántica sencilla 
utilizando dicha la tabla.

La tabla de símbolos se ha implementado por medio de un TAD que ofrece una colección de métodos para poder trabajar con los 
datos almacenados en ella. La tabla de símbolos se ha implementado a modo de tabla Hash, por medio de de un vector de listas 
enlazadas a modo de matriz bidimensional. Como algoritmo de cifrado de Hash o función de dispersión se ha empleado la función 
de Pearson dadas las numerosas ventajas que proporciona su uso. Los símbolos que se almacenan en la tabla pueden ser programas,
variables, acciones y parámetros. Para cada símbolo se guarda el nivel de ejecución para controlar el ámbito de vida, su nombre 
y el tipo de símbolo. 

IMAGEN

Se permite añadir un símbolo de tipo programa, accion, parámeto y variable. También se puede buscar un símbolo en la tabla por
medio de su identificador, ocultar los parámetros de una accion en un nivel, borrar un símbolo de la tabla y eliminar los
parámetros ocultos de una acción. La inserción de un símbolo se realiza por la izquierda para maximizar la eficiencia de forma
que el coste de la operación es constante, y en caso de borrado, el coste es lineal ya que los símbolos se insertan por orden de
nivel. Para poder manejar los símbolos almacenados en la tabla se ha creado un TAD Símbolo para poder representar toda la 
información a guardar en la tabla de símbolos. 

IMAGEN

### Analizador semántico (parte 2)

Una vez implementada la tabla de símbolos se ha implementado el conjunto de restricciones necesarias para poder completar el
analizador semántico de MiniLeng, así como el manejador de errores semánticos en caso de detectar un fallo semántico. De este
modo se tiene total control de posibles desbordamientos, operaciones matemáticas erróneas, incompatibilidad de tipos en 
expresiones, variables repetidas, invocación a funciones con distinto número de parámetros, etcétera. Posteriormente se han
elaborado un conjunto de programas para poder determinar que el analizador semántico funciona 
adecuadamente.

IMAGEN BIEN

IMAGEN MAL

### Generación de código

Tras haber completado el analizador semántico, se ha procedido a realizar la generación de código ensamblador para la evaluación
completa de programas escritos en MiniLeng. Para ello, se ha utilizado la generación de código secuencial ya que permite la
unificación de los pasos en tiempo de compilación. De este modo se logra a partir de un fichero escrito en MiniLeng, generar el
código ensamblador correspondiente que después puede ejecutarse en la máquina P facilitada por el profesorado de la asignatura.


