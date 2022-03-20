package Methods_Classes;

/**
 * 
 * @author Aronno
 *
 */

// Another example that uses recursion.
class RecursiveTest {
	int values[];

	RecursiveTest(int i) {
		values = new int[i];
	}

	// Display array -- recursively
	// The recursive method printArray()
	// prints the first i element in array values.
	void printArray(int i) {
		if (i == 0)
			return;
		else
			printArray(i - 1);
		System.out.println("[" + (i - 1) + "] " + values[i - 1]);
	}
}

public class RecursionPrintElm {

	public static void main(String[] args) {

		RecursiveTest obj = new RecursiveTest(10);

		for (int i = 0; i < 10; i++)
			obj.values[i] = i;

		obj.printArray(10);

	}

}