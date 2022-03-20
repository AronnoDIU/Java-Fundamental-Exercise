package Inheritance;

/**
 * 
 * @author Aronno
 *
 */

// This program uses inheritance to extends BoxInheritance.
class BoxInheritance {
	double width;
	double height;
	double depth;

	// Construct clone of an object
	BoxInheritance(BoxInheritance obj) { // Pass object to constructor.
		width = obj.width;
		height = obj.height;
		depth = obj.depth;
	}

	// Constructor used when all dimension specified.
	BoxInheritance(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// Constructor used when no dimension specified.
	BoxInheritance() {
		width = -1; // Use -1 to indicate
		height = -1; // an uninitialized
		depth = -1; // BoxInheritance
	}

	// Constructor used when cube is created
	BoxInheritance(double len) {
		width = height = depth = len;
	}

	// Compute and return volume
	double volume() {
		return width * height * depth;
	}
}

// Here, BoxInheritance is extended to include weight
class BoxWeight extends BoxInheritance {
	double weight; // Weight of BoxInheritance

	// Constructor for BoxWeight
//	BoxWeight(double w, double h, double d, double m) {
//		width = w;
//		height = h;
//		depth = d;
//		weight = m;
//	}

	// Alternatively, we can use..

	// BoxWeight now uses super to initialized its BoxInheritance attribute.
	BoxWeight(double w, double h, double d, double m) {
		super(w, h, d); // Call superclass constructor
		weight = m;
	}
}

//Here, BoxInheritance is extended to include color
class BoxColor extends BoxInheritance {
	int color; // Color of BoxInheritance

	// Constructor for BoxColor
	BoxColor(double w, double h, double d, int c) {
		width = w;
		height = h;
		depth = d;
		color = c;
	}
}

public class DemoBoxWeight {

	public static void main(String[] args) {

		BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);

		BoxColor myBox3 = new BoxColor(5, 8, 15, 55); // Extend for color of BoxInheritance

		double volm;

		volm = myBox1.volume();
		System.out.println("Volume of myBox1 is " + volm);
		System.out.println("Weight of myBox1 is " + myBox1.weight);
		System.out.println();

		volm = myBox2.volume();
		System.out.println("Volume of myBox2 is " + volm);
		System.out.println("Weight of myBox2 is " + myBox2.weight);
		System.out.println();

		// Extend for color of BoxInheritance
		volm = myBox3.volume();
		System.out.println("Volume of myBox3 is " + volm);
		System.out.println("Color of myBox3 is " + myBox3.color);
		System.out.println();

	}

}