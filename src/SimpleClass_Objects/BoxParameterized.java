package IntroducingClasses;

/**
 * 
 * @author Aronno
 *
 */

// this program uses a parameterized method.

class Box5 {
	double width;
	double height;
	double depth;

	// Compute and return volume.
	double volume() {

		return width * height * depth;
	}

	// Sets dimensions of Box.
	void setDimention(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
}

public class BoxParameterized {

	public static void main(String[] args) {

		Box5 myBox1 = new Box5();
		Box5 myBox2 = new Box5();
		double volume;

		// Initialize each Box
		myBox1.setDimention(10, 20, 15);
		myBox2.setDimention(3, 6, 9);

		// get volume of the first Box
		volume = myBox1.volume();
		System.out.println("Volume is " + volume);

		// get volume of the second box
		volume = myBox2.volume();
		System.out.println("Volume is  " + volume);

	}

}