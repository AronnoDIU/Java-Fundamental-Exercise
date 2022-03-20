package Controlstatements;

/**
 * 
 * @author Aronno
 *
 */

// Using continue with a label.
public class ContinueLabel {

	public static void main(String[] args) {

		Outer: for (var i = 0; i < 10; i++) {
			for (var j = 0; j < 10; j++) {
				if (j > i) {
					System.out.println();
					continue Outer;
				}
				System.out.print(" " + (i * j));
			}
		}
		System.out.println();

	}

}