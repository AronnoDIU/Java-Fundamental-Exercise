package Interface.ApplyingInterface;

/**
 * 
 * @author Aronno
 *
 */

// implements a "Growable" Stack.
class DynStack implements IntStack {

	private int stck[];
	private int tos;

	// allocate and initialized stack
	DynStack(int size) {
		stck = new int[size];
		tos = -1;
	}

	// Push an item onto the Stack

	@Override
	public void push(int item) {

		// If Stack is full, allocate a larger stack
		if (tos == stck.length - 1) {
			int temp[] = new int[stck.length * 2]; // double stack
			for (int i = 0; i < stck.length; i++)
				temp[i] = stck[i];
			stck = temp;
			stck[++tos] = item;
		} else
			stck[++tos] = item;
	}

	// Pop an item from the Stack

	@Override
	public int pop() {

		if (tos < 0) {
			System.out.println("Stack underflow.");
			return 0;
		} else
			return stck[tos--];
	}

}

public class IFTest2 {

	public static void main(String[] args) {

		DynStack myStack1 = new DynStack(5);
		DynStack myStack2 = new DynStack(8);

		// These loops cause each Stack to grow
		for (int i = 0; i < 12; i++)
			myStack1.push(i);
		for (int i = 0; i < 20; i++)
			myStack2.push(i);

		System.out.println(" Stack in myStack1:");
		for (int i = 0; i < 12; i++)
			System.out.println(myStack1.pop());

		System.out.println(" Stack in myStack2:");
		for (int i = 0; i < 20; i++)
			System.out.println(myStack2.pop());

	}

}