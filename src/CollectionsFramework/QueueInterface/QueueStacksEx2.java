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
// // Implement stack using two queues
public class QueueStacksEx2 {
    public static void main(String[] args) {

    }
}

class Stack<T>
{
    Queue<T> q1, q2;

    // Constructor
    public Stack()
    {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }

    // Insert an item into the stack
    void add(T data)
    {
        // Move all elements from the first queue to the second queue
        while (!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.poll();
        }

        // Push the given item into the first queue
        q1.add(data);

        // Move all elements back to the first queue from the second queue
        while (!q2.isEmpty())
        {
            q1.add(q2.peek());
            q2.poll();
        }
    }

    // Remove the top item from the stack
    public T poll()
    {
        // if the first queue is empty
        if (q1.isEmpty())
        {
            System.out.println("Underflow!!");
            System.exit(0);
        }

        // return the front item from the first queue
        T front = q1.peek();
        q1.poll();

        return front;
    }
}