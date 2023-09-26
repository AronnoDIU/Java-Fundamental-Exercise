package CollectionsFramework.QueueInterface;

import java.util.ArrayDeque;
import java.util.Queue;

/** 1. Using Two Queues

 The idea is to implement the queue’s enqueue operation such that the last entered
 item always ends up at the queue’s front. To achieve this, we need an additional queue.

 1. To push an item into the stack, first move all elements from the first queue to the
 second queue, then enqueue the new item into the first queue, and finally move all
 elements back to the first queue. This ensures that the new item lies in front of
 the queue and hence would be the first one to be removed.

 2. To pop an item from the stack, return the front item from the first queue.
 */
// Implement stack using two queues
public class QueueStacksEx2 {
    public static void main(String[] args) {
        int[] keys = { 1, 2, 3, 4, 5 };

        // insert the above keys into the stack
        StackQueue<Integer> s = new StackQueue<>();
        for (int key: keys) {
            s.add(key);
        }

        for (int i = 0; i <= keys.length; i++) {
            System.out.println(s.poll());
        }
    }
}

class StackQueue<T> {
    Queue<T> queue1, queue2;

    // Constructor
    public StackQueue() {
        queue1 = new ArrayDeque<>();
        queue2 = new ArrayDeque<>();
    }

    // Insert an item into the stack
    void add(T data) {
        // Move all elements from the first queue to the second queue
        while (!queue1.isEmpty()) {
            queue2.add(queue1.peek());
            queue1.poll();
        }

        // Push the given item into the first queue
        queue1.add(data);

        // Move all elements back to the first queue from the second queue
        while (!queue2.isEmpty())
        {
            queue1.add(queue2.peek());
            queue2.poll();
        }
    }

    // Remove the top item from the stack
    public T poll() {
        // if the first queue is empty
        if (queue1.isEmpty())
        {
            System.out.println("Underflow!!");
            System.exit(0);
        }

        // return the front item from the first queue
        T front = queue1.peek();
        queue1.poll();

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