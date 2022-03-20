package Methods_Classes;

/**
 * 
 * @author Aronno
 *
 */

// Local variable type interface with a user-defined class type.
class MyClass {
	private int i;

	MyClass(int k) {
		i = k;
	}

	int getI() {
		return i;
	}

	void setI(int k) {
		if (k >= 0)
			i = k;
	}
}

public class RefVarDemo {

	public static void main(String[] args) {

		var myClass = new MyClass(10); // Notice, the use of var here.

		System.out.println("Value of i in myClass is " + myClass.getI());

		myClass.setI(19);
		System.out.println("Value of i in myClass is now " + myClass.getI());

	}

}