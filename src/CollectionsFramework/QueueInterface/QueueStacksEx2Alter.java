package CollectionsFramework.QueueInterface;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * An alternative approach that affects the pop operation’s time
 * complexity instead of the push operation.
 * <p> </p>
 * 1. To push an item into the stack, enqueue the item to the first queue.<p></p>
 * 2. To pop an item from the stack, move all elements from the first queue to the
 * second queue except the last element, and then return the last element after
 * moving all elements back to the first queue.
 */
public class QueueStacksEx2Alter {
    public static void main(String[] args) {
        int[] keys = {1, 2, 3, 4, 5};

        // insert the above keys into the stack
        StackQueueAlter<Integer> s = new StackQueueAlter<>();
        for (int key : keys) {
            s.add(key);
        }

        for (int i = 0; i <= keys.length; i++) {
            System.out.println(s.poll());
        }
    }
}

class StackQueueAlter<T> {
    Queue<T> q1, q2;

    // Constructor
    public StackQueueAlter() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }

    // Insert an item into the stack
    void add(T data) {
        // Push the given item into the first queue
        q1.add(data);
    }

    // Remove the top item from the stack
    public T poll() {
        // if the first queue is empty
        if (q1.isEmpty()) {
            System.out.println("Stack Underflow!!");
            System.exit(0);
        }

        // Move all elements except last from the first queue to the second queue
        T front = null;
        while (!q1.isEmpty()) {
            if (q1.size() == 1) {
                front = q1.peek();
            } else {
                q2.add(q1.peek());
            }

            q1.poll();
        }

        // Return the last element after moving all elements back to
        // the first queue
        while (!q2.isEmpty()) {
            q1.add(q2.peek());
            q2.poll();
        }

        return front;
    }
}

/*Expected Output:

5
4
3
2
1
Underflow!!

* */