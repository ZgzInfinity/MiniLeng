%----------------------------------------
Programa suma_n_terminos;
%----------------------------------------

entero res, n;

%---------------------------------------
principio
%---------------------------------------

	res := 0;
	leer(n);
	
	mq (n > 0)
		res := res + n;
		n := n - 1;
	fmq

	escribir ("La suma de los primeros " , n, " numeros es ", res);

fin