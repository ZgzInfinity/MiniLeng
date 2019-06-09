%----------------------------------------------
programa acciones_anidadas;
%----------------------------------------------

	entero i,j,k;
	caracter a,b,c;
	booleano foo,bar;

%----------------------------------------------
accion accion_1;
%----------------------------------------------

%----------------------------------------------
	accion accion_2;
%----------------------------------------------
	principio
        escribir("Estoy en accion_2");
  		a3;
  	fin
	
principio
  	escribir("Estoy en accion_1");
  	a2;
fin

%-----------------------------------------------
accion foo2(ref entero a1);
%-----------------------------------------------
principio
	escribir("Error a1 es una accion");
fin

%-----------------------------------------------
accion sumar1(ref entero a);
%-----------------------------------------------

entero b;

principio
	b := a + 1;
	escribir("El resultado de sumar 1 a ", a , " es " , b); 
fin

%-----------------------------------------------
accion restarN(ref entero a;  val entero n);
%-----------------------------------------------

entero b;

principio
	b := a - n;
	escribir("El resultado de sumar  a ", a , " una cantidad de ", n , " unidades es " , b);
fin

%------------------------------------------------
accion operaciones(val entero asd);
%------------------------------------------------
principio
	escribir("Error a1 es una accion");
	asd := (3 + 2) div 5;		    
	sumar1(asd);		
fin

principio

	a := "abcded";		
	b := "b" >= "b";		
	c := "a" + 3;		

	i := 3 + pepe;		
	i := 3 + pepe;		

	foo := a = b;
	bar := a = c;
	escribir("a:", a, "  b:", b, "  c:", entacar(10), entacar(13));
	escribir("j > k?  ");

	si ( 3 > 2) ent
		escribir("Siempre entro aqui");
		si ( i* 4 + 2) ent   % el operador debe ser booleano
			escribir("    ERROR!");
		fsi
	si_no
		escribir("Nunca entro aqui");
	fsi

	a2;					% no es visible
	sumar1(a);			% incompatibilidad de tipos
	sumarN(i);			% num parametros incorrectos
	sumarN(i,i,i);		
	
fin