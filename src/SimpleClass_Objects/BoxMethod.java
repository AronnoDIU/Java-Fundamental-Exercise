package IntroducingClasses;

/**
 * 
 * 
 * @author Aronno
 *
 */

// This program includes a method inside the Box class.

class Box3 {
	double width;
	double height;
	double depth;

	// Display volume of the Boxxx
	void volume() {
		System.out.print("Volume is ");
		System.out.println(width * height * depth);
	}
}

public class BoxMethod {

	public static void main(String[] args) {

		Box3 myBox1 = new Box3();
		Box3 myBox2 = new Box3();

		// Assign values to myBox1's instance variable.
		myBox1.width = 10;
		myBox1.height = 20;
		myBox1.depth = 15;

		// Assign different values to myBox2 instance values.
		myBox2.width = 3;
		myBox2.height = 6;
		myBox2.depth = 9;

		// Display volume of the first Box
		myBox1.volume();

		// Display volume of the second Box
		myBox2.volume();

	}

}