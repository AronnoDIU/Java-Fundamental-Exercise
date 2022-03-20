package Methods_Classes;

/**
 * 
 * @author Aronno
 *
 */

// This program demonstrate the difference between public and private.
class AccessTest {
	int a; // Default access
	public int b; // public access
	private int c; // private access

	// Method to access c
	public void setC(int i) { // Set c's value
		c = i;
	}

	public int getC() { // get c's value
		return c;
	}
}

public class AccessControl {

	public static void main(String[] args) {

		AccessTest obj = new AccessTest();

		// These are OK, a and b may be access directly
		obj.a = 10;
		obj.b = 20;

		// This is not OK and will cause an error
//		obj.c = 100; //  Error

		// You must access c though its method
		obj.setC(100);
		System.out.println("a, b and c: " + obj.a + " " + obj.b + " " + obj.getC());
	}

}