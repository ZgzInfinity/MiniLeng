package Foo;

public class ErrorSemantico extends Exception {

	// Error semantico personalizado del compilador
	public ErrorSemantico(String msg) {
	     System.out.println(" ERROR SEMANTICO : " + msg);
	}

}
