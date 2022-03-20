package Controlstatements;

/**
 * 
 * @author Aronno
 *
 */
public class ForLoopBlockTest {

	public static void main(String[] args) {

		int x, y = 20;
		// the target of this loop is a block

		for (x = 0; x < 10; x++) {
			System.out.println("This is X: " + x);
			System.out.println("This is Y: " + y);

			y = y - 2;
		}

	}

}