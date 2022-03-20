package String;

public class ToStringDemo {

	public static void main(String[] args) {

		Box b = new Box(10, 12, 15);
		String s = "Box b: " + b; // Concatenate Box object

		System.out.println(b); // Convert Box to String
		System.out.println(s);

	}

}

class Box {
	double width;
	double height;
	double depth;

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	public String toString() {
		return "Dimension are 	" + width + " by " + depth + " by " + height + ". ";
	}

}