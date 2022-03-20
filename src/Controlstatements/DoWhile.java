package Controlstatements;

/**
 * 
 * @author Aronno
 *
 */

// Demonstrate the do-while loop..
public class DoWhile {

	public static void main(String[] args) {

		int n = 10;

//		do {
//			System.out.println("tick " + n);
//			n--;
//		} while (n > 0);

		System.out.println();

//		The loop in the preceding program, while technically correct, can be written
//		more efficiently as follows:

		do {
			System.out.println("tick " + n);
		} while (--n > 0);
	}

}