package Inheritance;

/**
 * 
 * @author Aronno
 *
 */

// Method overriding.

// Methods with differing type signatures are overloaded-
// Not overridden
class AOverrid {
	int i, j;

	AOverrid(int a, int b) {
		i = a;
		j = b;
	}

	// Display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

// Create a subclass by  extending class AOverrid
class BOverrid extends AOverrid {
	int k;

	BOverrid(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	// Display k - this overrides show() in AOverrid
//	void show() {
//		super.show(); // this call AOverrid's show()
//		System.out.println("k: " + k);
//	}

	// Overload show()
	void show(String msg) {
		System.out.println(msg + k);
	}
}

public class override {

	public static void main(String[] args) {

		BOverrid subObj = new BOverrid(1, 2, 3);

//		subObj.show(); // This call show() in BOverrid

		subObj.show("This is k: "); // This calls show() in BOverrid
		subObj.show(); // This calls show() in AOverrid

	}

}