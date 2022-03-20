package Methods_Classes;

/**
 * 
 * @author Aronno
 *
 */

// A simple example of  recursion.
class Factorial {
	int fact(int n) {
		int result;

		if (n == 1)
			return 1;
		result = fact(n - 1) * n;
		return result;
	}
}

public class Recursion {

	public static void main(String[] args) {

		Factorial fobject = new Factorial();

		System.out.println("Factorial of 3 is " + fobject.fact(3));
		System.out.println("Factorial of 4 is " + fobject.fact(4));
		System.out.println("Factorial of 5 is " + fobject.fact(5));

	}

}