package Methods_Classes;

/**
 * 
 * @author Aronno
 *
 */

// Object may be passed to methods.
class Test {
	int a, b;

	Test(int i, int j) {
		a = i;
		b = j;
	}

	// Return if obj is equal to the invoking object.
	boolean equalTo(Test obj) {
		if (obj.a == a && obj.b == b)
			return true;
		else
			return false;

	}
}

public class PassObjectAsParam {

	public static void main(String[] args) {

		Test obj1 = new Test(100, 22);
		Test obj2 = new Test(100, 22);
		Test obj3 = new Test(-1, -1);

		System.out.println("obj1 == obj2: " + obj1.equalTo(obj2));
		System.out.println("obj1 == obj3: " + obj1.equalTo(obj3));

	}

}