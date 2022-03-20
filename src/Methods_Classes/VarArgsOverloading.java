package Methods_Classes;

/**
 * 
 * @author Aronno
 *
 */

// VarArgs and Overloading.
public class VarArgsOverloading {

	static void varTest(int... var) {
		System.out.print("varTest(int ...): " + "Number of args: " + var.length + " Contents: ");

		for (int x : var)
			System.out.print(x + " ");
		System.out.println();
	}

	static void varTest(boolean... var) {
		System.out.print("varTest(boolean ...):  " + "Number of args: " + var.length + " Contents: ");

		for (boolean x : var)
			System.out.print(x + " ");
		System.out.println();
	}

	static void varTest(String msg, int... var) {
		System.out.print("varTest(String, int ...):  " + msg + var.length + " Contents: ");

		for (int x : var)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		varTest(1, 2, 3);
		varTest("Testing: ", 10, 20);
		varTest(true, false, false);

	}

}