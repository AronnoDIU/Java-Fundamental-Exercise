package PrimitiveTypesData;

/**
 * 
 * @author Aronno
 *
 */

public class Light {

	public static void main(String[] args) {

		int lightSpeed;
		long days;
		long seconds;
		long distance;

		// Approximate speed of light in miles per second
		lightSpeed = 186000;

		days = 1000; // Specify number of days here

		seconds = days * 24 * 60 * 60; // Convert to Second

		distance = lightSpeed * seconds; // Compute Distance

		System.out.print("In " + days);
		System.out.print(" days light will travel about ");
		System.out.println(distance + " Miles.");

	}

}