package Inheritance;

/**
 * 
 * @author Aronno
 *
 */

// Using super to overcome name hiding.
class AFirst {
	int i;
}

// Create a subclass by extending class AFirst
class BSecond extends AFirst {
	int i; // This i hides the i in AFirst

	BSecond(int a, int b) {
		super.i = a; // i in AFirst
		i = b; // i in BSecond
	}

	void show() {
		System.out.println("i in Superclass: " + super.i);
		System.out.println("i in Subclass: " + i);
	}
}

public class SuperOverNameHiding {

	public static void main(String[] args) {
		BSecond subObj = new BSecond(1, 2);

		subObj.show();

	}

}