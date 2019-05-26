%-------------------------------------------------
programa miniprub;
%-------------------------------------------------

entero i;


%-------------------------------------------------
accion dato;
%-------------------------------------------------

	%---------------------------------------------
	accion resul;
	%---------------------------------------------

		%-----------------------------------------
		accion paso;
		%-----------------------------------------		
	  	principio
  		    escribir("Estoy en paso  ", entacar(10), entacar(13));
  	  	fin
	principio
        escribir("Estoy en resul  ");
  		paso;
  	fin
principio
  	escribir("Estoy en dato  ");
  	resul;
fin
	

%--------------------------------------------------
accion productoN (ref entero a;  val entero n);
%--------------------------------------------------
principio
	a := a + n;
fin

%--------------------------------------------------
principio
	
	i := 1;
	escribir("i:", entacar(i), entacar(10), entacar(13));
	productoN(i, 5);
	escribir("i:", entacar(i), entacar(10), entacar(13));
	productoN(i, 2);
	escribir("i:", entacar(i), entacar(10), entacar(13));

fin