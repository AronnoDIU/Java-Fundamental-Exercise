package Methods_Classes;

/**
 * 
 * @author Aronno
 *
 */

// Use an array  to pass a variable number of
// Arguments to  a method. This is the old-style
// Approach to  variable-length  arguments.
public class PassArrayVarArgs {
	static void varTest(int var[]) {
		System.out.print("Number of args: " + var.length + " contents: ");

		for (int x : var)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		// notice how an array must be created to
		// hold the arguments.
		int n1[] = { 10 };
		int n2[] = { 1, 2, 3 };
		int n3[] = {};

		varTest(n1); // 1 arg
		varTest(n2); // 3 args
		varTest(n3); // no args

	}

}