package Inheritance;

/**
 * 
 * @author Aronno
 *
 */

// A Simple demonstration of Abstract.
abstract class AAbst {
	abstract void callMe();

	// Concrete methods are still allowed in abstract classes.
	void callmeToo() {
		System.out.println("This is a concrete method");
	}
}

class BAbst extends AAbst {

	@Override
	void callMe() {
		System.out.println("BAbst's implementation of callMe");

	}
}

public class AbstractDemo {

	public static void main(String[] args) {

		BAbst b = new BAbst();

		b.callMe();
		b.callmeToo();

	}

}