package Methods_Classes;

/**
 * 
 * @author Aronno
 *
 */

// Primitive types are passed by value.
class TestPrimitive {
	void meth(int i, int j) {
		i *= 2;
		j *= 2;
	}
}

public class CallByValue {

	public static void main(String[] args) {

		TestPrimitive obj = new TestPrimitive();

		int a = 15, b = 20;

		System.out.println("a and b before call " + a + " " + b);

		obj.meth(a, b);
		System.out.println("a and b after call " + a + " " + b);

	}

}