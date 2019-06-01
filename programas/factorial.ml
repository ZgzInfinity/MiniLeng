Programa Factorial;

entero valor;

%--------------------------------------------------------
accion calculo_factorial (val entero n);
%--------------------------------------------------------

entero i, resultado;
principio

	i := 1;
	resultado := n;
	
	mq ( i < n)
		resultado := resultado * i;
		i := i + 1;
	fmq
	
	escribir("El factorial de ", n , " es " , resultado);

fin

%---------------------------------------------------------
principio
	escribir("Introduce el numero del que deseas calcular el factorial: ");
	leer(valor);
	calculo_factorial(valor);
fin
	

