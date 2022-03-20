package String;

/**
 * 
 * @author Aronno
 *
 */

// Construct String from Subset of Char Array.
// Extended versions of the byte-to-string constructors.
public class SubStringCons {

	public static void main(String[] args) {

		byte ascii[] = { 65, 66, 67, 68, 69, 70 };

		String s1 = new String(ascii);
		System.out.println(s1);

		String s2 = new String(ascii, 2, 3); // Here, 2 is a "Where to Start"
		// then 3 is "How much to Display you want" .
		String s3 = new String(ascii, 1, 5);

		System.out.println(s2);
		System.out.println(s3);

	}

}