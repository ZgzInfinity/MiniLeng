%--------------------------------------------------------
Programa Potencia;
%--------------------------------------------------------

entero base, exponente;

%--------------------------------------------------------
accion calculo_potencia (ref entero a, n);
%--------------------------------------------------------

entero i, x, r;

principio 
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
	
	escribir("El resultado de elevar la base " , a , " al exponente " , n , " es " , r);
Fin

%----------------------------------------------------------
principio
	leer(base);
	leer(exponente);
	calculo_potencia(base, exponente);
fin

