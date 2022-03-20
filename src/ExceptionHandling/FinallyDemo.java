package ExceptionHandling;

/**
 * 
 * @author Aronno
 *
 */

// Demonstrate finally.

/*
 * REMEMBER If a finally block is associated with a try,
 * the finally block will be executed upon
 * conclusion of the try.
 */
public class FinallyDemo {

	// Throw an exception out of the method.
	static void procA() {
		try {
			System.out.println("Inside procA");
			throw new RuntimeException("Demo");
		} finally {
			System.out.println("procA's  finally");
		}
	}

	// Return form within a try block.
	static void procB() {
		try {
			System.out.println("Inside procB");
			return;
		} finally {
			System.out.println("procB's finally");
		}
	}

	// Execute a try block normally.
	static void procC() {
		try {
			System.out.println("Inside procC");
		} finally {
			System.out.println("procC's finally");
		}
	}

	public static void main(String[] args) {

		try {
			procA();
		} catch (RuntimeException e) {
			System.out.println();
		}

		procB();
		procC();

	}

}