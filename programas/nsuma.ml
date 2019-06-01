%----------------------------------------
Programa suma_n_terminos;
%----------------------------------------

entero res, n, inicio;

%---------------------------------------
principio
%---------------------------------------

	res := 0;
	
	escribir("Introduce un numero natural: ");
	leer(n);
	inicio := n;

	mq (n > 0)
		res := res + n;
		n := n - 1;
	fmq

	escribir ("La suma de los primeros " , inicio, " numeros es ", res);

fin