package String;

/**
 * 
 * @author Aronno
 *
 */

// Demonstrate getChars demo
public class GetCharsDemo {

	public static void main(String[] args) {

		String s = "This is a demo of the getChars method. ";
		int start = 10;
		int end = 30;
		char buf[] = new char[end - start];

		s.getChars(start, end, buf, 0);
		System.out.println(buf);
		
		// Alternative for  getChars to getByte example
		
//		String s2 = "This is a demo of the getChars method. ";
//		int start2 = 10;
//		int end2 = 30;
//		byte buff[] = new byte[end2 - start2];
//
//	    s2.getBytes(start2, end2, buff, 0);
//		System.out.println(buff);
		
//		To convert all the characters in a String object into a character
//		array, the easiest way is to call toCharArray( ). It returns an array of
//		characters for the entire string.
		
//		String s3 = "This is a demo of the getChars method. ";
//		int start3 = 10;
//		int end3 = 30;
//		char bufff[] = new char[end3 - start3];
//
//		s3.toCharArray();
//		System.out.println(bufff);

	}

}