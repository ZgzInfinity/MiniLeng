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
	a := a * n;
fin

%--------------------------------------------------
accion sumarN (ref entero a;  val entero n);
%--------------------------------------------------
principio
	a := a + n;
fin

%--------------------------------------------------
accion cocienteN (ref entero a;  val entero n);
%--------------------------------------------------
principio
	a := a div n;
fin

%--------------------------------------------------
accion modN (ref entero a;  val entero n);
%--------------------------------------------------
principio
	a := a mod n;
fin


%--------------------------------------------------
principio
	
	i := 50;
	escribir("i:", entacar(i), entacar(10), entacar(13));
	productoN(i, 5);
	escribir("i:", entacar(i), entacar(10), entacar(13));
	sumarN(i, 20);
	escribir("i:", entacar(i), entacar(10), entacar(13));
	cocienteN(i, 3);
	escribir("i:", entacar(i), entacar(10), entacar(13));
	modN(i, 4);
	escribir("i:", entacar(i), entacar(10), entacar(13));

fin