package Interface.ApplyingInterface;

/**
 * 
 * @author Aronno
 *
 */

// An implementation of IntStack that uses fixed storage.
class FixedStack implements IntStack {

	private int stck[];
	private int tos;

	// Allocate and initialized stack
	FixedStack(int size) {
		stck = new int[size];
		tos = -1;
	}

	// Push an item onto the Stack

	@Override
	public void push(int item) {

		if (tos == stck.length - 1) // Use length number
			System.out.println("Stack is full.");
		else
			stck[++tos] = item;

	}

	// Pop an item form the Stack

	@Override
	public int pop() {

		if (tos < 0) {
			System.out.println("Stack is Underflow");
			return 0;
		} else
			return stck[tos--];

	}

}

public class IFTest {

	public static void main(String[] args) {

		FixedStack myStack1 = new FixedStack(5);
		FixedStack myStack2 = new FixedStack(8);

		// Push some item onto the Stack
		for (int i = 0; i < 5; i++)
			myStack1.push(i);
		for (int i = 0; i < 8; i++)
			myStack2.push(i);

		// Pop those numbers off the Stack
		System.out.println(" Stack in myStack1:");
		for (int i = 0; i < 5; i++)
			System.out.println(myStack1.pop());

		System.out.println(" Stack in myStack2:");
		for (int i = 0; i < 8; i++)
			System.out.println(myStack2.pop());

	}

}