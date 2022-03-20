package Methods_Classes;

/**
 * 
 * @author Aronno
 *
 */

// Demonstrate variable-length arguments
public class VarLengthArgs {

	// varTest() now uses a varargs.
	static void varTest(int... var) {
		System.out.print("Number of args: " + var.length + " Contents: ");

		for (int x : var)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		// Notice how varTest() can be called with a
		// variable number of arguments.
		varTest(10); // 1 arg
		varTest(1, 2, 3); // 3 args
		varTest(); // No args

	}

}