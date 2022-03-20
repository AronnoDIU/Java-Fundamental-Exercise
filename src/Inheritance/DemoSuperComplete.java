package Inheritance;

/**
 * 
 * @author Aronno
 *
 */

// A complete implementation of BoxWeight.
class BoxImp {
	private double width;
	private double height;
	private double depth;

	// Constructor clone of an object
	BoxImp(BoxImp obj) { // Pass object to constructor
		width = obj.width;
		height = obj.height;
		depth = obj.depth;
	}

	// Constructor used when all dimension specified.
	BoxImp(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// Constructor used when no dimension specified.
	BoxImp() {
		width = -1; // Use -1 to indicate
		height = -1; // an uninitialized
		depth = -1; // BoxImp
	}

	// Constructor used when cube is created
	BoxImp(double len) {
		width = height = depth = len;
	}

	// Compute and return volume
	double volume() {
		return width * height * depth;
	}
}

// BoxWeight now fully implemented all constructors.
class BoxWeightImp extends BoxImp {
	double weight; // weight of BoxImp

	// Constructor clone of an object
	BoxWeightImp(BoxWeightImp obj) { // Pass object to constructor.
		super(obj);
		weight = obj.weight;
	}

	// Constructor used when all parameters are specified.
	BoxWeightImp(double w, double h, double d, double m) {
		super(w, h, d); // call superclass constructor.
		weight = m;
	}

	// Default constructor.
	BoxWeightImp() {
		super();
		weight = -1;
	}

	// Constructor used when cube is created.
	BoxWeightImp(double len, double m) {
		super(len);
		weight = m;
	}
}

public class DemoSuperComplete {

	public static void main(String[] args) {

		BoxWeightImp myBox1 = new BoxWeightImp(10, 20, 15, 34.3);
		BoxWeightImp myBox2 = new BoxWeightImp(2, 3, 4, 0.076);
		BoxWeightImp myBox3 = new BoxWeightImp(); // Default
		BoxWeightImp myCube = new BoxWeightImp(3, 2);
		BoxWeightImp myClone = new BoxWeightImp(myBox1);
		double volm;

		volm = myBox1.volume();
		System.out.println("Volume of myBox1 is " + volm);
		System.out.println("Weight of myBox1 is " + myBox1.weight);

		System.out.println();

		volm = myBox2.volume();
		System.out.println("Volume of myBox2 is " + volm);
		System.out.println("Weight of myBox2 is " + myBox2.weight);

		System.out.println();

		volm = myBox3.volume();
		System.out.println("Volume of myBox3 is " + volm);
		System.out.println("Weight of myBox3 is " + myBox3.weight);

		System.out.println();

		volm = myClone.volume();
		System.out.println("Volume of myClone is " + volm);
		System.out.println("Weight of myClone is " + myClone.weight);

		System.out.println();

		volm = myCube.volume();
		System.out.println("Volume of myCube is " + volm);
		System.out.println("Weight of myCube is " + myCube.weight);

		System.out.println();

	}

}