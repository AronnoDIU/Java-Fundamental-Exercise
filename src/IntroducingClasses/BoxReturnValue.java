package IntroducingClasses;

/**
 * 
 * @author Aronno
 *
 */

// Now, volume() returns  the volume of a Box.

class Box4 {
	double width;
	double height;
	double depth;

	// Compute and return volume.
	double volume() {
		return width * height * depth;
	}
}

public class BoxReturnValue {

	public static void main(String[] args) {

		Box4 myBox1 = new Box4();
		Box4 myBox2 = new Box4();
		double volume;

		// Assign values to myBox1's instance variable.
		myBox1.width = 10;
		myBox1.height = 20;
		myBox1.depth = 15;

		// Assign different values to myBox2's instance variable.
		myBox2.width = 3;
		myBox2.height = 6;
		myBox2.depth = 9;

		// get volume of the first Box
		volume = myBox1.volume();
		System.out.println("Volume is " + volume);

		// get volume of the second Box
		volume = myBox2.volume();
		System.out.println("Volume is " + volume);

	}

}