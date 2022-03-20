package Methods_Classes;

/**
 * 
 * @author Aronno
 *
 */

// here,  BoxObj allows one object to initialized another.
class BoxObj {
	double width;
	double height;
	double depth;

	// Notice this constructor. I takes an object of type BoxObj.
	BoxObj(BoxObj obj) { // Pass object to constructor
		width = obj.width;
		height = obj.height;
		depth = obj.depth;
	}

	// Constructor used when all dimensions specified.
	BoxObj(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// Constructor used when no dimensions specified.
	BoxObj() {
		width = -1; // Use -1 to indicate
		height = -1; // an uninitialized
		depth = -1; // BoxObj
	}

	// Constructor used when cube is created.
	BoxObj(double len) {
		width = height = depth = len;
	}

	// Compute and return volume
	double volume() {
		return width * height * depth;

	}
}

public class OverloadConstructor2Object {

	public static void main(String[] args) {

		// Create boxes using the various constructors.
		BoxObj myBox1 = new BoxObj(10, 20, 15);
		BoxObj myBox2 = new BoxObj();
		BoxObj myBoxCube = new BoxObj(7);

		BoxObj myBoxClone = new BoxObj(myBox1); // Create copy of myBox1

		double vlume;

		// Get volume of first BoxObj
		vlume = myBox1.volume();
		System.out.println("Volume of myBox1 is " + vlume);

		// Get volume of second BoxObj
		vlume = myBox2.volume();
		System.out.println("Volume of myBox2 is " + vlume);

		// Get volume of cube
		vlume = myBoxCube.volume();
		System.out.println("Volume of myBoxCube is " + vlume);

		// Get volume of clone
		vlume = myBoxClone.volume();
		System.out.println("Volume of myBoxClone is " + vlume);

	}

}