package ExceptionHandling;

/**
 * 
 * @author Aronno
 *
 */

//  An example of nested try statements.
public class NestedTry {

	public static void main(String[] args) {

		try {
			int a = args.length;

			/*
			 * If no command-line args are present, the following statement will generate a
			 * divided-by-zero exception.
			 */

			int b = 42 / a;

			System.out.println("a = " + a);

			try { // Nested try block

				/*
				 * If one command-line arg is used, then generate an divided-by-zero exception.
				 */

				if (a == 1)
					a = a / (a - a); // Devided by zero

				/*
				 * If two command-line args are used,
				 * 
				 * then generate an out-of-bound exception.
				 */

				if (a == 2) {
					int c[] = { 1 };
					c[42] = 99; // Generate an out-of-bound exception.

				}

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index out-of-bound: " + e);
			}

		} catch (ArithmeticException e) {
			System.out.println();
		}

	}

}