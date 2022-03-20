package IntroducingClasses;

/**
 * 
 * @author Aronno
 *
 */

 // A program that uses the box class. Call this file BoxSimpleClass.java
class Box {
	double width;
	double height;
	double depth;
}

// This class declares an object of type Box
public class BoxSimpleClass {

	public static void main(String[] args) {

		Box myBox = new Box();
		double volume;

		// Assign value to myBox's instance variable.
		myBox.width = 10;
		myBox.height = 20;
		myBox.depth = 15;

		// Compute volume of Box
		volume = myBox.width * myBox.height * myBox.depth;
		System.out.println("Volume is " + volume);

	}

}