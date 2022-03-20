package Operators;

/**
 * 
 * @author Aronno
 *
 */

//Demonstrate a Left shifting a byte value.
public class ByteLeftShift {

	public static void main(String[] args) {

		byte a = 64, b;
		int i;

		i = a << 2;
		b = (byte) (a << 2);

		System.out.println("Original value of a = " + a);
		System.out.println("Original Value of i = " + i);
		System.out.println("i and b = " + i + " & " + b);

	}

}