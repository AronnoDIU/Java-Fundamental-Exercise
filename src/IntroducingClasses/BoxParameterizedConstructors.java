package IntroducingClasses;

/**
 * 
 * @author Aronno
 *
 */

// Here, Box uses a parameterized constructors to initialize the dimensions of a box.
class Box7 {
	double width;
	double height;
	double depth;

	// this is the constructor for box.
	Box7(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// Compute and return volume.
	double volume() {
		return width * height * depth;
	}
}

public class BoxParameterizedConstructors {

	public static void main(String[] args) {

		// Declare, Allocate and initialize
		Box7 myBox1 = new Box7(10, 20, 15);
		Box7 myBox2 = new Box7(3, 6, 9);

		double volume;

		// get volume of the first Box
		volume = myBox1.volume();
		System.out.println("Volume is " + volume);

		// get volume of the second box
		volume = myBox2.volume();
		System.out.println("Volume is  " + volume);

	}

}