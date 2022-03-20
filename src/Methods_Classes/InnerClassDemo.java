package Methods_Classes;

/**
 * 
 * @author Aronno
 *
 */

// Demonstrate an inner class.
class Outer {
	int outer_x = 100;

	void test() {
		Inner inner = new Inner();
		inner.display();
		
		// Define a Inner class within a for loop.

		for (int i = 0; i < 10; i++) {
			class InnerInFor {
				void display() {
					System.out.println("Display: in for loop: " + outer_x);
				}
			}
			InnerInFor innerFor = new InnerInFor();
			innerFor.display();
		}
	}

	class Inner {
		void display() {
//			int y=10; // y is local to  Inner

			System.out.println("Display: outer_x: " + outer_x);
		}
//		void showY() {
//			System.out.println(y); // error, y not known here.
//		}
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {

		Outer outer = new Outer();
		outer.test();

	}

}