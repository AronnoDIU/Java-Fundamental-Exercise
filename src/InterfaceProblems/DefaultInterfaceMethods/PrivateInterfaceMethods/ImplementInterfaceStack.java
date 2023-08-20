package Interface.DefaultInterfaceMethods.PrivateInterfaceMethods;

/**
 * 
 * @author Yeasir Arafat Aronno
 *
 */
public class ImplementInterfaceStack implements InterfaceStack {

	private int stck[];
	private int tos;

	// allocate and initialized stack
	ImplementInterfaceStack(int size) {
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

	public int pop() {

		if (tos < 0) {
			System.out.println("Stack underflow.");
			return 0;
		} else
			return stck[tos--];
	}

	public static void main(String[] args) {

		ImplementInterfaceStack myStack1 = new ImplementInterfaceStack(5);
		ImplementInterfaceStack myStack2 = new ImplementInterfaceStack(8);

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

		// Default method calling

		System.out.println();

		/*
		 * Need to study more for those line of code
		 */

//		System.out.println(myStack1.popNElements(2));
//
//		System.out.println(myStack1.skipAndPopNElements(3, 0));

	}
}