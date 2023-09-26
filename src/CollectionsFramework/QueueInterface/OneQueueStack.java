package CollectionsFramework.QueueInterface;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 2. Using one Queue with call Stack
 */
// We can also use an implicit stack (call stack) along with a queue to construct a stack
public class OneQueueStack {
    public static void main(String[] args) {
        int[] keys = {1, 2, 3, 4, 5};

        // insert the above keys into the stack
        StackOneQueueS<Integer> integerStackOneQueueS = new StackOneQueueS<>();

        for (int EnhancedKey : keys) {
            integerStackOneQueueS.add(EnhancedKey);
        }

        for (int i = 0; i <= keys.length; i++) {
            System.out.println(integerStackOneQueueS.poll());
        }
    }
}

class StackOneQueueS<T> {
    Queue<T> queueS;

    public StackOneQueueS() {
        queueS = new ArrayDeque<>();
    }

    // Insert an item into the stack
    public void add(T data) {
        queueS.add(data);
    }

    // Utility function to reverse contents of a queue
    private void reverseQueue() {
        // base case
        if (queueS.isEmpty()) {
            return;
        }

        /*hold the front element in the call stack and enqueue
         it again after the recursive call is over*/
        T front = queueS.peek();
        queueS.poll();

        reverseQueue();

        queueS.add(front);
    }

    // Remove the top item from the stack
    public T poll() {
        // if the queue is empty
        if (queueS.isEmpty()) {
            System.out.println("Underflow!!");
            System.exit(0);
        }

        // reverse the queue
        reverseQueue();

        // dequeue front element from the reversed queue
        T front = queueS.peek();
        queueS.poll();

        // revert the queue to the original state
        reverseQueue();

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