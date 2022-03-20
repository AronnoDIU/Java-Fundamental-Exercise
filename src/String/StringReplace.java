package String;

/**
 * 
 * @author Aronno
 *
 */

// Substring Replacement
public class StringReplace {

	public static void main(String[] args) {

		String org = "This is a test. this is, too.";
		String search = "is";
		String sub = "was";
		String result = "";
		int i;

		do { // Replace All matching substrings.
			System.out.println(org);
			i = org.indexOf(search);

			if (i != -1) {
				result = org.substring(0, i);
//				result += sub;
				result = result + sub;
				result = result + org.substring(i + search.length());
				org = result;
			}
		} while (i != -1);

		// Instead using replace( ) method..

		String s1 = "Hello".replace('l', 'w');
		System.out.println(s1);

		// Demonstrate trim() and strip()..

		String s2 = " 	Hello World		".trim();
		System.out.println(s2);

		String s3 = "  	Hello World 	".strip();
		System.out.println(s3);

	}

}