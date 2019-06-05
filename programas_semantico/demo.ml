%----------------------------------
programa p
%----------------------------------

;entero i, j;

accion f1(ref entero m);
principio
	escribir (m);
	m := 2 + 3;
	escribir (m);
fin
	
accion f2(val entero k; ref entero l);
	principio
		escribir (k, l);
		l := 2 + 5 <> 11 - 4;
		f1 (k);
		f1 (l);
fin

principio
	f2 (i, j);
fin







