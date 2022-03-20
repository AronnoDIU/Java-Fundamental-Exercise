package Inheritance;

/**
 * 
 * @author Aronno
 *
 */

/*
 * In a class hierarchy, private members remain private to their class.
 * 
 * This program contain an error and will not compile.
 */

// Create a Superclass
class ASuper {
	int i; // default access
	private int j; // private to A

	void setIJ(int x, int y) {
		i = x;
		j = y;
	}
}

// A's j is not  accessible  here.
class BSub extends ASuper {
	int total;

	void sum() {
//		total=i+j; // ERROR, j is  not accessible here.
		System.out.println("ERROR, j is  not accessible here.");
	}
}

public class MemberAccessInheritance {

	public static void main(String[] args) {

		BSub subObj = new BSub();

		subObj.setIJ(10, 20);

		subObj.sum();
		System.out.println("Total is " + subObj.total);

	}

}