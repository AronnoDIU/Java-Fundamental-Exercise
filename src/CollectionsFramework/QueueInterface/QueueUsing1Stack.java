package CollectionsFramework.QueueInterface;

import java.util.Stack;

public class QueueUsing1Stack {
    public static void main(String[] args) {
        int[] keys = {1, 2, 3, 4, 5};
        Queue1Stack<Integer> queue1Stack = new Queue1Stack<>();

        // insert the above keys into the queue
        for (int EnhancedKey : keys) {
            queue1Stack.add(EnhancedKey);
        }

        System.out.println(queue1Stack.remove());    // print 1
        System.out.println(queue1Stack.remove());    // print 2
    }
}

// Implement a queue using a single stack
class Queue1Stack<T> {
    private final Stack<T> stack;

    // Constructor
    Queue1Stack() {
        stack = new Stack<>();
    }

    // Add an item to the queue
    public void add(T data) {
        // push item into the first stack
        stack.push(data);
    }

    // Remove an item from the queue
    public T remove() {
        // if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("Underflow!!");
            System.exit(0);
        }

        // pop an item from the stack
        T top = stack.pop();

        // if the stack becomes empty, return the popped item
        if (stack.isEmpty()) {
            return top;
        }

        // recursion
        T item = remove();

        // push popped item back into the stack
        stack.push(top);

        // return the result of dequeue() call
        return item;
    }
}

/*Expected Output:

1
2

* */