package ExceptionHandling;

/**
 * 
 * @author Aronno
 *
 */

/*
 * This program contain an error.
 * 
 * A subclass must come before its superclass in a series of catch statements.
 * If not, unreachable code will be created and a compile-time error will
 * result.
 */
public class SubSuperCatchRules {

	public static void main(String[] args) {

		try {
			int a = 0;
			int b = 42 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

	}

}