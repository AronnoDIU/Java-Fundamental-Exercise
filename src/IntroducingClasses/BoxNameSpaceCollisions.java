package IntroducingClasses;

/**
 * 
 * @author Aronno
 *
 */

// Here, use this to resolve name-space collisions.
class Box8 {
	double width;
	double height;
	double depth;

	// this is the constructor for box.
	Box8(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	// Compute and return volume.
	double volume() {
		return width * height * depth;
	}
}

public class BoxNameSpaceCollisions {

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