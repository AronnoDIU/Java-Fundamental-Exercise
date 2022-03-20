package Methods_Classes;

import java.util.Stack;

public class TestStackInt {

	public static void main(String[] args) {

		Stack<Integer> myStack1 = new Stack<Integer>();
		Stack<Integer> myStack2 = new Stack<Integer>();

		// Push some numbers onto the stack
		for (int i = 0; i < 10; i++)
			myStack1.push(i);
		for (int i = 10; i < 20; i++)
			myStack2.push(i);

		// Pop those numbers off the stack
		System.out.println("Stack in myStack1:");
		for (int i = 0; i < 10; i++)
			System.out.println(myStack1.pop());

		System.out.println("Stack in myStack2:");
		for (int i = 0; i < 10; i++)
			System.out.println(myStack2.pop());

		// These statement are not legal
		// myStack1.tos=-2;
		// myStack2.stck[3]=100;

	}

}