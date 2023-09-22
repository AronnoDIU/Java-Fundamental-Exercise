package CollectionsFramework.ListInterface.VectorStack;

import java.util.Iterator;
import java.util.Stack;

/*#Stack:
    Stack class models and implements the Stack data structure. The class is based on the basic
    principle of last-in-first-out. In addition to the basic push and pop operations, the
    class provides three more functions empty, search, and peek. The class can also be
    referred to as the subclass of Vector. */
public class StackEx1 {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("This");
        stringStack.push("is");
        stringStack.push("Aronno");
        stringStack.push("Here");

        // Iterator for the stringStack
        Iterator<String> stringIterator = stringStack.iterator();

        // Printing the stringStack
        while (stringIterator.hasNext()) {
            System.out.print(stringIterator.next() + " ");
        }

        System.out.println();

        stringStack.pop();

        // Iterator for the stringStack
        stringIterator = stringStack.iterator();

        // Printing the stringStack
        while (stringIterator.hasNext()) {
            System.out.print(stringIterator.next() + " ");
        }
    }
}

/*Expected Output:

This is Aronno Here
This is Aronno

* */