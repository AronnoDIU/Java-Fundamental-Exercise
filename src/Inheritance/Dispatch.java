package Inheritance;

/**
 * 
 * @author Aronno
 *
 */

// Dynamic Method Dispatch
class ADynamic {
	void callMe() {
		System.out.println("Inside ADynamic's callMe method");
	}
}

class BDynamic extends ADynamic {
	// Override callme()
	void callMe() {
		System.out.println("Inside BDynamic's callMe method");
	}
}

class CDynamic extends ADynamic {
	// Override callme()
	void callMe() {
		System.out.println("Inside CDynamic's callMe method");
	}
}

public class Dispatch {

	public static void main(String[] args) {

		ADynamic a = new ADynamic(); // Object of type ADynamic
		BDynamic b = new BDynamic(); // Object of type BDynamic
		CDynamic c = new CDynamic(); // Object of type CDynamic

		ADynamic ref; // obtain a reference of type ADynamic

		ref = a; // ref refers to an ADynamic object
		ref.callMe(); // calls ADynamic's version of callMe

		ref = b; // ref refers to an BDynamic object
		ref.callMe(); // calls BDynamic's version of callMe

		ref = c; // ref refers to an CDynamic object
		ref.callMe(); // calls CDynamic's version of callMe

	}

}