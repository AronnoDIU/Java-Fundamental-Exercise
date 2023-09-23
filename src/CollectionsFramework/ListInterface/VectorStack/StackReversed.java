package CollectionsFramework.ListInterface.VectorStack;

import java.util.Stack;

//Code to Reverse a Stack
public class StackReversed {
    public static void
    pushAtBottom(Stack<Integer> integerStack, int data) {
        if (integerStack.isEmpty()) {
            integerStack.push(data);
            return;
        }

        int temp = integerStack.pop();
        pushAtBottom(integerStack, data);
        integerStack.push(temp);
    }

    public static void reverse(Stack<Integer> integerStack) {
        if (integerStack.isEmpty()) {
            return;
        }

        int top = integerStack.pop();
        reverse(integerStack);
        pushAtBottom(integerStack, top);
    }

    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        while (!integerStack.isEmpty()) {
            System.out.println(integerStack.pop());
        }
    }
}

/*Expected Output:

5
4
3
2
1

* */