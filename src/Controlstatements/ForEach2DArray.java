package Controlstatements;

/**
 * 
 * @author Aronno
 *
 */

// Use for-each style for on a two-dimensional Array
public class ForEach2DArray {

	public static void main(String[] args) {

		int nums[][] = new int[3][5];
		int sum = 0;

		// give nums some values
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 5; j++)
				nums[i][j] = (i + 1) * (j + 1);

		// Use for-each for to display and sum the values..
		for (int x[] : nums) { // In the program, pay special attention to this line:
			for (int y : x) {
				System.out.println("Value is : " + y);
				sum += y;
			}
		}
		System.out.println("Summation: " + sum);

	}

}