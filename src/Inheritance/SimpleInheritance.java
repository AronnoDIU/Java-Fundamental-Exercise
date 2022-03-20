package Inheritance;

/**
 * 
 * @author Aronno
 *
 */

// A simple example of  inheritance.

// Create a superclass.
class A {
	int i, j;

	void showIJ() {
		System.out.println("i and j : " + i + " " + j);
	}
}

// Create a subclass by extending class A
class B extends A {
	int k;

	void showK() {
		System.out.println("k: " + k);
	}

	void sum() {
		System.out.println("i+j+k: " + (i + j + k));
	}
}

public class SimpleInheritance {

	public static void main(String[] args) {

		A superObj = new A();
		B subObj = new B();

		// The superclass may be used by itself
		superObj.i = 10;
		superObj.j = 20;
		System.out.println("Contents of superObj: ");
		superObj.showIJ();
		System.out.println();

		/*
		 * the subclass has access to all ublic members of its superclass.
		 */
		subObj.i = 7;
		subObj.j = 8;
		subObj.k = 9;
		System.out.println("Contents of subObj: ");
		subObj.showIJ();
		subObj.showK();
		System.out.println();

		System.out.println("Sum of i,  j and k : ");
		subObj.sum();

	}

}