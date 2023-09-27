package CollectionsFramework.QueueInterface;

import java.util.Stack;

/**
 * 1. Using two stacks
 * <p>
 * The idea is to implement the queue’s enqueue operation so that the first entered element
 * always ends up at the top of the stack. To achieve this, we need an additional stack.
 * <p></p>
 * 1. To enqueue an item into the queue, first move all elements from the first stack to the
 * second stack, push the item into the first stack, and finally move all elements back
 * to the first stack. This ensures that the new item lies at the bottom of the stack
 * and hence would be the last one to be removed.<p></p>
 * 2. To dequeue an item from the queue, return the top item from the first stack.
 */
public class QueueUsing2Stack {
    public static void main(String[] args) {
        int[] keys = {1, 2, 3, 4, 5};
        Queue2StackImp<Integer> q = new Queue2StackImp<>();

        // insert the above keys
        for (int key : keys) {
            q.add(key);
        }

        System.out.println(q.remove());    // print 1
        System.out.println(q.remove());    // print 2
    }
}

// Implement a queue using two stacks
class Queue2StackImp<T> {
    private final Stack<T> stack1;
    private final Stack<T> stack2;

    // Constructor
    Queue2StackImp() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Add an item to the queue
    public void add(T data) {
        // Move all elements from the first stack to the second stack
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
//  the elements are exchanged between the stacks twice for every enqueue operation
        }

        // push item into the first stack
        stack1.push(data);

        // Move all elements back to the first stack from the second stack
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    // Remove an item from the queue
    public T remove() {
        // if the first stack is empty
        if (stack1.isEmpty()) {
            System.out.println("Underflow!!");
            System.exit(0);
        }

        // return the top item from the first stack
        return stack1.pop();
    }
}

/*Expected Output:

1
2

* */