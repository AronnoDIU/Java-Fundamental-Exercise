package Interface.DefaultInterfaceMethods.PrivateInterfaceMethods;

/**
 * 
 * @author Aronno
 *
 */

// Another version of InterfaceStack that has a private interface
// method that is used  by two default methods.
public interface InterfaceStack {

	void push(int item); // Store an item

	int pop(); // Retrieve an item

//	default void defaultMethod() {
//		privateMethod("Hello from the default method!");
//	}

	/*
	 * A default method that returns an array that contains the top n elements on
	 * the stack.
	 */
	default int[] popNElements(int n) {
		// Return the request elements.
		return getElements(n);
	}

	/*
	 * A default method that returns an array that contains the nest n elements on
	 * the stack after skipping elements.
	 */

	default int[] skipAndPopNElements(int skip, int n) {

		// Skip the specified number of elements.
		getElements(skip);

		// Return the request elements.
		return getElements(n);
	}

	/*
	 * A private method that returns an array that contains the top n elements on
	 * the stack.
	 */

	private int[] getElements(int n) {

		int[] elements = new int[n];

		for (int i = 0; i < n; i++)
			elements[i] = pop();
		return elements;

	}

//	public static void privateDefault(int i) {
//		getElements(i);
//	}

}