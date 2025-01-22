package Generic;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericPriorityQueue<T> {

    private class Node {
        T data;
        int priority;

        Node(T data, int priority) {
            this.data = data;
            this.priority = priority;
        }
    }

    private final ArrayList<Node> queue;

    public GenericPriorityQueue() {
        queue = new ArrayList<>();
    }

    public void enqueue(T data, int priority) {
        Node newNode = new Node(data, priority);
        queue.add(newNode);
        queue.sort(Comparator.comparingInt(n -> n.priority));
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }
        return queue.removeFirst().data;
    }

    public T peek() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }
        return queue.getFirst().data;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        GenericPriorityQueue<String> priorityQueue = new GenericPriorityQueue<>();
        priorityQueue.enqueue("Low priority", 3);
        priorityQueue.enqueue("High priority", 1);
        priorityQueue.enqueue("Medium priority", 2);

        System.out.println("Top element is: " + priorityQueue.peek());
        System.out.println("Priority queue size is: " + priorityQueue.size());

        System.out.println("Dequeued element is: " + priorityQueue.dequeue());
        System.out.println("Priority queue size after dequeue is: " + priorityQueue.size());

        System.out.println("Is priority queue empty? " + priorityQueue.isEmpty());
    }
}
