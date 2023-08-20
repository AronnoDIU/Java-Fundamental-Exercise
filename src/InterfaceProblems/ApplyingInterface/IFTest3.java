package Interface.ApplyingInterface;

/**
 * 
 * @author Aronno
 *
 */

/*
 * Create an Interface variable and access Stacks through it.
 */
public class IFTest3 {

	public static void main(String[] args) {

		IntStack myStack; // create an interface reference.
		DynStack dyStack = new DynStack(5);
		FixedStack fixStack = new FixedStack(8);

		// Push some numbers onto the Stack;

		myStack = dyStack; // Load dynamic Stack;
		for (int i = 0; i < 12; i++)
			myStack.push(i);

		myStack = fixStack; // Load Fixed Stack;
		for (int i = 0; i < 8; i++)
			myStack.push(i);

		// Pop some numbers form the Stack;

		myStack = dyStack;
		System.out.println("Values in Dynamic Stack:");
		for (int i = 0; i < 12; i++)
			System.out.println(myStack.pop());

		myStack = fixStack;
		System.out.println("Values in Fixed Stack:");
		for (int i = 0; i < 8; i++)
			System.out.println(myStack.pop());

	}

}