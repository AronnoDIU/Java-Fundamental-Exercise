package IntroducingClasses;

/**
 * 
 * @author Aronno
 *
 */

// Here, Box uses a constructor to initialized the dimension of a Box.

class Box6 {
	double width;
	double height;
	double depth;

	// This is a constructor for Box
	Box6() {
		System.out.println("Constructing Box");
		width = 10;
		height = 10;
		depth = 10;
	}

	// Compute and return volume.
	double volume() {
		return width * height * depth;
	}
}

public class BoxConstructor {

	public static void main(String[] args) {

		// Declare, Allocate and initialize
		Box6 myBox1 = new Box6();
		Box6 myBox2 = new Box6();

		double volume;

		// get volume of the first Box
		volume = myBox1.volume();
		System.out.println("Volume is " + volume);

		// get volume of the second box
		volume = myBox2.volume();
		System.out.println("Volume is  " + volume);

	}

}