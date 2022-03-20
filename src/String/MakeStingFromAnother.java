package String;

/**
 * 
 * @author Aronno
 *
 */

// Construct one Stirng from another String
public class MakeStingFromAnother {

	public static void main(String[] args) {

		char c[] = { 'A', 'R', 'O', 'N', 'N', 'O' };
		String s1 = new String(c);
		String s2 = new String(s1);

		System.out.println(s1);
		System.out.println(s2);

	}

}