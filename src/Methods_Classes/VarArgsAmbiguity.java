package Methods_Classes;

/**
 * 
 * @author Aronno
 *
 */

// VarArgs, Overloading and Ambiguity.
// This program contain an error and will not compile!
public class VarArgsAmbiguity {

	static void varTest(int... var) {
		System.out.print("varTest(int ...): " + "Number of args: " + var.length + " Contents: ");

		for (int x : var)
			System.out.print(x + " ");
		System.out.println();
	}

	static void varTest(boolean... var) {
		System.out.print("varTest(boolean ...): " + "Number of args " + var.length + " Contents: ");

		for (boolean x : var)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		varTest(1, 2, 3); // Ok
		varTest(true, false, false); // Ok
//		varTest(); // Error: Ambiguous!

	}

}