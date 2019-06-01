%--------------------------------------------------------
Programa Potencia;
%--------------------------------------------------------

entero base, exponente;

%--------------------------------------------------------
accion calculo_potencia (ref entero a, n);
%--------------------------------------------------------

entero i, x, r;

principio 

	escribir("La base introducida es " , a , entacar(10) , entacar(13));
	escribir("El exponente introducido es " , n , entacar(10) , entacar(13));

	i := n;
	x := a;
	r := 1;
	
	mq ( i > 0)
		si (i mod 2 <> 0) ent
			r := r * x;
		fsi
		
		x := x * x;
		i := i div 2;
	
	fmq
	
	escribir("El resultado es " , r);
Fin

%----------------------------------------------------------
principio
	escribir("Introduzca la base: ");
	leer(base);
	escribir("Introduzca el exponente: ");
	leer(exponente);
	
	calculo_potencia(base, exponente);
fin

