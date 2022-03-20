package ExceptionHandling;

/**
 * 
 * @author Aronno
 *
 */

// Demonstrate Throw.
public class ThrowDemo {

	static void demoProc() {
		try {
			throw new NullPointerException("Demo");
		} catch (NullPointerException e) {
			System.out.println("Caught inside demoProc: ");
			throw e; // Rethrow the exception
		}
	}

	public static void main(String[] args) {

		try {
			demoProc();
		} catch (NullPointerException e) {
			System.out.println("Recought:" + e);
		}

	}

}