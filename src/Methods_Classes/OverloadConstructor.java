package Methods_Classes;

/**
 * 
 * @author Aronno
 *
 */

/*
 * Here, BoxConstructor defines three constructors to initialize the dimensions
 * of a BoxConstructor various ways.
 */
class BoxConstructor {
	double width;
	double height;
	double depth;

	// Constructor used when all dimensions specified.
	BoxConstructor(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// Constructor used when no dimensions specified
	BoxConstructor() {
		width = -1; // Use -1 to indicate
		height = -1; // an uninitialized BoxConstructor
		depth = -1;
	}

	// Constructor used when cube is created.
	BoxConstructor(double len) {
		width = height = depth = len;
	}

	// Compute and return volume
	double volume() {
		return width * height * depth;
	}
}

public class OverloadConstructor {

	public static void main(String[] args) {

		// Create BoxConstructor's using the various constructors.
		BoxConstructor myBox1 = new BoxConstructor(10, 20, 15);
		BoxConstructor myBox2 = new BoxConstructor();
		BoxConstructor myBoxCube = new BoxConstructor(7);

		double vlume;

		// Get volume of first BoxConstructor
		vlume = myBox1.volume();
		System.out.println("Volume of myBox1 is " + vlume);

		// Get volume of second BoxConstructor
		vlume = myBox2.volume();
		System.out.println("Volume of myBox2 is " + vlume);

		// Get volume of cube BoxConstructor
		vlume = myBoxCube.volume();
		System.out.println("Volume of myBoxCube is " + vlume);

	}

}