package IntroducingClasses;

import java.util.Stack;

/**
 * 
 * @author Aronno
 *
 */

// This class defines an integer stack that can hold 10 values.
//class Stack {
//	int stck[] = new int[10];
//	int tos;
//
//	// Initialize top-of-stack
//	Stack() {
//		tos = -1;
//	}
//
//	// Push an item onto the stack
//	void push(int item) {
//		if (tos == 9)
//			System.out.println("Stack is full.");
//		else
//			stck[++tos] = item;
//	}
//
//	// Pop an item form the stack
//	int pop() {
//		if (tos < 0) {
//			System.out.println("Stack underflow.");
//			return 0;
//		} else
//			return stck[tos--];
//	}
//}

public class StackTest {

	public static void main(String[] args) {

		Stack<Integer> myStack1 = new Stack<Integer>();
		Stack<Integer> myStack2 = new Stack<Integer>();

		// Push some numbers onto the stack
		for (int i = 0; i < 10; i++)
			myStack1.push(i);
		for (int i = 10; i < 20; i++)
			myStack2.push(i);

		// Pop those numbers off the stack.
		System.out.println("Stack in myStack1:");
		for (int i = 0; i < 10; i++)
			System.out.println(myStack1.pop());

		System.out.println("Stack  in myStack2:");
		for (int i = 0; i < 10; i++)
			System.out.println(myStack2.pop());

	}

}