package Methods_Classes;

/**
 * 
 * @author Aronno
 *
 */

// Objects are passed through their references.
class TestReference {
	int a, b;

	TestReference(int i, int j) {
		a = i;
		b = j;
	}

	// pass an object
	void meth(TestReference obj) {
		obj.a *= 2;
		obj.b *= 2;
	}
}

public class ObjectPassByReference {

	public static void main(String[] args) {

		TestReference obj = new TestReference(15, 20);
		System.out.println("obj.a and obj.b before call: " + obj.a + " " + obj.b);

		obj.meth(obj);
		System.out.println("obj.a and obj.b after call: " + obj.a + " " + obj.b);

	}

}