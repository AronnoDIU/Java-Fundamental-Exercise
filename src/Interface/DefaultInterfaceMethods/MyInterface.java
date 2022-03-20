package Interface.DefaultInterfaceMethods;

/**
 * 
 * @author Aronno
 *
 */

public interface MyInterface {

	// this is a "Normal" interface method declaration.
	// It does NOT define a default implementation.

	/*
	 * regular interface methods
	 */
	int getNumber();

	// This is a default method. Notice that it provides
	// a default implementation.

	// default method implementation
	default String getString() {
		return "Default String";
	}

	// This is a Static Interface Method.
	static int getDefaultNumber() {
		return 500;
	}

}