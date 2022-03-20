package Inheritance;

/**
 * 
 * @author Aronno
 *
 */

// Using Abstract methods and classes.
abstract class FigureAbst {
	double dim1;
	double dim2;

	FigureAbst(double a, double b) {
		dim2 = a;
		dim2 = b;
	}

	// Area is now an abstract method
	abstract double area();
}

class RectangleAbst extends FigureAbst {

	RectangleAbst(double a, double b) {
		super(a, b);
	}

	// override area for RectangleAbst

	@Override
	double area() {
		System.out.println("Inside Area for RectangleAbst");
		return dim1 * dim2;
	}

}

class TriangleAbst extends FigureAbst {

	TriangleAbst(double a, double b) {
		super(a, b);
	}

	// Override Area for TriangleAbst

	@Override
	double area() {
		System.out.println("Inside Area for TriangleAbst");
		return dim1 * dim2 / 2;
	}
}

public class AbstractAreas {

	public static void main(String[] args) {

//		FigureAbst f=new FigureAbst(10, 10); // Illegal now

		RectangleAbst r = new RectangleAbst(9, 5);
		TriangleAbst t = new TriangleAbst(10, 8);
		FigureAbst figref; // This is OK, no object is created

		figref = r;
		System.out.println("Area is " + figref.area());

		figref = t;
		System.out.println("Area is " + figref.area());

	}

}