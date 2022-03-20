package ExceptionHandling;

/**
 * 
 * @author Aronno
 *
 */

// Demonstrate exception chaining
public class ChainExceptionDemo {

	static void demoproc() {

		// Create an exception
		NullPointerException e = new NullPointerException("Top Layer");

		// Add a cause
		e.initCause(new ArithmeticException("Cause"));

		throw e;
	}

	public static void main(String[] args) {

		try {
			demoproc();
		} catch (NullPointerException e) {
			System.out.println("Caught: " + e);

			// Display cause exception
			System.out.println("Original cause: " + e.getCause());
		}

	}

}