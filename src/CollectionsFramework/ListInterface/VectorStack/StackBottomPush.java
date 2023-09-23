package CollectionsFramework.ListInterface.VectorStack;

import java.util.Stack;

//To push an element at the bottom of a Stack using Recursion
public class StackBottomPush {
    public static void
    pushAtBottom(Stack<Integer> integerStack, int data) {
        if(integerStack.isEmpty()) { // BaseCase is Actually pushing data
            integerStack.push(data);
            return;
        }

        int temp = integerStack.pop();
        pushAtBottom(integerStack, data);
        integerStack.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        pushAtBottom(integerStack, 4);

        while(!integerStack.isEmpty()) {
            System.out.println(integerStack.pop());
        }
    }
}

/*Expected Output:

3
2
1
4

* */