package ExceptionHandling;

/**
 * 
 * @author Yeasir Arafat Aronno
 *
 */
public class ExceptionDemo {

	public static void main(String[] args) {

		int d, a;

		try { // Block of code to monitor for errors
			d = 0;
			a = 42 / d;

			System.out.println("This will not be printed.");
		} catch (ArithmeticException e) { // Catch divided by zero error
			System.out.println("Divided by zero.");
		}
		System.out.println("After catch statement.");

	}

}