package ExceptionHandling;

import java.util.Random;

/**
 * 
 * @author Aronno
 *
 */

// Handle an exception and move on.
public class HandleErrorMove {

	public static void main(String[] args) {

		int a = 0, b = 0, c = 0;
		Random random = new Random();

		for (int i = 0; i < 32000; i++) {
			try {
				b = random.nextInt();
				c = random.nextInt();
				a = 12345 / (b / c);
			} catch (ArithmeticException e) {
				System.out.println("Divided by zero: " + e);
				a = 0; // set a to zero and continue;
			}
			System.out.println("a: " + a);
		}

	}

}