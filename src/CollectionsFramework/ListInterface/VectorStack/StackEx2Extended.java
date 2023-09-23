package CollectionsFramework.ListInterface.VectorStack;

import java.util.Stack;

public class StackEx2Extended {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        integerStack.push(6);

        while (!integerStack.isEmpty()) {
            System.out.println(integerStack.peek());
            integerStack.pop();
        }
    }
}

/*Expected Output:

6
5
4
3
2
1

* */