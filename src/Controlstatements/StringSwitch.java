package Controlstatements;

/**
 * 
 * @author Aronno
 *
 */

// Use a string to control a switch statements.
public class StringSwitch {

	public static void main(String[] args) {

		int target = 1;
		String str = "four";

		switch (str) {
		case "one":
			System.out.println("one");
			break;
		case "two":
			System.out.println("Two");
			break;
		case "three":
			System.out.println("Three");
			break;
		case "four":
			switch (target) { // Nested Switch ex
			case 0:
				System.out.println("target is zero");
				break;
			case 1: // No conflicts with outer switch
				System.out.println("target is one");
				break;

			} break;
		default:
			System.out.println("No Match");
			break;
		}

	}

}