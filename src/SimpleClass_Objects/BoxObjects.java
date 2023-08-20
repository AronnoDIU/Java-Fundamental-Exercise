package IntroducingClasses;

/**
 * 
 * @author Aronno
 *
 */

// This program declares two Box objects.

class Box2 {
	double Width;
	double height;
	double depth;
}

public class BoxObjects {

	public static void main(String[] args) {

		Box2 myBox1 = new Box2();
		Box2 myBox2 = new Box2();
		double volume;

		// Assign values to myBox1's instance variables.
		myBox1.Width = 10;
		myBox1.height = 20;
		myBox1.depth = 15;

		/* Assign different values to myBox2 instance values */
		myBox2.Width = 3;
		myBox2.height = 6;
		myBox2.depth = 9;

		// Compute volume of the first box.
		volume = myBox1.Width * myBox1.height * myBox1.depth;
		System.out.println("Volume is " + volume);

		// Compute volume of the second Box.

		volume = myBox2.Width * myBox2.height * myBox2.depth;
		System.out.println("Volume is " + volume);

	}

}