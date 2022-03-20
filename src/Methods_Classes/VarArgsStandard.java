package Methods_Classes;

/**
 * 
 * @author Aronno
 *
 */

// Use variable arguments with standard arguments. 
public class VarArgsStandard {

	// Here, msg is a normal parameter and var is a
	// variable arguments parameter.
	static void varTest(String msg, int... var) {
		System.out.print(msg + var.length + " Contents: ");

		for (int x : var)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		varTest("One varArgs: ", 10);
		varTest("Three varArgs: ", 1, 2, 3);
		varTest("No varArgs: ");

	}

}
