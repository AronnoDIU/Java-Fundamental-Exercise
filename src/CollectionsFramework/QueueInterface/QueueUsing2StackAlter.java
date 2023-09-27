package CollectionsFramework.QueueInterface;

import java.util.Stack;

public class QueueUsing2StackAlter {
    public static void main(String[] args) {
        int[] keys = {1, 2, 3, 4, 5};
        Queue2StackAlt<Integer> queue2StackAlt = new Queue2StackAlt<>();

        // insert the above keys
        for (int key : keys) {
            queue2StackAlt.add(key);
        }

        System.out.println(queue2StackAlt.remove());    // print 1
        System.out.println(queue2StackAlt.remove());    // print 2
    }
}

// Implement a queue using two stacks
class Queue2StackAlt<T> {
    private final Stack<T> stack1;
    private final Stack<T> stack2;

    // Constructor
    Queue2StackAlt() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Add an item to the queue
    public void add(T data) {
        // push item into the first stack
        stack1.push(data);
    }

    // Remove an item from the queue
    public T remove() {
        // if both stacks are empty
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Underflow!!");
            System.exit(0);
        }

        // if the second stack is empty, move elements from the first stack to it
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // return the top item from the second stack
        return stack2.pop();
    }
}

/*Expected Output:

1
2

* */