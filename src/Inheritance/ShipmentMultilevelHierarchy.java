package Inheritance;

/**
 * 
 * @author Yeasir Arafat Aronno
 *
 */

// Extend BoxWeightMultiHier to  include shipping cost

// Start with BoxMultiHier
class BoxMultiHier {
	private double width;
	private double height;
	private double depth;

	// Construct clone of an Object
	BoxMultiHier(BoxMultiHier obj) { // Pass object to constructor.
		width = obj.width;
		height = obj.height;
		depth = obj.depth;
	}

	// Constructor used when all dimension specified.
	BoxMultiHier(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// Constructor used when no dimension specified.
	BoxMultiHier() {
		width = -1; // Use -1 to indicate
		height = -1; // an uninitialized
		depth = -1; // BoxMultiHier
	}

	// Constructor used when cube is created.
	BoxMultiHier(double len) {
		width = height = depth = len;
	}

	// Compute and return volume
	double volume() {
		return width * height * depth;
	}

}

// Add weight.
class BoxWeightMultiHier extends BoxMultiHier {
	double weight; // weight of BoxMultiHier

	// Construct clone of an object
	BoxWeightMultiHier(BoxWeightMultiHier obj) { // Pass object to constructor
		super(obj);
		weight = obj.weight;
	}

	// Constructor used when all dimension specified
	BoxWeightMultiHier(double w, double h, double d, double m) {
		super(w, h, d); // Call superclass constructor
		weight = m;
	}

	// Default constructor
	BoxWeightMultiHier() {
		super();
		weight = -1;
	}

	// Constructor used when cube is created
	BoxWeightMultiHier(double len, double m) {
		super(len);
		weight = m;
	}
}

// Add  shipment Cost
class ShipmentMultiHier extends BoxWeightMultiHier {
	double cost;

	// Construct clone of an object
	ShipmentMultiHier(ShipmentMultiHier obj) { // Pass object to constructor.
		super(obj);
		cost = obj.cost;
	}

	// Constructor used when all dimension specified
	ShipmentMultiHier(double w, double h, double d, double m, double c) {
		super(w, h, d, m);
		cost = c;
	}

	// Default constructor
	ShipmentMultiHier() {
		super();
		cost = -1;
	}

	// Constructor used when cube is created
	ShipmentMultiHier(double len, double m, double c) {
		super(len, m);
		cost = c;
	}
}

public class ShipmentMultilevelHierarchy {

	public static void main(String[] args) {

		ShipmentMultiHier shipment1 = new ShipmentMultiHier(10, 20, 15, 10, 3.41);
		ShipmentMultiHier shipment2 = new ShipmentMultiHier(2, 3, 4, 0.76, 1.28);

		double volm;

		volm = shipment1.volume();
		System.out.println("Volume of shipment1: " + volm);
		System.out.println("Weight of shipment1: " + shipment1.weight);
		System.out.println("Shipping cost: $" + shipment1.cost);
		System.out.println();

		volm = shipment2.volume();
		System.out.println("Volume of shipment2: " + volm);
		System.out.println("Weight of shipment2: " + shipment2.weight);
		System.out.println("Shipping cost: $" + shipment2.cost);
		System.out.println();

	}

}