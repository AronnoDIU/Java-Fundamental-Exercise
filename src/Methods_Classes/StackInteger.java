package Methods_Classes;

public class StackInteger {
	/*
	 * Now, both stck and tos are private. This means that they cannot be
	 * accidentally or maliciously altered in a way that would be harmful to the
	 * stack.
	 */
	private int stck[] = new int[10];
	private int tos;

	// Initialized top-of-stack
	StackInteger() {
		tos = -1;
	}

	// Push an item onto the stack
	void push(int item) {
		if (tos == 9)
			System.out.println("Stack is full.");
		else
			stck[++tos] = item;
	}

	// Pop an item form the stack
	int pop() {
		if (tos < 0) {
			System.out.println("Stack underflow.");
			return 0;
		} else
			return stck[tos--];
	}

	public static void main(String[] args) {
		StackInteger obj = new StackInteger();
		obj.push(10);
		obj.pop();
	}

}