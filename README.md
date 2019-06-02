# Compilador del lenguaje MiniLeng
# Proyecto de Procesadores de lenguajes

## Descripcion

En este proyecto se ha procedido a desarrollar un compilador para un lenguaje customizado utilizando el entorno de programación eclipse y el metacompilador javacc. 

## Diseño

Para elaborar el compilador se han tenido que programar los diferentes componentes que lo conforman, así como la interacción entre
dichos módulos para lograr su correcta operatividad. Finalmente se ha procedido a crear una batería de pruebas para poder 
confirmar que su funcionamiento es correcto. Seguidamente se va describir la secuencia de pasos que se ha seguido para poder 
implementarlo correctamente.

### Analizador léxico

Inicialmente se ha procedido a realizar el analizador léxico del lenguaje con el objetivo de que reconozca las palabras
reservadas, identificadores, valores constantes (cadenas, caracteres, booleanos y números) e identificadores del lenguaje 
MiniLeng.

El analizador léxico de MiniLeng está constituido por los siguientes tokens:

Comentarios: comienzan con el símbolo % y llegan hasta el final de la línea. Opcionalmente, puedes considerar los comentarios multilínea, que comenzarían con %% y terminarían de nuevo con %%.

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



