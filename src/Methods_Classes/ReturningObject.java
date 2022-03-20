package Methods_Classes;

/**
 * 
 * @author Aronno
 *
 */

// returning an object.
class TestReturnObj {
	int a;

	TestReturnObj(int i) {
		a = i;
	}

	TestReturnObj increaseByTen() {
		TestReturnObj temp = new TestReturnObj(a + 10);
		return temp;
	}
}

public class ReturningObject {

	public static void main(String[] args) {

		TestReturnObj obj1 = new TestReturnObj(2);
		TestReturnObj obj2;

		obj2 = obj1.increaseByTen();
		System.out.println("obj1.a: " + obj1.a);
		System.out.println("obj2.a: " + obj2.a);

		obj2 = obj2.increaseByTen();
		System.out.println("obj2.a after second increase: " + obj2.a);

	}

}