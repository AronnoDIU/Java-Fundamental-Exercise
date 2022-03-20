package Methods_Classes;

/**
 * 
 * @author Aronno
 *
 */

// Improved Stack  class that uses the length array number.
class StackImprovedLength {
	private int stck[];
	private int tos;

	// Allocate and initialized stack
	StackImprovedLength(int size) {
		stck = new int[size];
		tos = -1;
	}

	// Push an item onto the stack
	void push(int item) {
		if (tos == stck.length - 1) // Use length
			System.out.println("Stack is full.");
		else
			stck[++tos] = item;
	}

	// Pop an item form the stack.
	int pop() {
		if (tos < 0) {
			System.out.println("Stack underflow.");
			return 0;
		} else
			return stck[tos--];
	}
}

public class StackUseLength {

	public static void main(String[] args) {

		StackImprovedLength myStack1 = new StackImprovedLength(5);
		StackImprovedLength myStack2 = new StackImprovedLength(8);

		// Push some numbers onto the Stack.
		for (int i = 0; i < 5; i++)
			myStack1.push(i);
		for (int i = 0; i < 8; i++)
			myStack2.push(i);

		// Pop some numbers off the Stack.
		System.out.println("Stack in myStack1: ");
		for (int i = 0; i < 5; i++)
			System.out.println(myStack1.pop());

		System.out.println("Stack in myStack2: ");
		for (int i = 0; i < 8; i++)
			System.out.println(myStack2.pop());

	}

}