Programa Factorial;

entero valor;

%--------------------------------------------------------
accion calculo_factorial (ref entero n);
%--------------------------------------------------------

entero i, resultado;
principio

	i := 1;
	resultado := n;
	
	mq ( i <= n)
		resultado := resultado * i;
		i := i + 1;
	fmq
	
	escribir("El factorial de ", n , " es " , resultado);

fin

%---------------------------------------------------------
principio
	leer(valor);
	calculo_factorial(valor);
fin
	

