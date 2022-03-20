package String;

/**
 * 
 * @author Aronno
 *
 */

// Using concatenation to prevent long lines.
public class ConCat {

	public static void main(String[] args) {

		String longStr = "This could have been " + "a very long line that would have a"
				+ "wrapped around. But string concatenation " + "prevent this.";

		System.out.println(longStr);

		int age = 22;
		String s = "He is " + age + " years old";
		System.out.println(s);

		String s1 = "four: " + 2 + 2;
		System.out.println(s1);

		String s2 = "four: " + (2 + 2); // Now s contains the string "four: 4"
		System.out.println(s2);

	}

}