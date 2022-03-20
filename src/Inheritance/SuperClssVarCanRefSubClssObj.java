package Inheritance;

/**
 * 
 * @author Aronno
 * 
 */

// This program uses inheritance to extends BoxInheritance.
//class BoxInheritance {
//	double width;
//	double height;
//	double depth;
//
//	// Construct clone of an object
//	BoxInheritance(BoxInheritance obj) { // Pass object to constructor.
//		width = obj.width;
//		height = obj.height;
//		depth = obj.depth;
//	}
//
//	// Constructor used when all dimension specified.
//	BoxInheritance(double w, double h, double d) {
//		width = w;
//		height = h;
//		depth = d;
//	}
//
//	// Constructor used when no dimension specified.
//	BoxInheritance() {
//		width = -1; // Use -1 to indicate
//		height = -1; // an uninitialized
//		depth = -1; // BoxInheritance
//	}
//
//	// Constructor used when cube is created
//	BoxInheritance(double len) {
//		width = height = depth = len;
//	}
//
//	// Compute and return volume
//	double volume() {
//		return width * height * depth;
//	}
//}
//
//// Here, BoxInheritance is extended to include weight
//class BoxWeight extends BoxInheritance {
//	double weight; // Weight of BoxInheritance
//
//	// Constructor for BoxWeight
//	BoxWeight(double w, double h, double d, double m) {
//		width = w;
//		height = h;
//		depth = d;
//		weight = m;
//	}
//}
//
////Here, BoxInheritance is extended to include color
//class BoxColor extends BoxInheritance {
//	int color; // Color of BoxInheritance
//
//	// Constructor for BoxColor
//	BoxColor(double w, double h, double d, int c) {
//		width = w;
//		height = h;
//		depth = d;
//		color = c;
//	}
//}
public class SuperClssVarCanRefSubClssObj {

	public static void main(String[] args) {

		BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
		BoxInheritance plainBox = new BoxInheritance();
		double volm;

		volm = weightBox.volume();
		System.out.println("Volume of weightBox is " + volm);
		System.out.println("Weight of weightBox is " + weightBox.weight);

		System.out.println();

		// Assign BoxWeight reference to BoxInheritance reference
		plainBox = weightBox;

		volm = plainBox.volume(); // OK, Volume defined in BoxInheritance
		System.out.println("Volume of plainBox is " + volm);

		/*
		 * The following statement is invalid because plainBox does not define a weight
		 * member.
		 */
//		System.out.println("Weight of plainBox is "plainBox.weight);

	}

}